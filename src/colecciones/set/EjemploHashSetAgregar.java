package colecciones.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {

        // lOS set no se pueden comparar como un arraylist
        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println("hs = " + hs);

        boolean b = hs.add("tres");
        System.out.println("Permite elementos duplicados = "+ b);
        System.out.println(hs);



    }
}
