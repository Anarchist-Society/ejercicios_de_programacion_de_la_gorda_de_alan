import java.util.Scanner;
import java.util.Arrays;

public class OperacionesArrays {
    public static void generar(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
    }

    public static void imprimir(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + " ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println();
    }

    public static void ordenar(int[] array) {
        Arrays.sort(array);
    }

    public static int masCercano(int[] array, int valor) {
        int indice = 0;
        int diferencia = Math.abs(array[0] - valor);

        for (int i = 1; i < array.length; i++) {
            int diferenciaActual = Math.abs(array[i] - valor);

            if (diferenciaActual < diferencia) {
                diferencia = diferenciaActual;
                indice = i;
            }
        }

        return indice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.print("Introduce el límite mínimo: ");
        int min = scanner.nextInt();

        System.out.print("Introduce el límite máximo: ");
        int max = scanner.nextInt();

        System.out.print("Introduce un valor entre " + min + " y " + max + ": ");
        int valor = scanner.nextInt();

        generar(array, min, max);

        System.out.println("Array sin ordenar:");
        imprimir(array);

        ordenar(array);

        System.out.println("Array ordenado:");
        imprimir(array);

        int indice = masCercano(array, valor);

        System.out.println("Índice del elemento más cercano: " + indice);
        System.out.println("Elemento más cercano: " + array[indice]);

        scanner.close();
    }
}
