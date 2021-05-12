package POO;

// encapsulamiento es la abstraccion de los metodos,
public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);


        Motor motorSusuki=new Motor(2.0,TipoMotor.Bencina);
        Automovil susuki = new Automovil("Susuki","Swift");
        susuki.setColor(Color.BLANCO);
        susuki.setMotor(motorSusuki);
        susuki.setTipo(TipoAutomovil.SEDAN);
        System.out.println(Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Automovil.VELOCIDAD_MAX_CIUDAD = " + Automovil.VELOCIDAD_MAX_CIUDAD);

        Motor motorMazda = new Motor(3.0,TipoMotor.Diesel);
        Automovil mazda = new Automovil("Mazda","BT-50",Color.AZUL,motorMazda);
        mazda.setTipo(TipoAutomovil.COUPE);

        Motor motorNissan = new Motor(3.5, TipoMotor.Diesel);
        Automovil nissan = new Automovil("Nissan","navara",Color.ROJO,motorNissan,new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan2 = new Automovil("Nissan","navara",Color.ROJO,motorNissan,new Estanque(50));
        nissan2.setTipo(TipoAutomovil.PICKUP);

        Automovil.setColorPatente(Color.NARANJO);
        Automovil auto = new Automovil();


        System.out.println(susuki.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());

        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoStatico(300,70));

        //mazda.setEstanque(new Estanque(40));
        System.out.println(mazda.calcularConsumo(300,70));

    }
}
