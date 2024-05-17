class Vehicle:
    def drive_direction(self):
        print("drive forward")


class Plane(Vehicle):
    def drive_direction(self):
        print("drive upward")

class Submarine(Vehicle):
    def drive_direction(self):
        print("drive Downward")



vehicle =Vehicle()
vehicle.drive_direction()

plane =Plane()
plane.drive_direction()

submarine = Submarine()
submarine.drive_direction()