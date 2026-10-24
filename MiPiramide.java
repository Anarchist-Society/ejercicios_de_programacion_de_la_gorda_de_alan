import java.util.Scanner;

public  class MiPiramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el lado: ");
        int lado = scanner.nextInt();

        System.out.print("Introduce el apotema: ");
        int apotema = scanner.nextInt();

        System.out.print("Introduce la altura: ");
        int altura = scanner.nextInt();

        Piramide piramide = new Piramide(lado, apotema, altura);

        System.out.println("Área: " + piramide.area);
        System.out.println("Volumen: " + piramide.volumen);

        scanner.close();
    }
}
