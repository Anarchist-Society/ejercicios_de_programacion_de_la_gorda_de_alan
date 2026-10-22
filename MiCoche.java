public class MiCoche {
    public static void main(String[] args) {
        Coche coche = new Coche();

        coche.setVelocidadMaxima(300);
        coche.setCilindrada(2000);
        coche.setColor("rojo");

        coche.mostrarAtributos();
    }
}
