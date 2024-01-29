public class codigo5_Incorrecto {

    public static void main(String[] args) {
        class motorElectrico {
            String descripcion = "Este motor usa electricidad";
        }

        class motorGasolina {
            String descripcion = "Este motor usa gasolina";
        }

        motorElectrico motorElectrico = new motorElectrico();
        System.out.println(motorElectrico.descripcion);
        motorGasolina motorGasolina = new motorGasolina();
        System.out.println(motorGasolina.descripcion);

    }

    //El código no implementa el polimorfismo, hacerlo de esta manera es poco eficiente, tosco, y se complica la lectura y
    //futura modificación del codigo.
}
