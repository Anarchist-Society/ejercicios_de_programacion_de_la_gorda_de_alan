import java.util.Scanner;

public class Compras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double costeTotal = 0;
        double precio;
        int tipo;
        double descuento = 0;

        do {
            do {
                System.out.print("Introduce el tipo de artículo: ");
                tipo = scanner.nextInt();

                switch (tipo) {
                    case 0:
                        System.out.println("Se ha introducido 0. Saliendo...");
                        break;
                    case 1:
                        descuento = 25;
                        break;
                    case 2:
                        descuento = 20;
                        break;
                    case 3:
                        descuento = 15;
                        break;
                    case 4:
                        descuento = 10;
                        break;
                    default:
                        System.out.println("Se ha introducido un tipo que no es 0, 1, 2, 3 o 4");
                        break;
                }
            } while (tipo < 0 || tipo > 4);

            if (tipo != 0) {
                System.out.print("Introduce el precio del artículo: ");
                precio = scanner.nextDouble();

                costeTotal += precio - (precio / 100) * descuento;
            }
        } while (tipo != 0);

        System.out.println("El coste total de la compra es: " + costeTotal + "€");

        scanner.close();
    }
}
