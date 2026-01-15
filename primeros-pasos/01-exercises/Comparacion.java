public class Comparacion {
    public static void main(String[] args) {

        double num1 = 7.5;
        double num2 = 5.0;

        boolean esMayor = num1 > num2;
        boolean esMenor = num1 < num2;
        boolean sonIguales = num1 == num2;

        System.out.println("¿num1 es mayor que num2? " + esMayor);
        System.out.println("¿num1 es menor que num2? " + esMenor);
        System.out.println("¿num1 es igual a num2? " + sonIguales);
    }
}
