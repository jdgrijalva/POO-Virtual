class Persona:
    def __init__(self, nombre, edad):
        self.nombre=nombre
        self.edad=edad
    
    def __str__(self):
        return f'Persona(nombre={self.nombre}, edad={self.edad})'
    
    def __repr__(self):
        return f'Persona("{self.nombre}", {self.edad})'
    
    def __add__(self, otro):
        nuevo_valor = self.edad + otro.edad
        return Persona(self.nombre+otro.nombre, nuevo_valor)
    
usuario = Persona("Joustin", 20)
usuario2 = Persona("Juan", 30)
usuario3 = Persona("Alicia", 25)

resultado = usuario + usuario2 + usuario3
print(resultado.nombre)