
package source;


public class Auto extends Vehiculo {

    public Auto(String color, String modelo, int velocidad) {
        super(color, modelo, velocidad);
    }
    
    
    public void acelerarAuto(){
        System.out.println("Acelerar\n");
    }
    
}
