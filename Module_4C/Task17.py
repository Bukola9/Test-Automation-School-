class Human:
    gender = "Male"
    Age ="20"

    def get_name(self):
        return self.gender+":"+self.Age

instance =Human()
print(instance.Age,instance.gender, instance.get_name())