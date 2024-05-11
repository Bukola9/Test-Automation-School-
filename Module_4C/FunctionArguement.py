print("parameters")

#required parameters
def greet(name):
    print("Hello ", name)
greet("Testify")

#default parameters
def add(num1=20, num2=15):
    result =num1+num2
    print("result", result)
add()
add(5)
add(5,5)

#keyword arguement
def minus(num1, num2):
    result = num2-num1
    print("Result", result)
minus(num2=10, num1=5)
minus(num1=20, num2=50)

#arbitary arguement
def print_value(*args):
    print("Args", args)
print_value()
print_value(1)
print_value(1,2)
print_value(1,2,3)

#arbitary keyword parameters
def print_kvalue(**kargs):
    print("Args:", kargs['num1'],kargs['num2'])
print_kvalue(num1=20, num2=10)


#Return Statement

def add_and_return(num1, num2):
    result =num1+num2
    return result
res= add_and_return(50,50)
print("50+50:", res)