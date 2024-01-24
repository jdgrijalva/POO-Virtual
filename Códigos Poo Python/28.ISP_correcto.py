from abc import ABC, abstractmethod

class Trabajador(ABC):

    @abstractmethod
    def trabajar(self):
        pass

class Comedor(ABC):
    
    @abstractmethod
    def comer(self):
        pass
    
class Durmiente(ABC):
    
    @abstractmethod
    def dormir(self):
        pass
    
class Humano(Trabajador, Comedor, Durmiente):
    def comer(self):
        print("El humano esta comiendo")
        
    def trabajar(self):
        print("El humano está trabajando")
    
    def dormir(self):
        print("El humano está durmiendo")
        
class Robot(Trabajador):
    def trabajar(self):
        print("El robot está trabajando")
  
    
robot = Robot()
robot.trabajar()

humano = Humano()
humano.comer()