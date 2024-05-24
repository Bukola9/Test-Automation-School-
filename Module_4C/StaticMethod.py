class Calculator:
    def add(num1, num2):
        return num1+num2

    @staticmethod
    def multiply(num1, num2):
        return num1+num2



Calculator.add= staticmethod(Calculator.add)

print("1+1 =", Calculator.add(1 , 1))
print("2*2 =", Calculator.multiply(2 , 2))