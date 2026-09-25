public class Figura {
    protected String nombre;

    // NOTA: Se decide no impedir la instanciación directa de Figura en esta clase 
    // porque las clases abstractas recién se ven en la Clase 7. Por ahora, Figura 
    // es una clase concreta que puede instanciarse, aunque su método calcularArea devuelva 0.
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public double calcularArea() {
        return 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}