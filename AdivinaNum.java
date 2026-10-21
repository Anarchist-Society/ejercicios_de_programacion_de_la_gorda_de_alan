import java.util.Scanner;

public class AdivinaNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 1;
        int max = 100;
        int x = (int) (Math.random() * (max + 1 - min) + min);
        int num;

        do {
            System.out.print("Cual es el número: ");
            num = scanner.nextInt();

            if (num < x) {
                System.out.println("El número introducido es menor");
            } else if (num > x) {
                System.out.println("Es número introducido es mayor");
            } else {
                System.out.println("Número adivinado!");
            }
        } while (num != x);

        scanner.close();
    }
}
