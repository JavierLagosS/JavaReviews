public class EjemploString {
    public static void main(String[] args) {
        String curso ="Programacion Java";
        String curso2= new String("Programacion Java");

        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual = " + esIgual);

        String curso3 = "Programacion Java";
        esIgual = curso==curso3;
        System.out.println("curso3 = " + curso3);
    }
}
