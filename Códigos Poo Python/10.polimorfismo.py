class Animal():
    def sonido(self):
        pass

class Gato(Animal):
    def sonido(self):
        return "Miau"
    
class Perro(Animal):
    def sonido(self):
        return "Guau"
    
def hacerSonido(animal):
    print(animal.sonido())

gato = Gato()
perro = Perro()

print(gato.sonido())

hacerSonido(perro)