public class IMC {
    public static void main(String[] args) {
        double peso = 60;
        double altura = 1.69;

        System.out.println("Tu IMC es de: " + imc(peso, altura));
    }

    public static double imc(double peso, double altura) {
        return (Math.round(peso / (altura * altura) * 100.0) / 100.0);
    }

}
