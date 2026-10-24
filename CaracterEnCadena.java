import java.util.Scanner;

public class CaracterEnCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();

        System.out.print("Introduce un carácter: ");
        char caracter = scanner.nextLine().charAt(0);

        int repiticiones = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                repiticiones++;
            }
        }

        System.out.println("El carácter '" + caracter + "' se repite " + repiticiones + " veces");

        scanner.close();
    }
}
