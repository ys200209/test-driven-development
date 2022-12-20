# import unittest  # 프레임 워크 불러옴


class TestCase:
    def __init__(self, name):
        self.name = name

    def run(self):
        self.setUp()
        method = getattr(self, self.name)
        method()

    def testMethod(self):
        self.wasRun = 1


class WasRun(TestCase):
    def __init__(self, name):
        TestCase.__init__(self, name)

    def setUp(self):
        self.wasRun = None
        self.wasSetUp = 1


class TestCaseTest(TestCase):
    def setUp(self):
        self.test = WasRun("testMethod")
        self.test.run()

    def testRunning(self):
        assert self.test.wasRun

    def testSetUp(self):
        assert self.test.wasSetUp


TestCaseTest("testRunning").run()

TestCaseTest("testSetUp").run()
