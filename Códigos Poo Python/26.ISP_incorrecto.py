from abc import ABC, abstractmethod

class Trabajador(ABC):
    
    @abstractmethod
    def comer(self):
        pass
    
    @abstractmethod
    def trabajar(self):
        pass
    
    @abstractmethod
    def dormir(self):
        pass
    
class Humano(Trabajador):
    def comer(self):
        print("El humano esta comiendo")
        
    def trabajar(self):
        print("El humano está trabajando")
    
    def dormir(self):
        print("El humano está durmiendo")
        
class Robot(Trabajador): #El principio se incumple al tener interfaces que no se van a usar
    def comer(self):
        pass
    
    def trabajar(self):
        print("El humano está trabajando")
    
    def dormir(self):
        pass
    
robot = Robot()