public class MainSueldos {
    public static void main(String[] args) {
        // Instanciar un objeto de cada subclase
        EmpleadoPorHoras empleadoHoras = new EmpleadoPorHoras("Carlos Gómez", 301, 160, 1200.0);
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Lucía Pérez", 302, 450000.0, 50000.0);

        // Mostrar el sueldo calculado para cada uno
        System.out.println("Empleado por horas (" + empleadoHoras.getNombre() + "): $" + empleadoHoras.calcularSueldo());
        System.out.println("Empleado asalariado (" + empleadoAsalariado.getNombre() + "): $" + empleadoAsalariado.calcularSueldo());
    }
}