public class SumaNum {
    public static void main(String[] args) {
        int sumaTotal = 0;
        int n = 5;

        for (int i = 1; i <= n; i++) {
            sumaTotal += i;
        }

        System.out.println("La suma de los " + n + " primeros números es: " + sumaTotal);
    }
}
