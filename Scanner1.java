import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el número 2: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("El número " + num1 + " es igual que " + num2);
            System.exit(1);
        }

        System.out.println((num1 > num2) ? "El número " + num1 + " es mayor que el número " + num2 : "El número " + num2 + " es mayor que el número " + num1);

        scanner.close();
    }
}
