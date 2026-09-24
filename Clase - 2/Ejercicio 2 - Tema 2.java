interface Volador {
    void volar();
}

class PavoReal implements Volador {
    public void volar() {
        System.out.println("El pavo real vuela bajo y por poco tiempo.");
    }
}

class Avion implements Volador {
    public void volar() {
        System.out.println("El avión vuela alto a velocidad de crucero.");
    }
}

class MainPolimorfismo {
    public static void main(String[] args) {
        Volador[] voladores = { new PavoReal(), new Avion() };
        
        for (Volador v : voladores) {
            v.volar();
        }
    }
}