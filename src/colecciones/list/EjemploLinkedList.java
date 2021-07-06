package colecciones.list;

import colecciones.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class EjemploLinkedList {
    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("esta vacia = " + enlazada.isEmpty());

        enlazada.add(new Alumno("Pato", 5));
        enlazada.add(new Alumno("Cata", 6));
        enlazada.add(new Alumno("Luci", 4));
        enlazada.add(new Alumno("Jano", 3));
        enlazada.add(new Alumno("Javier",7));

        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.addFirst(new Alumno("zeus", 6));
        enlazada.addLast(new Alumno("Atenas", 6));

        // Get First lanza la excepcion en caso de no encontrar el objeto
        System.out.println(enlazada.getFirst());
        System.out.println(enlazada.peekLast());

        enlazada.removeLast();

    }
}
