public class codigo1_Incorrecto {
    public String nombre;
    private int cedula;

    public codigo1_Incorrecto(String nombre, int cedula){
        this.nombre=nombre;
        this.cedula=cedula;
    }
    //Aunque el compilador no considere la linea 7 como error, esto es una mala práctica,
    //pues lo correcto es que al momento de tratar con variables privadas lo mejor es usar los métodos getter y setter
    //al permitirnos mayor control al asignar valores y datos, lo que es importante dado la naturaleza cerrada del
    //modificador private.
    public void Presentacion(){
        System.out.println("Mi nombre es: " +nombre);
        System.out.println("Mi cedula es: " +cedula);
    }

    public static void main(String[] args){
        codigo1_Incorrecto usuario=new codigo1_Incorrecto("Joustin", 1726012782);

        usuario.Presentacion();
    }
}

//El código se ejecuta con normalidad, sin embargo el problema yace en el modificador de acceso de la variable "cedula",
