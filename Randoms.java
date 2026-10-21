public class Randoms {
    public static void main(String[] args) {
        int min = 5;
        int max = 10;

        for (int i = 0; i < 20; i++) {
            int random = (int) (Math.random() * (max + 1 - min) + min);
            System.out.println("Número aleatorio " + (i + 1) + ": " + random);
        }
    }
}
