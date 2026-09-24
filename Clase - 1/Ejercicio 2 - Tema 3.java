import java.util.Scanner;

class VerificadorPrimo {

    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        boolean primo = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();

        if (esPrimo(n)) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número no es primo.");
        }

        sc.close();
    }
} 