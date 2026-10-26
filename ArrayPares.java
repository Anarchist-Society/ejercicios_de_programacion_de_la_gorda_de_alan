import java.util.Scanner;

public class ArrayPares {
    public static int productoPares(int[][] matriz) {
        int producto = 1;
        boolean hayPares = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    producto *= matriz[i][j];
                    hayPares = true;
                }
            }
        }

        if (!hayPares) {
            return 0;
        }

        return producto;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Introduce el número de columnas: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Introduce el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int resultado = productoPares(matriz);

        System.out.println("El producto de los elementos pares es: " + resultado);

        scanner.close();
    }
}
