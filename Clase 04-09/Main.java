import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate nacimiento = LocalDate.of(2006, 1, 27);
        Persona p1 = new Persona("Bautista", "Zorrilla", nacimiento, 100);
        
        String mensaje = p1.Saludo();
        System.out.println(mensaje);

        try {
            long calculoDinero = 100 / p1.dinero;
            System.out.println("Cálculo exitoso: " + calculoDinero);
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e.getMessage());
        }

        try {
            p1.setFechaNacimiento(LocalDate.now().plusDays(1));
        } catch (IllegalArgumentException e) {
            System.out.println("Error al asignar fecha: " + e.getMessage());
        }

        try {
            int divisionPorCero = 4 / 0;
            System.out.println(divisionPorCero);
        } catch (ArithmeticException e) {
            System.out.println("División por cero detectada: " + e.getMessage());
        }

        try {
            p1.setNombre("   ");
        } catch (IllegalArgumentException e) {
            System.out.println("Error al asignar el nombre: " + e.getMessage());
        }
    }
}
