import java.util.Scanner;

public class AnalizadorTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== ANALIZADOR DE TEXTO ===");
        System.out.print("Ingresa una frase o mensaje: ");
        String mensaje = scanner.nextLine();
        
        // Calcular el número de caracteres
        int numeroCaracteres = mensaje.length();
        
        // Obtener el primer carácter
        char primerCaracter = mensaje.charAt(0);
        
        // Obtener el último carácter
        char ultimoCaracter = mensaje.charAt(numeroCaracteres - 1);
        
        // Mostrar resultados
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Tu mensaje: " + mensaje);
        System.out.println("Número de caracteres: " + numeroCaracteres);
        System.out.println("Primer carácter: " + primerCaracter);
        System.out.println("Último carácter: " + ultimoCaracter);
        
        scanner.close();
    }
}
