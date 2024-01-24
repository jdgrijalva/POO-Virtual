class Persona:
    def __init__(self, nombre, edad):
        self.nombre=nombre
        self.edad=edad
    
    def imprimirNombre(self):
        print(f"El nombre del estudiante es: {self.nombre}")
        
    def imprimirEdad(self):
        print(f"La edad del estudiante es: {self.edad}")

class Estudiante(Persona):
    def __init__(self, nombre, edad, semestre):
        super().__init__(nombre, edad)
        self.semestre=semestre
    
    def imprimirSemestre(self):
        print(f"El estudiante va al {self.semestre} semestre")
    
estudiante = Estudiante("Joustin", 20, "2do")
estudiante.imprimirNombre()
estudiante.imprimirEdad()
estudiante.imprimirSemestre()