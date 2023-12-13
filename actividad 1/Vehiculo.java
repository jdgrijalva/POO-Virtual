
package source;


public abstract class Vehiculo {
    String color;
    String modelo;
    private int velocidad;
    
    public Vehiculo(String color, String modelo, int velocidad){
        this.color = color;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    
    public void detalleVehiculo(){
        System.out.println("DETALLES:");
        System.out.println("Color: " + color);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad + "km/h");
    }
}
