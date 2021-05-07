public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if (esNulo ) {
          curso="";//""Programacion Java"
        }
        boolean esVacio = curso.length()==0;
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        // para validar si es vacio o tiene un espacio en blanco , desde java 10 se puede implementar isBlanck
        //boolean esBlanco = curso.isBlank();


        if (!esVacio) {
            System.out.println(curso.toUpperCase());
            System.out.println(" Bienvenido al curso ".concat(curso));
        }
    }
}
