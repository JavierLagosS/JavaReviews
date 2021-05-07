import java.util.Properties;

public class EjemploPropiedadesDelSistema {
    public static void main(String[] args) {
        //https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
        // link con toda la documentacion correspondiente
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator2 = " + lineSeparator2);

        Properties p = System.getProperties();
        p.list(System.out);
    }
}
