public class EsPar {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("No hay 2 argumentos");
            System.exit(1);
        }

        int valor = Integer.parseInt(args[1]);

        if (valor % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
}
