public class CalculoFactura {

    public static void main(String[] args) {

        double precioBase = 123.75;

        // Descuento 15%
        double descuento = precioBase * 0.15;
        double precioConDescuento = precioBase - descuento;

        // IVA 21%
        double iva = precioConDescuento * 0.21;
        double precioFinal = precioConDescuento + iva;

        // Redondeos con Math usando double
        double precioDosDecimales = Math.round(precioFinal * 100.0) / 100.0;
        double precioSinDecimales = Math.floor(precioFinal);
        double precioRedondeado = Math.round(precioFinal);

        System.out.println("Precio base: " + precioBase);
        System.out.println("Precio con descuento: " + precioConDescuento);
        System.out.println("Precio final (2 decimales): " + precioDosDecimales);
        System.out.println("Precio sin decimales: " + precioSinDecimales);
        System.out.println("Precio redondeado: " + precioRedondeado);
    }
}
