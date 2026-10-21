public class EsMultiplo {
    public static void main(String[] args) {
        int n = 55;
        int x = 5;

        for (int i = 1; i <= n; i++) {
            if (i % x == 0) {
                System.out.println(i + " es múltiplo de " + x);
            } else {
                System.out.println(i + " no es múltiplo de " + x);
            }
        }
    }
}
