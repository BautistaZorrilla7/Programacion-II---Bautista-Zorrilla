import java.util.ArrayList;

class ManejoListas {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Sofía");

        System.out.println("Lista de nombres:");
        for (String nombre : nombres) {
            System.out.println("- " + nombre);
        }
        
        System.out.println("Total de elementos: " + nombres.size());
    }
}