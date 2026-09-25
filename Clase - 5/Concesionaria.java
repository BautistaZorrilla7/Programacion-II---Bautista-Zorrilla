import java.util.ArrayList;
import java.util.List;

public class Concesionaria {
    private String nombre;
    private List<Vehiculo> vehiculos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    public Vehiculo buscarPorMarca(String marca) {
        for (Vehiculo v : this.vehiculos) {
            if (v.getMarca().equalsIgnoreCase(marca)) {
                return v;
            }
        }
        return null;
    }

    public double valorTotalStock() {
        double total = 0;
        for (Vehiculo v : this.vehiculos) {
            total += v.getPrecio();
        }
        return total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}