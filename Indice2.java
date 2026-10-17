public class Indice2 {
    public static void main(String[] args) {
        double  peso = 100;
        double altura = 1.72;
        double imc = peso / Math.pow(altura, 2);

        if (imc < 18) {
            System.out.println("Tú IMC está por debajo de 18");
            System.out.println("Tú índice de masa corpororal es: "  + (Math.round(imc * 100.0) / 100.0));
        } else if (imc >= 18 && imc <= 25) {
            System.out.println("Tú IMC está entre 18 y 25 inclusive");
            System.out.println("Tú índice de masa corpororal es: "  + (Math.round(imc * 100.0) / 100.0));
        } else if (imc > 25) {
            System.out.println("Tú IMC es más que 25");
            System.out.println("Tú índice de masa corpororal es: "  + (Math.round(imc * 100.0) / 100.0));
        }
    }
}
