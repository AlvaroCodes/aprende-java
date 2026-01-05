import java.util.Scanner;

public class FormularioRegistro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== FORMULARIO DE REGISTRO ===\n");
        
        System.out.print("Nombre completo: ");
        String nombre = sc.nextLine();
        
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        
        System.out.print("Altura (en metros): ");
        double altura = sc.nextDouble();
        
        sc.nextLine(); // Limpiar buffer
        
        System.out.print("Ciudad: ");
        String ciudad = sc.nextLine();
        
        System.out.print("¿Es estudiante? (true/false): ");
        boolean esEstudiante = sc.nextBoolean();
        
        // Mostrar resumen
        System.out.println("\n=== RESUMEN ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.printf("Altura: %.2f m%n", altura);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Estudiante: " + (esEstudiante ? "Sí" : "No"));
        
        sc.close();
    }
}