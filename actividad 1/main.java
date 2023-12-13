
package source;


public class main {
    public static void main(String[] args){
        Auto auto = new Auto("Rojo", "BMW", 45);
        Motocicleta moto = new Motocicleta("Azul", "Yamaha", 60);
        
        
        auto.detalleVehiculo();
        auto.acelerarAuto();
        
        moto.detalleVehiculo();
        moto.usarCasco();
    }
}
