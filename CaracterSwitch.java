public class CaracterSwitch {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Introduce un argumento");
            System.exit(1);
        }

        char c = args[0].charAt(0);

        switch (c) {
            case 'a':
                System.out.println("Es una vocal");
                System.out.println("Es la vocal a");
                break;
            case 'e':
                System.out.println("Es una vocal");
                System.out.println("Es la vocal e");
                break;
            case 'i':
                System.out.println("Es una vocal");
                System.out.println("Es la vocal i");
                break;
            case 'o':
                System.out.println("Es una vocal");
                System.out.println("Es la vocal o");
                break;
            case 'u':
                System.out.println("Es una vocal");
                System.out.println("Es la vocal u");
                break;
            case 'A':
                System.out.println("Es una vocal");
                System.out.println("Es la vocal A");
                break;
            case 'E':
                System.out.println("Es una vocal");
                System.out.println("Es la vocal E");
                break;
            case 'I':
                System.out.println("Es una vocal");
                System.out.println("Es la vocal I");
                break;
            case 'O':
                System.out.println("Es una vocal");
                System.out.println("Es la vocal O");
                break;
            case 'U':
                System.out.println("Es una vocal");
                System.out.println("Es la vocal U");
                break;
            default:
                System.out.println("No es una vocal");
                break;
        }
    }
}
