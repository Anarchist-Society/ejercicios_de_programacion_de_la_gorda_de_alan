import java.util.Scanner;

public class ElMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor a: ");
        int a = scanner.nextInt();

        System.out.print("Introduce el valor b: ");
        int b = scanner.nextInt();

        System.out.print("Introduce el valor c: ");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("El valor a = " + a + " es el más mayor");
        } else if (b > c) {
            System.out.println("El valor b = " + b + " es el más mayor");
        } else {
            System.out.println("El valor c = " + c + " es el más mayor");
        }

        scanner.close();
    }
}
