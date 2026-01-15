import java.util.Scanner;

public class ScannerCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== CALCULADORA ===");
        
        System.out.print("Ingresa el primer número: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Ingresa el segundo número: ");
        double num2 = sc.nextDouble();
        
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, suma);
        System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, resta);
        System.out.printf("%.2f × %.2f = %.2f%n", num1, num2, multiplicacion);
        System.out.printf("%.2f ÷ %.2f = %.2f%n", num1, num2, division);
        
        sc.close();
    }
}