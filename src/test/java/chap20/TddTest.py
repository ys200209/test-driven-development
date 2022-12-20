# import unittest  # 프레임 워크 불러옴


class TestCase:
    def __init__(self, name):
        # print("부모 Constructor")
        self.name = name

    def setUp(self):
        pass

    def run(self):
        # print("부모 Executor 호출")
        self.setUp()  # "setUp "
        method = getattr(self, self.name)  # { "testTemplateMethod", "testMethod" }
        method()  # "setUp testMethod "
        self.tearDown()  # "setUp testMethod tearDown "

    def testMethod(self):
        self.wasRun = 1

    def tearDown(self):
        pass


class WasRun(TestCase):
    def __init__(self, name):
        # print("형제 Constructor 호출")
        TestCase.__init__(self, name)

    def setUp(self):
        self.wasRun = None
        # self.wasSetUp = 1
        self.log = "setUp "

    def testMethod(self):
        self.wasRun = 1
        self.log = self.log + "testMethod "

    def tearDown(self):
        self.log = self.log + "tearDown "


class TestCaseTest(TestCase):
    def testTemplateMethod(self):
        # print("자식 Executor 호출")
        test = WasRun("testMethod")
        # print("before LogMessage : ", test.log) # Null
        # print("형제 Executor 호출 직전")
        test.run()
        # print("after LogMessage : ", test.log)
        assert "setUp testMethod tearDown " == test.log


TestCaseTest("testTemplateMethod").run()
