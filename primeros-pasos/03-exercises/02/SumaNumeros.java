public class SumaNumeros {

    public static void main(String[] args) {

        int suma = 0;

        // Bucle del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Número: " + i);
            suma += i; // suma = suma + i
        }

        System.out.println("Suma total: " + suma);
    }
}
