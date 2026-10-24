public class Piramide {
    int lado;
    int apotema;
    double altura;
    double area;
    double volumen;

    Piramide() {
        lado = 1;
        apotema = 1;
        altura = 1;
    }

    Piramide(int lado, int apotema, int altura) {
        this.lado = lado;
        this.apotema = apotema;
        this.altura = altura;
        area = (((lado * 4) * apotema) / 2) + (lado * lado);
        volumen  = ((lado * lado) * altura) / 3;
    }
}
