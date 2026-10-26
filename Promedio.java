import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el valor " + i + ": ");
            array[i] = scanner.nextInt();
        }

        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        System.out.println("Media aritmética: " + suma / n);

        scanner.close();
    }
}
