public class Visitante extends Persona{
    public int nCarnet;

    public Visitante(String nombrePersona, int edad){
        super(nombrePersona, edad);
        this.nCarnet=nCarnet;
    }

    public void comprar(){
        System.out.println("Comprar mercancía.\n");
    }

}
