package colecciones.set;

import colecciones.modelo.Alumno;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        // El treeSet permite comparar invocando los argumentos inmediatamente

        // Si el valor esta duplicado con TreeSet lo omite, por el metodo comparable
        Set<Alumno> sa = new TreeSet<>((a,b) -> a.getNombre().compareTo(b.getNombre()));

        // Metodo Recomendado por el IDE
        //Set<Alumno> sa = new TreeSet<>(Comparator.comparing(Alumno::getNota));
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));

        System.out.println("sa = " + sa);

    }
}
