class Animal:
    group = "Mammal"
    can_walk =True

    def __init__(self,name):
        self.name=name

cat = Animal("Cat")
print(cat.name)
dog = Animal("Dog")
print(dog.name)

print(cat.group)
print(dog.group)