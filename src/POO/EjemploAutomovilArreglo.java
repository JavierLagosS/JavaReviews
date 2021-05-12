package POO;

import java.util.Arrays;

// encapsulamiento es la abstraccion de los metodos,
public class EjemploAutomovilArreglo {
    public static void main(String[] args) {



        Persona conductorSusuki= new Persona("Luci", "Martinez");

        Automovil susuki = new Automovil("Susuki","Swift");
        Motor motorSusuki=new Motor(2.0,TipoMotor.Bencina);
        susuki.setColor(Color.BLANCO);
        susuki.setMotor(motorSusuki);
        susuki.setEstanque(new Estanque());
        susuki.setTipo(TipoAutomovil.SEDAN);
        susuki.setConductor(conductorSusuki);


        Persona pato = new Persona("Pato","Rodriguez");
        Motor motorMazda = new Motor(3.0,TipoMotor.Diesel);
        Automovil mazda = new Automovil("Mazda","BT-50",Color.AZUL,motorMazda);
        mazda.setTipo(TipoAutomovil.COUPE);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);



        Persona bea = new Persona("Bea", "Gonzales");
        Motor motorNissan = new Motor(3.5, TipoMotor.Diesel);
        Automovil nissan = new Automovil("Nissan","navara",Color.ROJO,motorNissan,new Estanque(50));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);

       Persona lalo = new Persona("lalo", "Mena");
        Automovil subaru = new Automovil("Subaru","Impreza",Color.ROJO,motorNissan,new Estanque(50));
        subaru.setConductor(lalo);
        subaru.setTipo(TipoAutomovil.PICKUP);

        Automovil.setColorPatente(Color.NARANJO);
        Automovil audi = new Automovil("Audi","A3");
        audi.setConductor(new Persona("Javier","Lagos"));

        Automovil[] autos =new Automovil[5];
        autos[0]=susuki;
        autos[1]=mazda;
        autos[2]=nissan;
        autos[3]=subaru;
        autos[4]=audi;

        Arrays.sort(autos);
        for (Automovil auto : autos) {
            System.out.println(auto);
        }



    }
}
