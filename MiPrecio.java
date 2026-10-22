public class MiPrecio {
    public static void main(String[] args) {
        Precio precio = new Precio();
        precio.euro = 10.5;

        System.out.println("Euro: " + precio.getEuro());

        precio.setEuro(20.5);

        System.out.println("Euro: " + precio.getEuro());
    }
}
