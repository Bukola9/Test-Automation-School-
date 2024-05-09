print("Break\n")
number =5
for i in range(number):
    if i==3:
        break
    print("Number ", i)

while number>0:
    if number == 3:
        break
    print("While: Number ", number)
    number-=1



print("\ncontinue\n")

number =5
for i in range(number):
    if i==3:
        continue
    print("Number ", i)


while number>0:
    if number == 3:
        number -= 1
        continue
    print("While: Number ", number)
    number-=1

print("\nelse\n")
number=5
for i in range(number):
    print("for:Number:", i)
else:
    print("for: end of the loop")

while number>0:
    print("While: Number ", number)
    number-=1
else:
    print("While: end of loop")


print("\nforandelse\n")
number =5
for i in range(number):
    if i==3:
        continue
    print("Number ", i)
else:
    print("For: end of loop")

print("\nelse and break\n")
number =5
for i in range(number):
    if i==3:
        break
    print("Number ", i)
else:
    print("For: end of loop")

while number>0:
    if number == 3:
        break
    print("While: Number ", number)
    number-=1
else:
    print("While: end of loop")


