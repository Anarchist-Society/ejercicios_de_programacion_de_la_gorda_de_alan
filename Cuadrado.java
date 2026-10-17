public class Cuadrado {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Introduce un valor entero");
            System.exit(1);
        }

        int valor = Integer.parseInt(args[0]);

        System.out.println("El cuadrado de " + valor + " es " + valor * valor);
    }
}
