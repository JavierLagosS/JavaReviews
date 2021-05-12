package POO;

import java.util.Date;

// encapsulamiento es la abstraccion de los metodos,
public class EjemploAutomovil {
    public static void main(String[] args) {

        Motor motorSusuki=new Motor(2.0,TipoMotor.Bencina);
        Automovil susuki = new Automovil("Susuki","Swift");
        susuki.setColor(Color.BLANCO);
        susuki.setMotor(motorSusuki);
        susuki.setEstanque(new Estanque(40));

        Motor motorMazda = new Motor(3.0,TipoMotor.Diesel);
        Automovil mazda = new Automovil("Mazda","BT-50", Color.AZUL,motorMazda);

        Motor motorNissan = new Motor(3.5, TipoMotor.Diesel);
        Automovil nissan = new Automovil("Nissan","navara",Color.NEGRO,motorNissan,new Estanque(50));
        Automovil nissan2 = new Automovil("Nissan","navara",Color.NEGRO,motorNissan,new Estanque(50));

        Automovil auto = new Automovil();
        Date fecha = new Date();
        System.out.println("Son Iguales ? " + (nissan==nissan2));
        System.out.println("Son Iguales con equals ? " + (nissan.equals(nissan2)));

        // Se soobreescribe metodo equals en el POJO , para que no lance un null pointer exception

        System.out.println(" Son iguales =?" + nissan.equals(auto));

        // se mejora el metodo equals en el POJO , para que discrimine y no lance
        // error al comparar objetos diferentes

        System.out.println(nissan.equals(fecha));

        // Imprime el Hashcode de manera implicita
        // si se sobrescribe en el POJO , la manera implicita tambien se vera afectada
        System.out.println(nissan);
        // Imprime el HashCode de manera Explicita
        System.out.println(nissan.toString());




        System.out.println(susuki.verDetalle());
        System.out.println("mazda = " + mazda.acelerar(2333));
        System.out.println("mazda.frenar() = " + mazda.frenar());
        System.out.println();
        System.out.println(mazda.verDetalle());

        System.out.println("susuki = " + susuki.acelerarFrenar(4000));

        System.out.println(" Kilometros por litro " + susuki.calcularConsumo(300,0.6f));
        System.out.println(" Kilometros por litro " + susuki.calcularConsumo(300,60));



    }
}
