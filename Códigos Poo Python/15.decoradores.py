def decorador(funcion):
    def funcion_modificada():
        print("Antes de llamar a la funcion")
        funcion()
        print("Despues de llmar a la funcion")
    return funcion_modificada

#def saludo():
#    print("Hola Joustin")
    
#saludo_modificado = decorador(saludo)
#saludo_modificado()

@decorador
def saludo():
    print("Hola Joustin, como estás?")

saludo()