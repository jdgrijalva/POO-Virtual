
package source;


public class Motocicleta extends Vehiculo{
    
    public Motocicleta (String color, String modelo, int velocidad) {
        super(color, modelo, velocidad);
    }
    
    public void usarCasco(){
        System.out.println("Usar casco es obligatorio\n");
    }
    
}
