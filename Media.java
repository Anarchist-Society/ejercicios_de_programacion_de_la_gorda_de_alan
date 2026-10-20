import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num;
        double mediaAritmetica = 0.0;
        double n = 0;

        do {
            System.out.print("Introduce un número: ");
            num = scanner.nextDouble();

            if (num < 0) {
                System.out.println("Se ha introducido un número negativo. Saliendo...");
                continue;
            }

            ++n;
            mediaAritmetica += num;
        } while (num > 0);

        System.out.println("La media aritmética es de: " + Math.round((mediaAritmetica / n) * 100.0) / 100.0);

        scanner.close();
    }
}
