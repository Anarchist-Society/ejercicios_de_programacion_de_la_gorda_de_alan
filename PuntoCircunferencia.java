public class PuntoCircunferencia {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Debes introducir exactamente dos valores");
            System.exit(1);
        }

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double xCentro = 3;
        double yCentro = -2;
        double radio = 5;

        solucion_01(x, y, xCentro, yCentro, radio);
        solucion_02(x, y, xCentro, yCentro, radio);
    }

    public static void solucion_01(double x, double y, double xCentro, double yCentro, double radio) {
        double operacion = Math.pow((x - xCentro), 2) + Math.pow((y - yCentro), 2);

        if (operacion <= Math.pow(radio, 2)) {
            System.out.println("El punto (" + x + ", " + y + ") está dentro del círculo");
        } else {
            System.out.println("El punto (" + x + ", " + y + ") está fuera del círculo");
        }
    }

    public static void solucion_02(double x, double y, double xCentro, double yCentro, double radio) {
        double operacion = Math.sqrt((Math.pow((x - xCentro), 2)) + Math.pow((y - yCentro), 2));

        if (operacion <= radio) {
            System.out.println("El punto (" + x + ", " + y + ") está dentro del círculo");
        } else {
            System.out.println("El punto (" + x + ", " + y + ") está fuera del círculo");
        }
    }
}
