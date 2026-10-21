import java.util.Scanner;

public class DistanciaP_r {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la coordenada x: ");
        double x = scanner.nextDouble();

        System.out.print("Introduce la coordenada y: ");
        double y = scanner.nextDouble();

        double a, b;

        do {
            System.out.print("Introduce el coeficiente a de la recta: ");
            a = scanner.nextDouble();

            System.out.print("Introduce el coeficiente b de la recta: ");
            b = scanner.nextDouble();

            if (a == 0 || b == 0) {
                System.out.println("El coeficiente a o b no puede ser 0");
            }
        } while (a == 0 || b == 0);

        System.out.print("Introduce el coeficiente c de la recta: ");
        double c = scanner.nextDouble();

        double numerador = a * x + b * y + c;
        double denominador = Math.sqrt((Math.pow(a, 2)) + Math.pow(b, 2));

        System.out.println("La distancia es de: " + Math.abs(numerador / denominador));

        scanner.close();
    }
}
