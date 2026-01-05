import java.util.Scanner;

public class CalculadoraNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar información del estudiante
        System.out.println("=== CALCULADORA DE NOTAS ===");
        System.out.print("Nombre del estudiante: ");
        String nombreEstudiante = scanner.nextLine();
        
        // Solicitar las calificaciones
        System.out.print("Calificación de Matemáticas (0-100): ");
        double notaMatematicas = scanner.nextDouble();
        
        System.out.print("Calificación de Ciencias (0-100): ");
        double notaCiencias = scanner.nextDouble();
        
        System.out.print("Calificación de Historia (0-100): ");
        double notaHistoria = scanner.nextDouble();
        
        System.out.print("Calificación de Literatura (0-100): ");
        double notaLiteratura = scanner.nextDouble();
        
        // Calcular la suma total
        double sumaTotal = notaMatematicas + notaCiencias + notaHistoria + notaLiteratura;
        
        // Calcular el promedio
        double promedio = sumaTotal / 4;
        
        // Mostrar resultados
        System.out.println("\n=== REPORTE DE CALIFICACIONES ===");
        System.out.println("Estudiante: " + nombreEstudiante);
        System.out.println("------------------------------");
        System.out.println("Matemáticas: " + notaMatematicas);
        System.out.println("Ciencias: " + notaCiencias);
        System.out.println("Historia: " + notaHistoria);
        System.out.println("Literatura: " + notaLiteratura);
        System.out.println("------------------------------");
        System.out.println("Suma total: " + sumaTotal + " puntos");
        System.out.println("Promedio: " + promedio + " puntos");
        
        scanner.close();
    }
}
