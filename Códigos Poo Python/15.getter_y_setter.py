class Usuario:
    def __init__(self, nombre, edad):
        self.__nombre = nombre
        self.__edad = edad
    
    def get_nombre(self):
        return self.__nombre
    
    def set_nombre(self, new_nombre):
        self.__nombre = new_nombre
        
usuario1 = Usuario("Joustin", 20)

nombre = usuario1.get_nombre()
print(nombre)

usuario1.set_nombre("Juan")

nombre = usuario1.get_nombre()
print(nombre)