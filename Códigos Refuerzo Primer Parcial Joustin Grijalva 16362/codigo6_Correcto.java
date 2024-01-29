public class codigo6_Correcto {
    String motoresTipo;
    double velocidadMaxima;


    public void describirMotor() {
        System.out.println("El motor " + motoresTipo);
    }

    public void verVelocidad() {
        System.out.println("Su velocidad maxima es: " + velocidadMaxima + " km/h");
    }


    public codigo6_Correcto(String motoresTipo, double velocidadMaxima) {
        this.motoresTipo = motoresTipo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public codigo6_Correcto(String motoresTipo) {
        this.motoresTipo = motoresTipo;
    }

    public codigo6_Correcto(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }


    public static void main(String[] args) {
        codigo6_Correcto Suzuki = new codigo6_Correcto("usa gasolina");
        codigo6_Correcto Tesla = new codigo6_Correcto(322);
        codigo6_Correcto Chevrolet = new codigo6_Correcto("usa gasolina", 150);

        Suzuki.describirMotor();
        Tesla.verVelocidad();

        Chevrolet.describirMotor();
        Chevrolet.verVelocidad();

    }

    //De esta forma se puede seleccionar como se puede visualizar la información de los motores de los vehículos,
    //la sobrecarga permite la reutilizar del mismo método para más situaciones, facilitando la lectura del código y
    //la interacción que se tiene con el programa.
}