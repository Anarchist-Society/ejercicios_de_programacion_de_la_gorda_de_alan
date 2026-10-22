public class Coche {
    final int ruedas = 4;
    int velocidadMaxima;
    int cilindrada;
    String color;

    void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    void setColor(String color) {
        this.color = color;
    }

    void mostrarAtributos() {
        System.out.println("Ruedas: " + ruedas);
        System.out.println("Velocidad máxima: " + velocidadMaxima);
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Color: " + color);
    }

    void tipoCoche() {
        if (cilindrada >= 2000) {
            System.out.println("Es de gama alta");
        } else {
            System.out.println("No es de gama alta");
        }
    }
}
