public class Argumentos {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No hay ningún argumento");
            System.exit(1);
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println("El valor del argumento " + (i + 1) + " es " + args[i]);
        }
    }
}
