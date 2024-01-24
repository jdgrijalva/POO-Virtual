class Persona:
    def __init__(self, nombre, edad, nacionalidad):
        self.nombre=nombre
        self.edad=edad
        self.nacionalidad=nacionalidad
    
    def hablar(self):
        print ("Hola, estoy hablando")

class Artista:
    def __init__(self, habilidad):
        self.habilidad=habilidad
        
    def mostrar_habilidad(self):
        return f"Mi habilidad es: {self.habilidad}"
        
class EmpleadoArtista(Persona, Artista):
    def __init__(self, nombre, edad, nacionalidad, habilidad, empresa, salario):
        Persona.__init__(self, nombre, edad, nacionalidad)
        Artista.__init__(self, habilidad)
        self.empresa=empresa
        self.salario=salario
        
        
    def presentarse(self):
        print(f'Hola, soy: {self.nombre}, {super().mostrar_habilidad()} y trabajo en {self.empresa}')

roberto = EmpleadoArtista("Roberto", 20, "ecuatoriano", "dibujar", "programador", "4500")

herencia = issubclass(EmpleadoArtista, Artista)
instancia = isinstance(roberto, Persona)

print(herencia)
print(instancia)