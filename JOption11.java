import java.util.Scanner;

public class JOption11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("Ingresa un número entre el 0 y el 10: ");
            num = scanner.nextInt();

            if (num >= 0 && num <= 10) {
                System.out.println("El número es: " + num);
            } else {
                System.err.println("Error: el número no está entre el 0 y el 10");
            }
        } while (num < 0 || num > 10);

        scanner.close();
    }
}
