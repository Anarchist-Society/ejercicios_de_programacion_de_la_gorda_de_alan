import java.util.Scanner;

public class MiFecha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el día: ");
        int dia = scanner.nextInt();

        System.out.print("Introduce el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Introduce el año: ");
        int año = scanner.nextInt();

        Fecha fecha = new Fecha();
        System.out.println(fecha.mostrarFecha());

        fecha = new Fecha(dia, mes, año);
        System.out.println(fecha.mostrarFecha());


        scanner.close();
    }
}
