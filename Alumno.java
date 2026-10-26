public class Alumno {
    String nombre;
    double PEC1;
    double PEC2;
    private double mediaPonderada;

    Alumno() {}

    Alumno(String nombre, double PEC1, double PEC2) {
        this.nombre = nombre;
        this.PEC1 = PEC1;
        this.PEC2 = PEC2;
    }

    void calcularMediaPonderada() {
        mediaPonderada = (PEC1 + PEC2) / 2;
    }

    public double getMediaPonderada() {
        return mediaPonderada;
    }
}
