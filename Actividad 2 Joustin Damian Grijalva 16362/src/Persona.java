
public abstract class Persona {
    public String nombrePersona;
    public int edad;
    private int cedula;

    public Persona(String nombrePersona, int edad) {
        this.nombrePersona = nombrePersona;
        this.edad = edad;
    }

    public int getCedula(){
        return cedula;
    }

    public int setCedula(int cedula){
        this.cedula=cedula;
        return 0;
    }

    public String comer(){
        return "Comiendo";
    }

    public String dormir(){
        return "Recuerde que está prohibido dormir en la seccion de los pinguinos.";
    }
}
