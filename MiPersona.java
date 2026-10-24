public class MiPersona {
    public static void main(String[] args) {
        String nombre = "Juan Manuel Michalay Gavilán";
        String ciudad = "Marconi";
        String telefono = "611526180";

        Persona persona = new Persona(nombre, ciudad, telefono);

        persona.setEdad(15);

        persona.mostrarAtributos();

        int añoNacimento = persona.añoNacimento();

        System.out.println("Juan nació en: " + añoNacimento);

        if (persona.esBisiesto()) {
            System.out.println("Juan nació en un año bisiesto");
        } else {
            System.out.println("Juan no nació en un año bisiesto");
        }
    }
}
