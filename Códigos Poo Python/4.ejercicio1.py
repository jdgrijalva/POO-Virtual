class Estudiante:
    def __init__(self, nombre, edad, semestre):
        self.nombre = nombre
        self.edad = edad
        self.semestre = semestre
    
    def estudiar(self):
        print(f'El estudiante {self.nombre} está estudiando')
        
nombre = input("Ingrese su nombre: ")
edad = input("Ingrese su edad: ")
semestre = input("Ingrese su semestre: ")
        
estudiante = Estudiante(nombre, edad, semestre)

print(f""" 
      El estudiante se llama: {estudiante.nombre}\n
      La edad del estudiante es: {estudiante.edad}\n
      El estudiante esta en semestre: {estudiante.semestre}\n
      """)

while True:
    estudiar = input()
    if (estudiar.lower() == "estudiar"):
        estudiante.estudiar()