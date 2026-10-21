public class LaGallinita {
    public static void main(String[] args) {
        String inicio = "La gallina turuleta";
        String huevo = " huevo";
        String haPuesto = "ha puesto ";
        String gallinita = "gallinita";
        String pobrecita = "pobrecita";
        String dejala = "Déjala";
        String aLa = " a la ";
        String q = " que ";

        System.out.println(inicio);

        for (int huevos = 1; huevos <= 10; huevos++) {
            if (huevos == 1) {
                System.out.println(haPuesto + huevos + huevo);
            }

            if (huevos > 1 && huevos < 10) {
                System.out.println(haPuesto + huevos);
            }


            if (huevos == 3 || huevos == 6) {
                System.out.println(inicio);
            }

            if (huevos == 10) {
                System.out.println(dejala + aLa + gallinita);
                System.out.println(dejala + aLa +  pobrecita);
                System.out.println(dejala + q + "ponga " + huevos);
            }
        }
    }
}
