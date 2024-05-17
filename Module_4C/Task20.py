class Human:
    leg_count =4


    def get_gender(self):
        return "unknown"

class man(Human):
    pass

class woman(Human):
    pass




man1=man()
print(man1.get_gender())

woman1=woman()
print(woman1.get_gender())
