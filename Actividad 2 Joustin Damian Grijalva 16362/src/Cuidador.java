public class Cuidador extends Persona{

    public Cuidador(String nombrePersona, int edad){
        super(nombrePersona, edad);
    }

    public void alimentarAnimales(){
        System.out.println("Por favor, alimente a los animales tres veces al día.\n");
    }

}
