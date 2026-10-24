import java.util.Scanner;

public class CantidadVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();

        int vocales = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (esVocal(cadena.charAt(i))) {
                vocales++;
            }
        }

        System.out.println("La cantidad de vocales es " + vocales);

        scanner.close();
    }

    public static boolean esVocal(char vocal) {
        switch (vocal) {
            case 'a':
                return true;
            case 'e':
                return true;
            case 'i':
                return true;
            case 'o':
                return true;
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
