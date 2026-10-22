import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un año: ");
        int anio = scanner.nextInt();

        if ((anio % 400 == 0 || anio % 4 == 0) && anio % 100 != 0) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }

        scanner.close();
    }
}
