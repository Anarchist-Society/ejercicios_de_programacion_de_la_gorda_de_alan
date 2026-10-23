public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha() {
        dia = 1;
        mes = 1;
        año = 2004;
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public String mostrarFecha() {
        return dia + "/" + mes + "/" + año;
    }
}
