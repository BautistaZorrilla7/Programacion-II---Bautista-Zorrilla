class Vehiculo {
    String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public void encender() {
        System.out.println("El vehículo " + marca + " está encendido.");
    }
}

class Auto extends Vehiculo {
    int cantidadPuertas;

    public Auto(String marca, int cantidadPuertas) {
        super(marca);
        this.cantidadPuertas = cantidadPuertas;
    }

    public void mostrarInfo() {
        System.out.println("Auto marca: " + marca + ", Puertas: " + cantidadPuertas);
    }
}

class MainHerencia {
    public static void main(String[] args) {
        Auto miAuto = new Auto("Toyota", 4);
        miAuto.encender();
        miAuto.mostrarInfo();
    }
}