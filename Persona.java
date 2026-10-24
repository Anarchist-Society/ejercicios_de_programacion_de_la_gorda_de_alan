public class Persona {
    String nombre;
    String ciudad;
    String telefono;
    private int edad;
    int añoActual = 2026;

    Persona(String nombre, String ciudad, String telefono) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarAtributos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Telefono: " + telefono);
        System.out.println("Edad: " + edad);
        System.out.println("Año Actual: " + añoActual);
    }

    public int añoNacimento() {
        return añoActual - edad;
    }

    public boolean esBisiesto() {
        if ((añoNacimento() % 400 == 0 || añoNacimento() % 4 == 0) && añoNacimento() % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
