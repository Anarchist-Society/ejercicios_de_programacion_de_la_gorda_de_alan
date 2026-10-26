import java.util.Scanner;

public class MiAlumno2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de alumnos: ");
        int n = scanner.nextInt();

        Alumno[] alumnos = new Alumno[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el nombre del alumno " + (i + 1) + ": ");
            String nombre = scanner.next();

            System.out.print("Introduce la nota PEC1 del alumno " + (i + 1) + ": ");
            double PEC1 = scanner.nextDouble();

            System.out.print("Introduce la nota PEC2 del alumno " + (i + 1) + ": ");
            double PEC2 = scanner.nextDouble();

            Alumno alumno = new Alumno(nombre, PEC1, PEC2);

            alumnos[i] = alumno;
        }

        for (int i = 0; i < n; i++) {
            alumnos[i].calcularMediaPonderada();
            System.out.println("El alumno " + alumnos[i].nombre + " tiene una media ponderada de: " + alumnos[i].getMediaPonderada());
        }

        scanner.close();
    }
}
