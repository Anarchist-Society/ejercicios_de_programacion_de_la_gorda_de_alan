public class FactorialMetodo {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("El factorial de " + num + " es: " + factorial(num));
    }

    public static int factorial(int num) {
        int factorial = 1;

        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
