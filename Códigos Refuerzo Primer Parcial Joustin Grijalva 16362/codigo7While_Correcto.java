import java.util.Scanner;

public class codigo7While_Correcto {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int suma = 0;
        int ingresar = 0;

        while (ingresar >= 0){
            suma += ingresar;
            System.out.println("Ingrese un número");
            ingresar = lector.nextInt();
        }
        System.out.println("La suma es: "+ suma);

    }
}

//El bluce while funciona como se espera que lo haga.
