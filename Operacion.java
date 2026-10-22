public class Operacion {
    private double num1;
    private double num2;
    private char suma = '+';
    private char resta = '-';
    private char multiplicacion = '*';
    private char division = '/';

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double sumar() {
        return num1 + num2;
    }

    public double restar() {
        return num1 - num2;
    }

    public double multiplicar() {
        return num1 * num2;
    }

    public double dividir() {
        return num1 / num2;
    }

    public void mostrarResultados(char operacion) {
        if (operacion == suma) {
            System.out.println("Resultado: " + sumar());
        } else if (operacion == resta) {
            System.out.println("Resultado: " + restar());
        } else if (operacion == multiplicacion) {
            System.out.println("Resultado: " + multiplicar());
        } else if (operacion == division) {
            System.out.println("Resultado: " + dividir());
        }
    }
}
