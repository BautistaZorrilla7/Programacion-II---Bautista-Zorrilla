class Persona {
    String nombre;
    int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void presentar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}

class MainPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Estudiante", 20);
        p1.presentar();
    }
}