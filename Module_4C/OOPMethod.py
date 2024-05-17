class Animal:

    group = "Mammal"
    leg_count = 4

    #default Constructor
    def __init__(self):
        self.name = "Unknown"


class Vehicle:

    can_fly = False
    tire_count = 4

    #parameterized constructor
    def __init__(self, make):
        self.make = make

    def set_tire_count(self, count):
        self.tire_count = count

    def set_flyable(self, cfly):
        self.can_fly = cfly

    def get_make_tire_count(self):
        return self.make + ":" + str(self.tire_count)

    def check_type(self):
        if self.make == "Aeroplane":
            print("this is a plane")
        else:
            print("this is likely a car")






animal = Animal()
print("Animal:", animal.name, animal.group)

toyota = Vehicle("toyota")
print("\nVehicle", toyota.make, toyota.can_fly)
print(toyota.check_type())

plane = Vehicle("Aeroplane")
plane.set_tire_count(3)
plane.set_flyable(True)
print("\nVehicle", plane.make, plane.tire_count)
print(plane.get_make_tire_count())
print(plane.check_type())