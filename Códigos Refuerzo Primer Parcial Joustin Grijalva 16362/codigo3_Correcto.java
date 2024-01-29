import java.util.Scanner;

public class codigo3_Correcto {

    public static void main(String[] args){
        Scanner escribir = new Scanner(System.in);
        System.out.println("Ingrese el nombre de su mascota: ");
        String nombreMascota = escribir.nextLine();
        System.out.println("Ingrese la edad de su mascota: ");
        int edadMascota = escribir.nextInt();

        escribir.nextLine(); //al escribir esta linea, se limpia el buffer, arreglando el problema

        System.out.println("Ingrese el nombre del dueño: ");
        String nombreCuidador = escribir.nextLine();
        System.out.println("Ingrese la cedula del dueño: ");
        int cedulaCuidador = escribir.nextInt();

        System.out.println("La mascota "+nombreMascota+", de "+edadMascota+" años de edad. Cuyo dueño es "+nombreCuidador+
                ", con cedula "+cedulaCuidador+".");
        escribir.close();

    }
}

