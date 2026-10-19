import java.util.Scanner;

public class Cuadrado2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("Introduce un número: ");
            num = scanner.nextInt();

            if (num >= 0) {
                System.out.println("El cuadrado de " + num + " es: " + num * num);
            } else {
                System.out.println("Se ha introducido un número negativo. Saliendo...");
            }
        } while (num >= 0);

        scanner.close();
    }
}
