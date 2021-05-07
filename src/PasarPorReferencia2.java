class Persona{
    // principio de invisibilidad o ocultacion dice que
    // toda variable de una clase debe ser
    //privada y solo puede ser modificicada mediante metodos
    private String nombre;
    public void modificarNombre(String nuevoNombre){
        this.nombre=nuevoNombre;
    }
    public String leerNombre(){
        return this.nombre;
    }
}


public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona= new Persona();
        persona.modificarNombre("Javier" );

        System.out.println("Iniciamos el metodo main ");
        System.out.println("persona.leerNombre() = " + persona.leerNombre());


        System.out.println("Antes de llamar al metodo test");
        test(persona);
        System.out.println("Despues de llamar al metodo test");

        System.out.println("persona.leerNombre() = " + persona.leerNombre());



        System.out.println("Finaliza el metodo main con los datos del arreglo modificados" );

    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el metodo test ");
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza el metodo test ");

    }

}
