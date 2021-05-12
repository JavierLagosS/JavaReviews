package POO;

// encapsulamiento es la abstraccion de los metodos,
public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {



        Persona conductorSusuki= new Persona("Luci", "Martinez");

        Automovil susuki = new Automovil("Susuki","Swift");
        Motor motorSusuki=new Motor(2.0,TipoMotor.Bencina);
        susuki.setColor(Color.BLANCO);
        susuki.setMotor(motorSusuki);
        susuki.setEstanque(new Estanque());
        susuki.setTipo(TipoAutomovil.SEDAN);
        susuki.setConductor(conductorSusuki);
        //susuki.setRuedas(ruedasSusuki);
        Rueda[] ruedasSusuki= new Rueda[5];
        for (int i = 0; i < ruedasSusuki.length; i++) {
            susuki.addRueda( new Rueda("Yokohana",16,7.5));
        }


        Persona pato = new Persona("Pato","Rodriguez");
        Motor motorMazda = new Motor(3.0,TipoMotor.Diesel);
        Automovil mazda = new Automovil("Mazda","BT-50",Color.AZUL,motorMazda);
        mazda.setTipo(TipoAutomovil.COUPE);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);
        //mazda.setRuedas(ruedaMazda);
        Rueda[] ruedaMazda= new Rueda[5];
        for (int i = 0; i < ruedaMazda.length; i++) {
            mazda.addRueda(new Rueda("Michelin",18,10.5));
        }




        Persona bea = new Persona("Bea", "Gonzales");
        Motor motorNissan = new Motor(3.5, TipoMotor.Diesel);
        Automovil nissan = new Automovil("Nissan","navara",Color.ROJO,motorNissan,new Estanque(50));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.addRueda(new Rueda("Pirelli",20,11.5))
                .addRueda(new Rueda("Pirelli",20,11.5))
                .addRueda(new Rueda("Pirelli",20,11.5))
                .addRueda(new Rueda("Pirelli",20,11.5))
                .addRueda(new Rueda("Pirelli",20,11.5));


        Rueda[] ruedaNissan2 = {new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5)};
        Persona lalo = new Persona("lalo", "Mena");
        Automovil nissan2 = new Automovil("Nissan","navara",Color.ROJO,motorNissan,new Estanque(50),lalo,ruedaNissan2);
        nissan2.setTipo(TipoAutomovil.PICKUP);

        Automovil.setColorPatente(Color.NARANJO);
        Automovil auto = new Automovil();


        System.out.println(susuki.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());

        /*
        System.out.println("Conductor Susuki:"+ susuki.getConductor());
        System.out.println("Ruedas Susuki: ");
        for (Rueda r:susuki.getRuedas()){
            System.out.println(r.getFabricante()+ " aro: "+ r.getAro()+" ancho: "+ r.getAncho());
        }*/



    }
}
