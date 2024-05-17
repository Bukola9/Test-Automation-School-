class Loginsession:
    __email = "user@mail.com"
    __password = "password"

    def get_email(self):
        return self.__email

    def get_password(self):
        return "********"

session=Loginsession()
print(session.get_password())
print(session.get_email())

