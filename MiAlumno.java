import java.util.Scanner;

public class MiAlumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce tu nota PEC1: ");
        double PEC1 = scanner.nextDouble();

        System.out.print("Introduce tu nota PEC2: ");
        double PEC2 = scanner.nextDouble();

        Alumno alumno = new Alumno(nombre, PEC1, PEC2);
        alumno.calcularMediaPonderada();

        System.out.println("El alumno " + alumno.nombre + " tiene una media ponderada de: " + alumno.getMediaPonderada());

        scanner.close();
    }
}
