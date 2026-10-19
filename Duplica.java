public class Duplica {
    public static void main(String[] args) {
        int capitalInicial = 1000;
        int interes = 10;
        int interesBeneficio = (capitalInicial / 100) * interes;
        int capitalFinal = capitalInicial;
        int anios = 0;

        while (capitalFinal < capitalInicial * 2) {
            capitalFinal += interesBeneficio;
            anios++;
        }

        System.out.println(anios);
    }
}
