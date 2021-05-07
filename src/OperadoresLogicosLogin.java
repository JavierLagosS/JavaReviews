import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
//        String[] usernames = new String[2];
//        String[] passwords = new String[2];
//        usernames[0] = "javier";
//        passwords[0]="12345";
//        usernames[1] = "admin";
//        passwords[1]="12345";

        String[] usernames = {"javier","admin"};
        String[] passwords = {"12345","admin"};


        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el username");

        String u = scanner.next();

        System.out.println("ingrese el password");

        String p = scanner.next();

        boolean esAutentico = false;

        for (int i = 0; i < usernames.length; i++) {
            esAutentico= (usernames[i].equals(u) && passwords[i].equals(p))? true : esAutentico;

            /*if (usernames[i].equals(u) && passwords[i].equals(p)) {
                esAutentico = true;
                break;
            }
             */
        }

        String mensaje = esAutentico ? "Bienvenido usuario ".concat(u).concat("!"):
                "username o contraseña incorrecto! \n Lo siento , requiere autentificacion ";

        System.out.println(mensaje);

        /*
        if (esAutentico) {
            System.out.println("bienvenido usuario : ".concat(u).concat("!"));
        } else {
            System.out.println("Usuario o contraseña Incorrecta");
            System.out.println("No estas registrado , lo siento ");
        }

         */


    }
}
