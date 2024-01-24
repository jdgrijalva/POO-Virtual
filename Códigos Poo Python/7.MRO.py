class A:
    def hablar(self):
        print("Hola desde A")
        
class B(A):
    def hablar(self):
        print("Hola desde B")

class F:
    def hablar(self):
        print("Hola desde F")
        
class C(F):
    def hablar(self):
        print("Hola desde C")
        
class D(B,C):
    def hablar(self):
        print("Hola desde D")
        
        
d = D()
B.hablar(d)
print(D.mro())

