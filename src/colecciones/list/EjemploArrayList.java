package colecciones.list;

import colecciones.modelo.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class EjemploArrayList {
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();
        System.out.println(al + ", size = " + al.size());
        System.out.println("esta vacia = " + al.isEmpty());

        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Luci", 4));
        al.add(new Alumno("Jano", 3));
        al.add(2, new Alumno("Jano", 3));
        al.set(3, new Alumno("Javier", 7));

        System.out.println(al + ", size = " + al.size());

        //al.remove(new Alumno("Jano", 3));
        al.remove(2);
        System.out.println(al + ", size = " + al.size());

        Object a[] = al.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println("Desde el arreglo = " + a[i]);
        }
    }
}
