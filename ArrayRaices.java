public class ArrayRaices {
    public static void main(String[] args) {
        int[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] raicesCuadradas = {Math.sqrt(1), Math.sqrt(2), Math.sqrt(3), Math.sqrt(4), Math.sqrt(5), Math.sqrt(6), Math.sqrt(7), Math.sqrt(8), Math.sqrt(9), Math.sqrt(10)};

        for (int i = 0; i < 10; i++) {
            System.out.println(enteros[i] + ": " + raicesCuadradas[i]);
        }
    }
}
