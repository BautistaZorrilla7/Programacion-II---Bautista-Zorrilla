import java.util.Scanner;

class ManejoExcepciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese el numerador: ");
            int numerador = sc.nextInt();
            
            System.out.print("Ingrese el denominador: ");
            int denominador = sc.nextInt();
            
            int resultado = numerador / denominador;
            System.out.println("Resultado de la división: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } catch (Exception e) {
            System.out.println("Error: Ingresó un valor no válido.");
        } finally {
            sc.close();
            System.out.println("Fin del programa.");
        }
    }
}