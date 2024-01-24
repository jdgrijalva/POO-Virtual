class Ave:
    def volar(self):
        return "Estoy volando"
    
class Pinguino(Ave): #El principio se incumple al no poder realizar la clase heredada
    def volar(self):
        return "No puedo volar"
    
def hacer_volar(ave = Ave):
    return ave.volar()

print(hacer_volar(Pinguino()))