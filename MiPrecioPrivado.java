public class MiPrecioPrivado {
    public static void main(String[] args) {
        PrecioPrivado precioPrivado = new PrecioPrivado();

        precioPrivado.setEuro(10.5);

        System.out.println("Euro: " + precioPrivado.getEuro());

        // precioPrivado.euro = 20.5; Esto no se puede hacer

        precioPrivado.setEuro(20.5);

        System.out.println("Euro: " + precioPrivado.getEuro());
    }
}
