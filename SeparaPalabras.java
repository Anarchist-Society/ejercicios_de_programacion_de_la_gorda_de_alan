import java.util.Scanner;

public class SeparaPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isUpperCase(cadena.charAt(i)) && i != 0) {
                System.out.print("\n");
            }
            System.out.print(cadena.charAt(i));
        }

        scanner.close();
    }
}
