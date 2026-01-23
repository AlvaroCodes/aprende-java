import java.util.Scanner;

public class FibonacciFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números de Fibonacci quieres mostrar? ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Serie de Fibonacci:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int siguiente = a + b; // calcular el siguiente número
            a = b;                 // mover los valores
            b = siguiente;
        }

        sc.close();
    }
}
