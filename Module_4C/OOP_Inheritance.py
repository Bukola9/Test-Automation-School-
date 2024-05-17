class vehicle:
    model = "Unknown"
    make = "Unknown"
    production_year = "1990"

    def print_vehicle_info(self):
        print("\n Vehicle{",self.model, ",", self.make + "}")


class Car (vehicle):
    Wheel_count = 4

    def __init__(self, make, model):
        self.model = model
        self.make = make
class Plane(vehicle):
    make = "aeroplane"
    model ="Donno"


car1 = Car("Toyota", "Camery")
car1.print_vehicle_info()

plane1=Plane()
plane1.print_vehicle_info()
