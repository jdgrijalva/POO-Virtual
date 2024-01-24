class Usuario:
    def __init__(self, nombre, edad):
        self.__nombre = nombre
        self.__edad = edad
    
    @property
    def nombre(self):
        return self.__nombre
    
    @nombre.setter
    def nombre(self, new_nombre):
        self.__nombre= new_nombre
    
    @nombre.deleter
    def nombre(self):
        del self.__nombre
        
usuario1 = Usuario("Joustin", 20)

nombre = usuario1.nombre
print(nombre)

usuario1.nombre= "Juan"

nombre = usuario1.nombre
print(nombre)

del usuario1.nombre

print("Hola Mundo")