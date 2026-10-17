public class Indice {
    public static void main(String[] args) {
        double  peso = 100;
        double altura = 1.72;
        double imc = peso / Math.pow(altura, 2);

        System.out.println("Tú índice de masa corpororal es: "  + (Math.round(imc * 100.0) / 100.0));
    }
}
