from abc import ABC, abstractmethod

class Vehicle(ABC):
    @abstractmethod
    def drive_direction(self):
        pass

class Car(Vehicle):
    def drive_direction(self):
        return "The car drives on the road."

class Plane(Vehicle):
    def drive_direction(self):
        return "The plane flies in the sky."

# Instantiate the Car and Plane classes
car = Car()
plane = Plane()

# Invoke the drive_direction method and print the outputs
print(car.drive_direction())
print(plane.drive_direction())
