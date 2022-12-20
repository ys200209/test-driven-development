# import unittest  # 프레임 워크 불러옴


class TestCase:
    def __init__(self, name):
        self.name = name

    def setUp(self):
        pass

    def run(self, result):
        # result = TestResult()
        result.testStarted()
        self.setUp()  # "setUp "
        try:
            method = getattr(self, self.name)  # { "testTemplateMethod", "testMethod" }
            method()  # "setUp testMethod "
        except:
            result.testFailed()
        self.tearDown()  # "setUp testMethod tearDown "
        # return result

    def testMethod(self):
        self.wasRun = 1

    def tearDown(self):
        pass


class TestResult:
    def __init__(self):
        self.runCount = 0
        self.failureCount = 0

    def testStarted(self):
        self.runCount = self.runCount + 1

    def testFailed(self):
        self.failureCount = self.failureCount + 1

    def summary(self):
        # return "1 run, 0 failed"
        return "%d run, %d failed" % (self.runCount, self.failureCount)


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


class TestSuite:
    def __init__(self):
        self.tests = []  # 테스트들을 담을 리스트 컬렉션

    def add(self, test):
        self.tests.append(test)

    # def run(self):
    #     result = TestResult()  # 테스트 결과 보고서 생성
    #     for test in self.tests:  # 테스트들 순회
    #         test.run(result)  # 테스트마다 동일한 보고서에 기록하도록 하기 위함
    #
    #     return result  # 보고서 반환

    def run(self, result):
        for test in self.tests:  # 테스트들 순회
            test.run(result)  # 테스트마다 동일한 보고서에 기록하도록 하기 위함


class TestCaseTest(TestCase):
    def testTemplateMethod(self):
        test = WasRun("testMethod")
        result = TestResult()
        test.run(result)
        assert "setUp testMethod tearDown " == test.log

    def testResult(self):
        test = WasRun("testMethod")
        result = TestResult()
        test.run(result)
        assert "1 run, 0 failed" == result.summary()

    def testFailedResult(self):
        test = WasRun("testBrokenMethod")
        result = TestResult()
        test.run(result)
        assert "1 run, 1 failed" == result.summary()

    def testFailedResultFormatting(self):
        result = TestResult()
        result.testStarted()
        result.testFailed()
        assert "1 run, 1 failed" == result.summary()

    def testSuite(self):
        suite = TestSuite()
        suite.add(WasRun("testMethod"))
        suite.add(WasRun("testBrokenMethod"))
        # result = suite.run()
        result = TestResult()
        suite.run(result)
        print(result.summary())
        assert "2 run, 1 failed" == result.summary()


# TestCaseTest("testTemplateMethod").run()
# TestCaseTest("testResult").run()
# TestCaseTest("testFailedResult").run()
# TestCaseTest("testFailedResultFormatting").run()

suite = TestSuite()
suite.add(TestCaseTest("testTemplateMethod").run())
suite.add(TestCaseTest("testResult").run())
suite.add(TestCaseTest("testFailedResult").run())
suite.add(TestCaseTest("testFailedResultFormatting").run())
suite.add(TestCaseTest("testSuite").run())

result = TestResult()
suite.run(result)
print (result.summary())