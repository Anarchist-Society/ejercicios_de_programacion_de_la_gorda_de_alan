public class Indice {
    public static void main(String[] args) {
        double  peso = 60;
        double altura = 1.69;
        double imc = peso / Math.pow(altura, 2);

        System.out.println("Tú índice de masa corpororal es: "  + (Math.round(imc * 100.0) / 100.0));
    }
}
