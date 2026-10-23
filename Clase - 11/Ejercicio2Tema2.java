class ListaEnlazada {

    private class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo cabeza;
    private int tamanio;

    public ListaEnlazada() {
        cabeza = null;
        tamanio = 0;
    }

    public void insertarInicio(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
        tamanio++;
    }

    public void insertarFinal(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        tamanio++;
    }

    public boolean buscar(int valor) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato == valor) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public int tamanio() {
        return tamanio;
    }

    public void mostrar() {
        Nodo actual = cabeza;
        System.out.print("[");
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) {
                System.out.print(" -> ");
            }
            actual = actual.siguiente;
        }
        System.out.println("]");
    }

    // Cuenta cuántas veces aparece valor en toda la lista (no asume que es único)
    public int contarOcurrencias(int valor) {
        int contador = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato == valor) {
                contador++;
            }
            actual = actual.siguiente;
        }
        return contador;
    }

    /*
     * Elimina TODAS las ocurrencias de valor.
     *
     * Por qué sería más costoso en ListaEstatica (Tema 1) manteniendo
     * los elementos contiguos:
     * En la lista enlazada, eliminar un nodo es solo cambiar un puntero
     * (anterior.siguiente = actual.siguiente), O(1) una vez ubicado el nodo,
     * y toda la operación es una única pasada O(n).
     * En el arreglo, cada eliminación obliga a desplazar hacia la izquierda
     * todos los elementos que están a la derecha para no dejar huecos. Si se
     * reutilizara eliminarEnPosicion por cada ocurrencia, el costo sería O(n)
     * por eliminación, y con k ocurrencias llegaría a O(n * k), hasta O(n^2)
     * en el peor caso (todos los elementos iguales). Se puede optimizar con
     * dos índices (lectura/escritura) en una sola pasada O(n), pero hay que
     * mover igualmente los elementos, mientras que en la lista enlazada solo
     * se reasignan punteros y no se copia ningún dato.
     */
    public void eliminarTodas(int valor) {
        // 1) Eliminar ocurrencias en la cabeza (caso especial)
        while (cabeza != null && cabeza.dato == valor) {
            cabeza = cabeza.siguiente;
            tamanio--;
        }

        // 2) Eliminar ocurrencias en el resto de la lista
        Nodo actual = cabeza;
        while (actual != null && actual.siguiente != null) {
            if (actual.siguiente.dato == valor) {
                actual.siguiente = actual.siguiente.siguiente; // saltea el nodo
                tamanio--;
                // NO avanzamos: el nuevo siguiente también podría ser valor
            } else {
                actual = actual.siguiente;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        // Valor 7 repetido: en la cabeza, en el medio, consecutivo y al final
        lista.insertarFinal(7);
        lista.insertarFinal(3);
        lista.insertarFinal(7);
        lista.insertarFinal(7);
        lista.insertarFinal(5);
        lista.insertarFinal(7);

        System.out.print("Lista original:      ");
        lista.mostrar(); // [7 -> 3 -> 7 -> 7 -> 5 -> 7]
        System.out.println("Tamaño: " + lista.tamanio());                      // 6
        System.out.println("Ocurrencias de 7: " + lista.contarOcurrencias(7)); // 4
        System.out.println("Ocurrencias de 3: " + lista.contarOcurrencias(3)); // 1
        System.out.println("Ocurrencias de 9: " + lista.contarOcurrencias(9)); // 0

        lista.eliminarTodas(7);
        System.out.print("Tras eliminar 7:     ");
        lista.mostrar(); // [3 -> 5]
        System.out.println("Tamaño: " + lista.tamanio());                      // 2
        System.out.println("Ocurrencias de 7: " + lista.contarOcurrencias(7)); // 0

        // Caso borde: eliminar un valor que no existe
        lista.eliminarTodas(99);
        System.out.print("Tras eliminar 99:    ");
        lista.mostrar(); // [3 -> 5]
    }
}