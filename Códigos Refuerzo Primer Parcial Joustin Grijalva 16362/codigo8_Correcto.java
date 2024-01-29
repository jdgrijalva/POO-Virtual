import java.util.ArrayList;

public class codigo8_Correcto {

    public static void main(String[] args) {
        ArrayList lista = new ArrayList();

        lista.add("Manzana");
        lista.add(4);
        lista.add(3.14);
        lista.add('a');

        System.out.println(lista);

    }
}
//En lugar de usar el arreglo normal se debe usar el
//arraylist, con el cual se puede ingresar diferentes tipos de variables y con la lista de metodos del paquete del mismo
//nombre se puede realizar una gran cantidad de acciones sobre el arreglo, además es más facil desplegar sus datos
//al usar println e ingresar el nombre del arraylist como si de una variable se tratara.
