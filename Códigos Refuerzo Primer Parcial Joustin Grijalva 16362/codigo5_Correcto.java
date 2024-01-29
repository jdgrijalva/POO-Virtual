public class codigo5_Correcto {
    String motoresTipo;
    double velocidadMaxima;


    public void describirMotor(){
        System.out.println("El motor "+motoresTipo);
    }

    public void verVelocidad(){
        System.out.println("Su velocidad maxima es: "+velocidadMaxima+ " km/h");
    }


    public codigo5_Correcto(String motoresTipo, double velocidadMaxima){
        this.motoresTipo = motoresTipo;
        this.velocidadMaxima = velocidadMaxima;
    }


    public static void main(String[] args){
        codigo5_Correcto Suzuki = new codigo5_Correcto("usa gasolina", 240);
        codigo5_Correcto Tesla = new codigo5_Correcto("usa electricidad", 322);

        Suzuki.describirMotor();
        Suzuki.verVelocidad();

        Tesla.describirMotor();
        Tesla.verVelocidad();

    }

    //En este codigo se implementa el polimorfismo, lo que nos permite crear una infinidad de variantes de los mismos
    //objetos basados en una plantilla, lo que hace al codigo más personalizable, facil de leer y editar
}





