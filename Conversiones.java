public class Conversiones {
    public static void main(String[] args) {
        int a = 2;
        double b = 3;
        float c = (float) (2000 * a / b + 5);

        System.out.println("c = " + c);
        System.out.println("c (double) = " + (double) c);
        System.out.println("c (byte) = " + (byte) c);
        System.out.println("c (short) = " + (short) c);
        System.out.println("c (int) = " + (int) c);
        System.out.println("c (long) = " + (long) c);
    }
}
