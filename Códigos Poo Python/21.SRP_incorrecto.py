class Auto():
    def __init__(self):
        self.posicion= 0
        self.combustible= 100
    
    def mover(self, distancia):
        if self.combustible >= distancia/2:
            self.posicion += distancia
            self.combustible -= distancia/2
        else:
            print("No hay combustible suficiente")
    
    def agregar_combustible(self, cantidad):
        self.combustible += cantidad
        
    def obtener_combustible(self): #esto rompre el SRP al encargarse tanto del movimiento
        return self.combustible     #como del combustible al mismo tiempo