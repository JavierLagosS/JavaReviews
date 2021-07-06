package colecciones.list;

import colecciones.modelo.Alumno;

import java.util.*;


public class EjemploListComparableComparator {
    public static void main(String[] args) {

        List<Alumno> sa = new ArrayList<>();

        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 2));

        //Collections.sort(sa, (a, b) -> b.getNota().comparateTo(a.getNota()));
        sa.sort(Comparator.comparingInt(Alumno::getNota).reversed());

        System.out.println("sa = " + sa);

        System.out.println("iterando usando un Foreach");
        for(Alumno a: sa) {
            System.out.println("a.getNombre() = " + a.getNombre());
        }

        System.out.println("Iterando usando while y iterator");
        Iterator<Alumno> it = sa.iterator();
        while(it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);
    }
}
