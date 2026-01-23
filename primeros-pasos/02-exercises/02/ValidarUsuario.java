public class ValidarUsuario {

    public static void main(String[] args) {

        String usuario = "alvaroCodes";
        boolean valido = true;

        if (usuario.length() == 0) {
            System.out.println("El usuario no puede estar vacío");
            valido = false;
        }

        if (usuario.length() < 5) {
            System.out.println("El usuario debe tener al menos 5 caracteres");
            valido = false;
        }

        if (usuario.contains(" ")) {
            System.out.println("El usuario no puede contener espacios");
            valido = false;
        }

        if (!usuario.equals(usuario.toLowerCase())) {
            System.out.println("El usuario debe estar en minúsculas");
            valido = false;
        }

        if (valido) {
            System.out.println("Usuario válido");
        }
    }
}
