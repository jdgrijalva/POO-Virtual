public class codigo6_Incorrecto {
    String motoresTipo;
    double velocidadMaxima;


    public void describirMotor() {
        System.out.println("El motor " + motoresTipo);
    }

    public void verVelocidad() {
        System.out.println("Su velocidad maxima es: " + velocidadMaxima + " km/h");
    }


    public codigo6_Incorrecto(String motoresTipo, double velocidadMaxima) {
        this.motoresTipo = motoresTipo;
        this.velocidadMaxima = velocidadMaxima;
    }


    public static void main(String[] args) {
        codigo6_Incorrecto Suzuki = new codigo6_Incorrecto("usa gasolina");
        codigo6_Incorrecto Tesla = new codigo6_Incorrecto(322);

        Suzuki.describirMotor();

        Tesla.verVelocidad();

    }
}
//El código 5 puede dar errores cuando se quiere ser selectivo con lo que se quiere ejecutar, esto debido a que
//obligatoriamente se tienen que llenar el campo de tipo de motores y el de la velocidad máxima, para solucionar este
//error se usa la sobrecarga de métodos.