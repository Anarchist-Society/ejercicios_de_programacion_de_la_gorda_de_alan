import java.util.Scanner;

public class OperacionesMatrices {
    public static void introducir(int[][] matriz, Scanner teclado) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Introduce el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }
    }

    public static void imprimir(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] traspuesta(int[][] matriz) {
        int[][] resultado = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado[j][i] = matriz[i][j];
            }
        }

        return resultado;
    }

    public static int[][] sumar(int[][] matriz1, int[][] matriz2) {
        if (matriz1.length != matriz2.length ||
            matriz1[0].length != matriz2[0].length) {
            return null;
        }

        int[][] resultado = new int[matriz1.length][matriz1[0].length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }

    public static int[][] multiplicar(int[][] matriz1, int[][] matriz2) {
        if (matriz1[0].length != matriz2.length) {
            return null;
        }

        int[][] resultado =
            new int[matriz1.length][matriz2[0].length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz1[0].length; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Filas de la primera matriz: ");
        int filas1 = scanner.nextInt();

        System.out.print("Columnas de la primera matriz: ");
        int columnas1 = scanner.nextInt();

        int[][] matriz1 = new int[filas1][columnas1];

        System.out.println("Introduce los elementos de la primera matriz:");
        introducir(matriz1, scanner);

        System.out.print("Filas de la segunda matriz: ");
        int filas2 = scanner.nextInt();

        System.out.print("Columnas de la segunda matriz: ");
        int columnas2 = scanner.nextInt();

        int[][] matriz2 = new int[filas2][columnas2];

        System.out.println("Introduce los elementos de la segunda matriz:");
        introducir(matriz2, scanner);

        System.out.println("\nPrimera matriz:");
        imprimir(matriz1);

        System.out.println("\nSegunda matriz:");
        imprimir(matriz2);

        System.out.println("\nTraspuesta de la primera matriz:");
        imprimir(traspuesta(matriz1));

        int[][] suma = sumar(matriz1, matriz2);

        if (suma != null) {
            System.out.println("\nSuma de las matrices:");
            imprimir(suma);
        } else {
            System.out.println("\nNo se pueden sumar: tienen dimensiones distintas.");
        }

        int[][] producto = multiplicar(matriz1, matriz2);

        if (producto != null) {
            System.out.println("\nProducto de las matrices:");
            imprimir(producto);
        } else {
            System.out.println(
                "\nNo se pueden multiplicar: las columnas de la primera " +
                "deben coincidir con las filas de la segunda."
            );
        }

        scanner.close();
    }
}
