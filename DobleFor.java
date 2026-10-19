public class DobleFor {
    public static void main(String[] args) {
        int fila = 0;
        int columna = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print(fila + " ");
            ++fila;
            for (int j = 0; j < 10; j++) {
                if (i == 0) {
                    System.out.print(fila + "" + columna);
                }
                System.out.print(columna + " ");
                ++columna;
            }
            System.out.println();
        }
    }
}
