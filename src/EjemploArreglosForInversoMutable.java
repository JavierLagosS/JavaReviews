import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public static void arregloInverso (String[] arreglo){
        int total2= arreglo.length;
        int total= arreglo.length;
        for (int i = 0; i < total2/2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
        }
    }
    public static void main(String[] args) {

        String productos[] = {"Kingston Pendrive 64GB","Samsug galaxy",
                "Disco Duro .....","Asus Notebook","Macbook air","Chromecast 4ta generacion",
                "Bicicleta Oxford"};

        int total = productos.length;

        Arrays.sort(productos);
        // arregloInverso(productos);

        // hace lo mismo que el metodo que construimos arriba
        // solo que asi ya vienen implementado en el JDK de Java
        Collections.reverse(Arrays.asList(productos));


        System.out.println(" === Usando for ===");
        for (int i = 0; i < total; i++) {
            System.out.println(" para indice " + i + " : " + productos[i]);

        }
    }
}
