package POO;

import static POO.TipoAutomovil.*;

// encapsulamiento es la abstraccion de los metodos,
public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);

        Motor motorSusuki=new Motor(2.0,TipoMotor.Bencina);
        Automovil susuki = new Automovil("Susuki", "Swift");
        susuki.setColor(Color.BLANCO);
        susuki.setMotor(motorSusuki);
        susuki.setTipo(TipoAutomovil.SEDAN);

        Motor motorMazda = new Motor(3.0,TipoMotor.Diesel);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.AZUL, motorMazda);
        mazda.setTipo(COUPE);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());


        TipoAutomovil tipo = susuki.getTipo();
        System.out.println("tipoSusuki = " + tipo.getNombre());
        System.out.println("tipoSusuki = " + tipo.getDescripcion());

        tipo = susuki.getTipo();
        switch (tipo) {
            case CONVERTIBLE:
                System.out.println("El automovil es deportivo y descapotable de dos puertas");
                break;
            case COUPE:
                System.out.println("Es un automovil pequeño de dos puertas y típicamente deportivo");
                break;
            case FURGON:
                System.out.println("Es un automovil utilitario de transporte, de empresas");
                break;
            case HATCHBACK:
                System.out.println("Es un automovil mediano compacto, aspecto deportivo");
                break;
            case PICKUP:
                System.out.println("Es un automovil de doble cabina o camioneta");
                break;
            case SEDAN:
                System.out.println("Es un automovil mediano");
                break;
            case STATION_WAGON:
                System.out.println("Es un automovil más grande, con maleta grande...");
                break;
        }
        /*
        // ----- Switch moderno disponible desde java 13 , se puede usar la version flecha
        tipo = mazda.getTipo();
        switch(tipo){
            case CONVERTIBLE ->
                    System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case COUPE ->
                    System.out.println("Es un automovil pequeño de dos puertas y típicamente deportivo");
            case FURGON ->
                    System.out.println("Es un automovil utilitario de transporte, de empresas");
            case HATCHBACK ->
                    System.out.println("Es un automovil mediano compacto, aspecto deportivo");
            case PICKUP ->
                    System.out.println("Es un automovil de doble cabina o camioneta");
            case SEDAN ->
                    System.out.println("Es un automovil mediano");
            case STATION_WAGON ->
                    System.out.println("Es un automovil más grande, con maleta grande...");
        }
*/



        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta : tipos) {
            System.out.print(ta + " => " + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumeroPuerta());
            System.out.println();
        }


    }
}
