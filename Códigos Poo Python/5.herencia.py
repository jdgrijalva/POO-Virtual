class Persona:
    def __init__(self, nombre, edad, nacionalidad):
        self.nombre=nombre
        self.edad=edad
        self.nacionalidad=nacionalidad
    
    def hablar(self):
        print("Hola, estoy hablando")
        
class Empleado(Persona):
    def __init__(self, nombre, edad, nacionalidad, trabajo, salario):
        super().__init__(nombre,edad,nacionalidad)
        self.trabajo=trabajo
        self.salario=salario

class Estudiante(Persona):
    def __init__(self, nombre, edad, nacionalidad, notas, universidad):
        super().__init__(nombre, edad, nacionalidad)
        self.notas=notas
        self.universidad=universidad
        
class Jefe(Persona):
    def __init__(self, nombre, edad, nacionalidad, perdidas, ganancias):
        super().__init__(nombre, edad, nacionalidad)
        self.perdidas=perdidas
        self.ganancias=ganancias

roberto = Empleado("Roberto", 20, "ecuatoriano", "programador", 4000)

roberto.hablar()