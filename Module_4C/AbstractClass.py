import abc


class IWebElement(metaclass=abc.ABCMeta):
    @abc.abstractmethod
    def get_name(self):
        pass


class DivElement(IWebElement):

        def get_name(self):
            return "div"



class Element(IWebElement):
        def get_name(self):
            return "div "


