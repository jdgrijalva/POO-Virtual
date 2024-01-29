public class codigo2_Correcto {
    public static int contador=5;

    public static void main(String[] args){
        codigo2_Correcto c1 = new codigo2_Correcto();
        codigo2_Correcto c2 = new codigo2_Correcto();

        c1.contador = 10+c2.contador;

        System.out.println(c1.contador);
        System.out.println(c2.contador);

    }
}
