import java.util.Scanner;

public class codigo3_Incorrecto {

    public static void main(String[] args){
        Scanner escribir = new Scanner(System.in);
        System.out.println("Ingrese el nombre de su mascota: ");
        String nombreMascota = escribir.nextLine();
        System.out.println("Ingrese la edad de su mascota: ");
        int edadMascota = escribir.nextInt();

        System.out.println("Ingrese el nombre del dueño: ");
        String nombreCuidador = escribir.nextLine();
        System.out.println("Ingrese la cedula del dueño: ");
        int cedulaCuidador = escribir.nextInt();

        System.out.println("La mascota "+nombreMascota+", de "+edadMascota+" años de edad. Cuyo dueño es"+nombreCuidador+
                ", con cedula "+cedulaCuidador+".");
        escribir.close();

    }

    //Aunque el programa reconoce que no hay problemas en el código, al momento de usarlo no dejará al usuario llenar
    //el campo de nombreCuidador y no desplagará nada en ese espacio, esto debido a que el buffer se tiene que limpiar
    //ya que se llena al ingresar el entero en edadMascota.
}
