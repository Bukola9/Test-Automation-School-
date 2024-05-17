class Animal:
    name = "Cow"
    group ="mammal"

    def get_name_group(self):
        return self.name+":"+self.group


#object
cow =Animal()
print(cow.name, cow.group,cow.get_name_group())

cow2=Animal()
cow3=Animal()
cow4=Animal()

