from abc import ABC, abstractclassmethod

class Persona(ABC):
    @abstractclassmethod
    def __init__(self, nombre, edad, sexo, actividad):
            self.nombre= nombre
            self.edad= edad
            self.sexo= sexo
            self.actividad= actividad
            
    @abstractclassmethod
    def hacer_actividad(self):
        pass
    
    def presentarse(self):
        print(f"Hola, me llamo: {self.nombre} y tengo {self.edad} años")

class Estudiante(Persona):
    def __init__(self, nombre, edad, sexo, actividad):
        super().__init__(nombre, edad, sexo, actividad)
        
    def hacer_actividad(self):
         print(f"Estoy estudiando: {self.actividad}")
         
class Trabajador(Persona):
    def __init__(self, nombre, edad, sexo, actividad):
        super().__init__(nombre, edad, sexo, actividad)
        
    def hacer_actividad(self):
         print(f"Estoy trabajando de: {self.actividad}")
        
usuario1 = Estudiante("Joustin", 20, "Masculino", "OOP")
usuario2 = Trabajador("Alicia", 30, "Femenino", "Ingeniera")

usuario1.presentarse()
usuario1.hacer_actividad()

usuario2.presentarse()
usuario2.hacer_actividad()