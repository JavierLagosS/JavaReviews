public class EjemploStringInmutable {
    public static void main(String[] args) {

        String curso= "Programacion Java";
        String profesor = "Javier Lagos";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso==resultado);

        // la funcion de abajo debiese funcionar desde java 10
//        curso.transform(c ->{
//            return c + " con" + profesor;
//        });

        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        resultado.replace("a","A");
        System.out.println("resultado = " + resultado);

        // para que el replace se ve reflejado , hay que instanciarlo en una nueva variable

        String resultado3 =resultado.replace("a","A");
        System.out.println("resultado3 = " + resultado3);

    }
}
