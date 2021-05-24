package poointerfacess.genericsclass;

public class EjemploGenericos {
    public static <T> void imprimirCamion(Camion<T> camion){
        for (T a:camion){
            if (a instanceof  Animal) {
                System.out.println(((Animal)a).getNombre() + " tipo: " + ((Animal)a).getTipo());
            }
            else if (a instanceof Maquinaria){
                System.out.println(((Maquinaria)a).getTipo());
            }
            else if (a instanceof Automovil){
                System.out.println(((Automovil)a).getMarca());
            }
        }
    }
    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Peregrino", "Caballo"));
        transporteCaballos.add(new Animal("grillo", "Caballo"));
        transporteCaballos.add(new Animal("tunquen", "Caballo"));
        transporteCaballos.add(new Animal("Topocalma", "Caballo"));
        transporteCaballos.add(new Animal("LongoToma", "Caballo"));



        imprimirCamion(transporteCaballos);
        // Cree el tooString en la clase animal , asi  puedo usar for each y no creo un metodo
        transporteCaballos.forEach(System.out::println);



        Camion<Maquinaria> transMaquinas = new Camion<>(3);
        transMaquinas.add(new Maquinaria("Bulldozer"));
        transMaquinas.add(new Maquinaria("Grua Horquilla"));
        transMaquinas.add(new Maquinaria("Perforadora"));

        imprimirCamion(transMaquinas);

        Camion<Automovil> transAuto = new Camion<>(3);
        transAuto.add(new Automovil("Toyota"));
        transAuto.add(new Automovil("Mitsubichi"));
        transAuto.add(new Automovil("Chevrolet"));

        imprimirCamion(transAuto);

    }
}
