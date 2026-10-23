class ListaEstatica {
    private int[] datos;
    private int cantidad;

    public ListaEstatica(int capacidad) {
        datos = new int[capacidad];
        cantidad = 0;
    }

    public void insertar(int valor) {
        if (cantidad == datos.length) {
            throw new IllegalStateException("La lista está llena");
        }
        datos[cantidad] = valor;
        cantidad++;
    }

    public int buscar(int valor) {
        for (int i = 0; i < cantidad; i++) {
            if (datos[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public void mostrar() {
        System.out.print("[");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(datos[i]);
            if (i < cantidad - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Inserta valor en indice, desplazando a la derecha los elementos desde indice
    public void insertarEnPosicion(int indice, int valor) {
        if (cantidad == datos.length) {
            throw new IllegalStateException("La lista está llena");
        }
        if (indice < 0 || indice > cantidad) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + indice);
        }
        for (int i = cantidad; i > indice; i--) {
            datos[i] = datos[i - 1];
        }
        datos[indice] = valor;
        cantidad++;
    }

    // Elimina el elemento en indice, desplazando a la izquierda los siguientes
    public void eliminarEnPosicion(int indice) {
        if (indice < 0 || indice >= cantidad) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + indice);
        }
        for (int i = indice; i < cantidad - 1; i++) {
            datos[i] = datos[i + 1];
        }
        cantidad--;
    }
}

public class Main {
    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica(6);

        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.insertar(40);
        System.out.print("Inicial:               ");
        lista.mostrar(); // [10, 20, 30, 40]

        lista.insertarEnPosicion(2, 99);
        System.out.print("Insertar 99 en pos 2:  ");
        lista.mostrar(); // [10, 20, 99, 30, 40]

        lista.insertarEnPosicion(0, 5);
        System.out.print("Insertar 5 en pos 0:   ");
        lista.mostrar(); // [5, 10, 20, 99, 30, 40]

        lista.eliminarEnPosicion(3);
        System.out.print("Eliminar pos 3:        ");
        lista.mostrar(); // [5, 10, 20, 30, 40]

        lista.eliminarEnPosicion(0);
        System.out.print("Eliminar pos 0:        ");
        lista.mostrar(); // [10, 20, 30, 40]

        // Pruebas de validación
        try {
            lista.insertarEnPosicion(10, 7);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            lista.eliminarEnPosicion(-1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            lista.eliminarEnPosicion(4); // cantidad es 4, el último índice válido es 3
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}