# import unittest  # 프레임 워크 불러옴


class TestCase:
    def __init__(self, name):
        self.name = name

    def setUp(self):
        pass

    def run(self):
        result = TestResult()
        result.testStarted()
        self.setUp()  # "setUp "
        method = getattr(self, self.name)  # { "testTemplateMethod", "testMethod" }
        method()  # "setUp testMethod "
        self.tearDown()  # "setUp testMethod tearDown "
        return result

    def testMethod(self):
        self.wasRun = 1

    def tearDown(self):
        pass


class TestResult:
    def __init__(self):
        self.runCount = 0

    def testStarted(self):
        self.runCount = self.runCount + 1

    def summary(self):
        # return "1 run, 0 failed"
        return "%d run, 0 failed" % self.runCount


class WasRun(TestCase):
    def __init__(self, name):
        TestCase.__init__(self, name)

    def setUp(self):
        self.wasRun = None
        self.log = "setUp "

    def testMethod(self):
        self.wasRun = 1
        self.log = self.log + "testMethod "

    def tearDown(self):
        self.log = self.log + "tearDown "

    def testBrokenMethod(self):
        raise Exception


class TestCaseTest(TestCase):
    def testTemplateMethod(self):
        test = WasRun("testMethod")
        test.run()
        assert "setUp testMethod tearDown " == test.log

    def testResult(self):
        test = WasRun("testMethod")
        result = test.run()
        assert "1 run, 0 failed" == result.summary()

    def testFailedResult(self):
        test = WasRun("testBrokenMethod")
        result = test.run()
        assert "1 run, 1 failed" == result.summary()


# TestCaseTest("testTemplateMethod").run()

# TestCaseTest("testResult").run()

TestCaseTest("testFailedResult").run()
