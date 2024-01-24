class Diccionario:
    def verificar_palabra(self, palabra):
        #verificar palabras
        pass
    
class Corrector:
    def __init__(self):
        self.diccionario = Diccionario()
        #usar diccionario para corregir textos, aqui se rompe el princio al depender de una clase menor
    def corregir_texto(self, texto):
        pass