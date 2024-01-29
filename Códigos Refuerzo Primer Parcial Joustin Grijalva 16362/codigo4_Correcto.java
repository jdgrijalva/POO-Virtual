import java.util.Scanner;

public class codigo4_Correcto {
    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);

        boolean flag= true;

        while(flag){
            try {
                System.out.println("Ingrese su edad: ");
                int edad = lector.nextInt();
                System.out.println("Ingrese su cedula: ");
                int cedula = lector.nextInt();
                System.out.println("Su edad es "+edad+" años y su cedula es "+cedula+".");

                flag= false;
            } catch (Exception e) {
                System.out.println("Use numeros enteros");
                lector.nextLine();
            }
        }
        lector.close();
    }
}

//ahora podemos estar seguros de que si el usuario ingresa algo mal, el programa se lo hará saber y le pedirá que llene
//lo pedido otra vez.
