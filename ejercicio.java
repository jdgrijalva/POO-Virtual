public class ejercicio {
    public static void main(String[] args) {
        class Persona {
            public String nombre;
            public  String apellido;
            public int edad;
            private int id;
        

        public Persona(String nombre, String apellido, int edad){
                this.nombre = nombre;
                this.apellido = apellido;
                this.edad = edad;
            }
    
        public int getId(){
            return id;
            }

        public void setId (int id){
            this.id = id;
        }
    
        }
    }
}
