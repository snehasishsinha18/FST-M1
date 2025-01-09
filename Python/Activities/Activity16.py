class car:
    'This class represents a car'
    def __init__ (self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color=color
    def accelarate(self):
        print(self.manufacturer+""+self.model+""+"moving")
    def stop(self):
        print(self.manufacturer+""+self.model+""+"stooped")
car1 = car("honda","city","2022","auto","blue")
car2 = car("Jeep","compass","2021","auto","black")
car3 = car("Kia","Seltos","2023","auto","red")

car1.accelarate()
car1.stop()

    
        