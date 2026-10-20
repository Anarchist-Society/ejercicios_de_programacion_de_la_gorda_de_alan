public class Rebajas {
    public static void main(String[] args) {
        double compra = 300;
        double descuento = 20;
        double totalPagar = 0;

        if (compra >= 300) {
            totalPagar = compra - ((compra * descuento) / 100);
            System.out.println("El importe total a pagar es: " + totalPagar);
            System.exit(1);
        }

        System.out.println("El importe total a pagar es: " + totalPagar);
    }
}
