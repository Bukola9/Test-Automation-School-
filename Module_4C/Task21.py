class Human:
    leg_count =4


    def get_gender(self):
        return "unknown"

class man(Human):
    def get_gender(self):
        return "man"

class woman(Human):
    def get_gender(self):
        return "woman"



man1=man()
print(man1.get_gender())

woman1=woman()
print(woman1.get_gender())
