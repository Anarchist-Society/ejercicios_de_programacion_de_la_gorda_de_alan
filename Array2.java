import java.util.Scanner;

public class Array2 {
    public static double media(int[][] matriz) {
        double suma = 0;
        double n = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
                n++;
            }
        }

        return Math.round((suma / n) * 100.0) / 100.0;
    }

    public static int positivos(int[][] matriz) {
        int positivos = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > 0) {
                    positivos++;
                }
            }
        }

        return positivos;
    }

    public static int negativos(int[][] matriz) {
        int negativos = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    negativos++;
                }
            }
        }

        return negativos;
    }

    public static int ceros(int[][] matriz) {
        int ceros = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    ceros++;
                }
            }
        }

        return ceros;
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

        System.out.println("Media: " + media(matriz));
        System.out.println("Número de positivos: " + positivos(matriz));
        System.out.println("Número de negativos: " + negativos(matriz));
        System.out.println("Número de ceros: " + ceros(matriz));

        scanner.close();
    }
}
