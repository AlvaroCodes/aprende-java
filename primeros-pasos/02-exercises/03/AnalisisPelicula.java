public class AnalisisPelicula {

    public static void main(String[] args) {

        String descripcion = "Pelicula: Matrix | Año: 1999 | Director: Wachowski | Genero: Ciencia ficcion";

        // 1. Longitud total
        System.out.println("Longitud del texto: " + descripcion.length());

        // 2. Primer carácter
        System.out.println("Primer carácter: " + descripcion.charAt(0));

        // 3. Último carácter
        System.out.println("Último carácter: " + descripcion.charAt(descripcion.length() - 1));

        // 4. Título
        int inicioTitulo = descripcion.indexOf("Pelicula: ") + "Pelicula: ".length();
        int finTitulo = descripcion.indexOf(" |");
        String titulo = descripcion.substring(inicioTitulo, finTitulo);
        System.out.println("Título: " + titulo);

        // 5. Año
        int inicioAnio = descripcion.indexOf("Año: ") + "Año: ".length();
        int finAnio = descripcion.indexOf(" |", inicioAnio);
        String anio = descripcion.substring(inicioAnio, finAnio);
        System.out.println("Año: " + anio);

        // 6. Director
        int inicioDirector = descripcion.indexOf("Director: ") + "Director: ".length();
        int finDirector = descripcion.indexOf(" |", inicioDirector);
        String director = descripcion.substring(inicioDirector, finDirector);
        System.out.println("Director: " + director);

        // 7. Género
        int inicioGenero = descripcion.indexOf("Genero: ") + "Genero: ".length();
        String genero = descripcion.substring(inicioGenero);
        System.out.println("Género: " + genero);

        // 8. Contiene "Ciencia"
        if (descripcion.contains("Ciencia")) {
            System.out.println("La película es de ciencia ficción");
        }

        // 9. Contiene "1999"
        if (descripcion.contains("1999")) {
            System.out.println("Película clásica");
        }

        // 10. Texto en mayúsculas
        System.out.println("Descripción en mayúsculas:");
        System.out.println(descripcion.toUpperCase());
    }
}
