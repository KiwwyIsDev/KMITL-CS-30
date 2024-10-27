class Person:
    def __init__(self, name, amount) -> None:
        self.name = name
        self.amount = amount

    def wow(self):
        print(self.name)


John = Person("John", 100)
John.wow()

Niggest = Person("Niggest", 100)
Niggest.wow()

John.wow()
