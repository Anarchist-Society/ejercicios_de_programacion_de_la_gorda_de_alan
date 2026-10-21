public class MatMultiplos {
    public static void main(String[] args) {
        int num = 1;
        int multiplo = 1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d", num * multiplo);
                ++multiplo;
            }
            ++num;
            multiplo = 1;
            System.out.println();
        }
    }
}
