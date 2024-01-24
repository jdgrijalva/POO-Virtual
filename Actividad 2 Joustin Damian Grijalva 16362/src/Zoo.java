public abstract class Zoo {
    public String nombreAnimal;
    public int edad;
    private int registro;

    public Zoo(String nombreAnimal, int edad){
        this.nombreAnimal=nombreAnimal;
        this.edad=edad;
    }

    public int getRegistro(){
        return registro;
    }

    public int setRegistro(int registro){
        this.registro = registro;
        return 0;
    }

}
