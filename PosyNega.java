import java.util.Scanner;

public class PosyNega {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("Introduce un número: ");
            num = scanner.nextInt();

            if (num == 0) {
                System.out.println("Saliendo...");
            }
        } while (num != 0);

        scanner.close();
    }
}
