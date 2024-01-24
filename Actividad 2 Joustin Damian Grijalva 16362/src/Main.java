import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        boolean marca1 = false;
        boolean marca2 = false;
        boolean marca3 = false;
        boolean marca4 = false;

        Scanner scanner1 = new Scanner(System.in);
        while (!marca1) {
            try {
                //Cuidador
                System.out.println("Ingrese nombre: ");
                String nombreCuidador = scanner1.nextLine();

                System.out.println("Ingrese Edad: ");
                int edadCuidador = scanner1.nextInt();

                System.out.println("Ingrese Cedula: ");
                int cedulaCuidador = scanner1.nextInt();


                Cuidador cuidador1 = new Cuidador(nombreCuidador, edadCuidador);


                cuidador1.setCedula(cedulaCuidador);

                System.out.println("CUIDADOR");
                System.out.println("Nombre: " + cuidador1.nombrePersona);
                System.out.println("Edad: " + cuidador1.edad);
                System.out.println("Cédula: " + cuidador1.getCedula());
                System.out.println("Aviso: " + cuidador1.dormir());
                cuidador1.alimentarAnimales();
                marca1 = true;

            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Por favor solo ingresar valores enteros. Vuelva a intentar.");
                scanner1.nextLine();
            }
        }


        Scanner scanner2 = new Scanner(System.in);
        while (!marca2) {
            try {
                //Visitante

                System.out.println("Ingrese nombre: ");
                String nombreVisitante = scanner2.nextLine();

                System.out.println("Ingrese Edad: ");
                int edadVisitante = scanner2.nextInt();

                System.out.println("Ingrese Cedula: ");
                int cedulaVisitante = scanner2.nextInt();


                Visitante visitantes = new Visitante(nombreVisitante, edadVisitante);

                visitantes.setCedula(cedulaVisitante);

                System.out.println("VISITANTE");
                System.out.println("Nombre: " + visitantes.nombrePersona);
                System.out.println("Edad: " + visitantes.edad);
                System.out.println("Cédula: " + visitantes.getCedula());
                System.out.println("El visitante esta: " + visitantes.comer());
                System.out.println("El visitante puede:");
                visitantes.comprar();
                marca2 = true;

            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Por favor solo ingresar valores enteros. Vuelva a intentar.");
                scanner2.nextLine();
            }
        }


        Scanner scanner3 = new Scanner(System.in);
        while (!marca3) {
            try {
                //León

                System.out.println("Ingrese nombre: ");
                String nombreLeon = scanner3.nextLine();

                System.out.println("Ingrese edad: ");
                int edadLeon = scanner3.nextInt();

                System.out.println("Ingrese el numero de registro del animal: ");
                int registroLeon = scanner3.nextInt();

                Leon leon1 = new Leon(nombreLeon, edadLeon);

                leon1.setRegistro(registroLeon);

                System.out.println("LEON");
                System.out.println("Nombre: " + leon1.nombreAnimal);
                System.out.println("Edad: " + leon1.edad);
                System.out.println("Nro. Registro: " + leon1.getRegistro());
                leon1.rugir();
                leon1.cazar();
                marca3 = true;

            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingresar valores enteros. Vuelva a intentar");
                scanner3.nextLine();
            }
        }


        Scanner scanner4 = new Scanner(System.in);
        while (!marca4) {
            try{
                //pinguino

                System.out.println("Ingrese nombre: ");
                String nombrePinguino = scanner4.nextLine();

                System.out.println("Ingrese edad: ");
                int edadPinguino = scanner4.nextInt();

                System.out.println("Ingrese el numero de registro del animal: ");
                int registroPinguino = scanner4.nextInt();

                Pinguino pinguino1 = new Pinguino(nombrePinguino, edadPinguino);

                pinguino1.setRegistro(registroPinguino);
                System.out.println("PINGUINO");
                System.out.println("Nombre: " + pinguino1.nombreAnimal);
                System.out.println("Edad: " + pinguino1.edad);
                System.out.println("Nro. Registro: " + pinguino1.getRegistro());
                pinguino1.nadar();
                pinguino1.pezcar();
                marca4 = true;

            }catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingresar valores enteros. Vuelva a intentar");
                scanner4.nextLine();
            }
        }


    }

}