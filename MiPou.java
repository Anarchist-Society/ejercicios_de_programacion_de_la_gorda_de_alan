public class MiPou {
    public static void main(String[] args) {
        int num = 5;
        int exponente = 5;

        System.out.println(num + " elevado a " + exponente + " es: " + miPou(num, exponente));
    }

    public static int miPou(int num, int exponente) {
        int r = 1;

        for (int i = 0; i < exponente; i++) {
            r *= num;
        }

        return r;
    }
}
