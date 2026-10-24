import java.util.Scanner;

public class DNI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu DNI: ");
        String dni = scanner.nextLine();

        int numeros = 0;

        for (int i = 0; i < dni.length() - 1; i++) {
            numeros = numeros * 10 + dni.charAt(i) - '0';
        }

        char letra = dni.charAt(dni.length() - 1);

        if (letra == calcularLetra(numeros)) {
            System.out.println("La letra es correcta");
        }

        scanner.close();
    }

    public static char calcularLetra(int numeros) {
        int resto = numeros % 23;
        return letra(resto);
    }

    public static char letra(int resto) {
        switch (resto) {
            case 0:
                return 'T';
            case 1:
                return 'R';
            case 2:
                return 'W';
            case 3:
                return 'A';
            case 4:
                return 'G';
            case 5:
                return 'M';
            case 6:
                return 'Y';
            case 7:
                return 'F';
            case 8:
                return 'P';
            case 9:
                return 'D';
            case 10:
                return 'X';
            case 11:
                return 'B';
            case 12:
                return 'N';
            case 13:
                return 'J';
            case 14:
                return 'Z';
            case 15:
                return 'S';
            case 16:
                return 'Q';
            case 17:
                return 'V';
            case 18:
                return 'H';
            case 19:
                return 'L';
            case 20:
                return 'C';
            case 21:
                return 'K';
            case 22:
                return 'E';
            default:
                return '0';
        }
    }
}
