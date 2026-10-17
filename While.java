public class While {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No hay ningún argumento");
            System.exit(1);
        }

        int i = 0;

        while (i < args.length) {
            System.out.println("El valor del argumento " + (i + 1) + " es " + args[i]);
            i++;
        }
    }
}
