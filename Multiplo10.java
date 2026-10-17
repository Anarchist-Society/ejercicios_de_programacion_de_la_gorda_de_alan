public class Multiplo10 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Faltan valores");
            System.exit(1);
        }

        int valor = Integer.parseInt(args[0]);

        if (valor % 10 == 0) {
            System.out.println("Es múltiplo de 10");
        } else {
            System.out.println("No es múltiplo de 10");
        }
    }
}
