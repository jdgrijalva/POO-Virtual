class MiClase:
    def __init__(self):
        self.__atributoPrivado= "Valor"
    
    def __hablar(self):
        print("hola, como estas")
      
objeto = MiClase()
print(objeto.__hablar())
#el ejercicio está mal a proposito para demostrar que no se puede
#llamar a una clase privada de la forma convencional