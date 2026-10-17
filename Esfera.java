public class Esfera {
    public static void main(String[] args) {
        double radio = 10;
        double sup = 4 * Math.PI / Math.pow(radio, 2);
        double vol = 4 * Math.PI * Math.pow(radio, 3) * 3;

        System.out.println("Superficie: " + sup);
        System.out.println("Volumen: " + vol);
    }
}
