from abc import ABC, abstractmethod

class VerificadorOrtografia(ABC):
    @abstractmethod
    def verificar_palabra(self, palabra):
        pass
    
class Diccionario(VerificadorOrtografia):
    def verificar_palabra(self, palabra):
        pass
    
class CorrectorOrtografía:
    def __init__(self, verificador):
        self.verificador = verificador
        
    def corregir_texto(self, texto):
        pass
    
corrector = CorrectorOrtografía(Diccionario())