public class Salario {
    public static void main(String[] args) {
        double horasTrabajadas = 50;
        double sueldo1 = 20;
        double sueldo2 = 30;
        double sueldoSemanal = 0;

        if (horasTrabajadas <= 40) {
            sueldoSemanal = horasTrabajadas * sueldo1;
        } else {
            double horasExtra = horasTrabajadas - 40;
            horasTrabajadas = horasTrabajadas - horasExtra;
            sueldoSemanal = horasTrabajadas * sueldo1;
            sueldoSemanal += horasExtra * sueldo2;
        }

        System.out.println("El sueldo semanal es de: " + sueldoSemanal + "€");
    }
}
