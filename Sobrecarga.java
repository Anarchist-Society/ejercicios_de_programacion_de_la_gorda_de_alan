import java.util.Scanner;

public class Sobrecarga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce otro número: ");
        int num2 = scanner.nextInt();

        System.out.print("Introduce otro número: ");
        int num3 = scanner.nextInt();

        System.out.println("La suma de los 2 primeros números es: " + sumar(num1, num2));
        System.out.println("La suma de los 3 primeros números es: " + sumar(num1, num2, num3));

        scanner.close();
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int sumar(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
