import java.util.Scanner;

public class codigo1_Correcto {
    public String nombre;
    private int cedula;

    public codigo1_Correcto(String nombre){
        this.nombre=nombre;
    }

    public int getCedula(){
        return this.cedula;
    }
    public void setCedula(int cedula){
        this.cedula = cedula;
    }


    public static void main(String[] args) {
        Scanner inputCedula = new Scanner(System.in);

        System.out.println("Ingrese la cedula del usuario Joustin");
        int cedulaUsuario = inputCedula.nextInt();

        codigo1_Correcto usuario = new codigo1_Correcto("Joustin");

        usuario.setCedula(cedulaUsuario);

        System.out.println("El nombre del usuario es: " + usuario.nombre);
        System.out.println("Su cedula es: " + usuario.getCedula());
    }
}

//En este ejemplo la asignación de datos en cedula es más precisa, al usar los métodos getter y setter se ha creado
//un codigo mucho más robusto y mejor controlado para el desarrollador