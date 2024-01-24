public class Pinguino extends Zoo{

    public Pinguino(String nombreAnimal, int edad){
        super(nombreAnimal, edad);
    }

    public void nadar(){
        System.out.println("El pinguino puede nadar.");
    }

    public void pezcar(){
        System.out.println("El pinguino esta ocupado pescando, vuelva más tarde.");
    }
}
