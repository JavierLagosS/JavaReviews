package colecciones.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        // Metodo treeSet , menos optimizado y ordena automaticamente en orden Alfabetico

        // para Usarlos debes implementar la clase Comparable
        // Usamos un landa para comparar ambos valores y que sea descendente
        //Set<String> ts = new TreeSet<>((a,b) ->b.compareTo(a));

        // Version Recomendada por IDE , usar el metodo automatico

        Set<String> ts = new TreeSet<>(Comparator.reverseOrder());
        ts.add("Uno");
        ts.add("Dos");
        ts.add("Tres");
        ts.add("Cuatro");
        ts.add("Cinco");

        System.out.println("ts = " + ts);

        Set<Integer> numeros = new TreeSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(71);
        System.out.println("numeros = " + numeros);
    }
}
