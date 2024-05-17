class Human:
    leg_count = 4
    can_walk = True

    def get_description(self):
        print("This is human")

    def get_leg_count(self):
        return self.leg_count

human = Human()
human.get_description()
print("Leg count:", human.get_leg_count())