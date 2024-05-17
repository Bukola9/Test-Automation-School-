class User:
    __first_name = "Testify"
    __last_name ="QA"

    def get_name(self):
        return "User-" + self.__first_name


user = User()
print(user.get_name())
