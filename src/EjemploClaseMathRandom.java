import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"azul","Amarillo","Rojo", "Verde", "Blanco", "Negro"};

        double random = Math.random();
        System.out.println("random = " + random);
        random*=colores.length;

        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int)random]);

        // Ejemplo Random de la libreria Java Util

        Random randomObj = new Random();
        int randomInt = 15+randomObj.nextInt(25-15);
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores[randomInt] = " + colores[randomInt]);






    }
}
