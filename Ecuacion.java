public class Ecuacion {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Falta valores");
            System.exit(1);
        }

        double a = Double.parseDouble(args[0]);

        if (a == 0) {
            System.out.println("a no puede ser 0");
            System.exit(1);
        }

        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double resta = (Math.pow(b, 2)) - (4 * a * c);

        if (resta < 0) {
            System.out.println("Error, el contenido de la raíz cuadrada es negativo");
            System.exit(1);
        }

        double solucion1 = (-b + Math.sqrt(resta)) / (2 * a);
        double solucion2 = (-b - Math.sqrt(resta)) / (2 * a);

        System.out.println("Solucion 1: " + solucion1);
        System.out.println("Solucion 2: " + solucion2);
    }
}
