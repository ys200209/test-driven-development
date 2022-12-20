class Sum:
    def __init__(self, param1, param2):
        self.param1 = param1
        self.param2 = param2

    def operation(self):
        print("operation 진입")
        print(self.param1 + self.param2)


exam = Sum(1000, 2000)
exam.operation()

exam2 = Sum(1000, "A")
exam2.operation()
