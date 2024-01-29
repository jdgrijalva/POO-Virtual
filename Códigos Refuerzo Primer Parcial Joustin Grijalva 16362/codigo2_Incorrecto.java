public class codigo2_Incorrecto {
    public static int contador=5;

    public static void main(String[] args){
        codigo2_Incorrecto c1 = new codigo2_Incorrecto(); //aunque instanciar el contador sea lo correcto, no es necesario
        codigo2_Incorrecto c2 = new codigo2_Incorrecto(); //pues al ser estático se lo puede llamar de una forma más sencilla

        c1.contador = 10+c2.contador;

        System.out.println(c1.contador);
        System.out.println(c2.contador);

    }
}
