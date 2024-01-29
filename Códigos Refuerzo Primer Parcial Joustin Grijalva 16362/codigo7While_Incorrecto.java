import java.util.Scanner;

public class codigo7While_Incorrecto {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int suma = 0;
        int ingresar;

        while (ingresar >= 0){
            suma += ingresar;
            System.out.println("Ingrese un número");
            ingresar = lector.nextInt();
        }
        System.out.println("La suma es: "+ suma);

    }
}

//El bluce while no funciona debido a que el parámetro tiene que tener un valor obligatoriamente.