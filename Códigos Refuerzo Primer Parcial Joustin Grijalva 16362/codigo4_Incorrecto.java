import java.util.Scanner;

public class codigo4_Incorrecto {

    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int edad = lector.nextInt();
        lector.nextLine();
        System.out.println("Ingrese su cedula: ");
        int cedula = lector.nextInt();
        lector.nextLine();

        System.out.println("Su edad es "+edad+" años y su cedula es "+cedula+".");

        lector.close();
    }
    //el usuario hará lo que se le de la gana con el programa, lo que generará errores, al generarse un error
    //el programa termina subitamente.
}
