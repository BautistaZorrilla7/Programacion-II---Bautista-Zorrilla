import java.util.Arrays;

public class EjercicioClase {
    public static void main(String[] args) {
        // Arreglo inicial de prueba para ordenar de menor a mayor
        int[] numeros = {6, 8, 1, 9, 10, 45, 2, 0};
        
        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(numeros));
        
        ordenarBurbuja(numeros);
        
        System.out.println("\nArreglo ordenado:");
        System.out.println(Arrays.toString(numeros));
    }

    /**
     * Método que implementa el algoritmo de ordenamiento por burbuja.
     * Realiza comparaciones adyacentes y desplaza los elementos mayores hacia el final.
     */
    public static void ordenarBurbuja(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                
                // Bloque de depuración para visualizar las pasadas y comparaciones
                System.out.println("Índice j: " + j + " | Estado: " + Arrays.toString(arr));
                System.out.println("Comparando: " + arr[j] + " con " + arr[j + 1]);

                if (arr[j] > arr[j + 1]) {
                    // Intercambio de valores (swap)
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }
}