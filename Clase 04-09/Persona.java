import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    public long dinero;

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento, long dinero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.dinero = dinero;
    }

    public int calcularEdad() {
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(this.fechaNacimiento, hoy);
        return periodo.getYears();
    }

    public String Saludo() {
        return "Hola soy " + this.nombre + " " + this.apellido + " y tengo " + calcularEdad() + " años.";
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        if (fechaNacimiento != null && fechaNacimiento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser una fecha futura.");
        }
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío o en blanco.");
        }
        this.nombre = nombre;
    }
}