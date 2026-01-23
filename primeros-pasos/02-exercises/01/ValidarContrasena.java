public class ValidarContrasena {

    public static void main(String[] args) {

        String password = "Clave@123";

        boolean esValida = true;

        if (password.length() < 8) {
            System.out.println("La contraseña es demasiado corta");
            esValida = false;
        }

        if (!password.contains("@")) {
            System.out.println("La contraseña debe contener el carácter @");
            esValida = false;
        }

        if (password.equals(password.toLowerCase())) {
            System.out.println("La contraseña debe contener al menos una mayúscula");
            esValida = false;
        }

        if (esValida) {
            System.out.println("Contraseña válida");
            System.out.println("Contraseña en mayúsculas: " + password.toUpperCase());
        }
    }
}
