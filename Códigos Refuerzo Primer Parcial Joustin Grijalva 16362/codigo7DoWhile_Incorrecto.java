import java.util.Scanner;

public class codigo7DoWhile_Incorrecto {

    public static void main(String[] args) {
        String saludo = "Hola";
        String despedida = "Adios";
        String cara_feliz = ":)";
        char flag;

        Scanner lector = new Scanner(System.in);

        do {
            System.out.println("¿Qué desea imprimir?");
            System.out.println("1. Saludo");
            System.out.println("2. Despedida");
            System.out.println("3. Cara Feliz");
            int eleccion = lector.nextInt();

            if (eleccion == 1){
                System.out.println(saludo);
            } else if (eleccion == 2) {
                System.out.println(despedida);
            } else if (eleccion == 3) {
                System.out.println(cara_feliz);
            } else {
                System.out.println("Numero incorrecto, vuelva a intentar");
            }

            System.out.println("¿Desea volver al menu? (S/N)");
            flag = lector.next().charAt(0);


        } while (flag == 'S');

    }
}

//Aquí hay un error si el usuario ingresa 's' al querer volver a iniciar el bucle, terminando el programa,
//para corregirlo se le tiene que específicar que se puede usar tanto mayúscula como minúscula
