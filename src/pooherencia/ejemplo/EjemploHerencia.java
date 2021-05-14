package pooherencia.ejemplo;

import pooherencia.pooherencia.Alumno;
import pooherencia.pooherencia.AlumnoInternacional;
import pooherencia.pooherencia.Persona;
import pooherencia.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {

        // al declarar que es una clase Persona , no se puede acceder
        // a los metodos propios de la clase Alumno ,
        // por lo tanto hay que castear , hacia la clase alumno
        //Persona alumno = new Alumno();
        // ((Alumno)alumno).setInstitucion("Instituto Nacional");

        System.out.println("====== Creando La instancia de alumno ======");

        Alumno alumno = new Alumno();
        alumno.setNombre("Javier");
        alumno.setApellido("Lagos");
        alumno.setInstitucion("Instituto Nacional");
        alumno.setNotaMatematico(6.9);
        alumno.setNotaHistoria(4.8);
        alumno.setNotaLenguaje(6.1);
        System.out.println(" === Creando la instancia de alumno Internacional======");

        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Pan");
        alumnoInt.setEdad(16);
        alumnoInt.setPais("Australia");
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaLenguaje(5.5);
        alumnoInt.setNotaMatematico(6.8);
        alumnoInt.setNotaHistoria(4.9);


        System.out.println("==== crando la Instancia de Profesor ===== ");
        Profesor profesor = new Profesor();
        profesor.setNombre("Andres");
        profesor.setApellido("Guzman");
        profesor.setAsignatura("Herencia");



        System.out.println(alumno.getNombre() + " " +
                alumno.getApellido()+
                " estudia en : "+
                alumno.getInstitucion());
                //((Alumno) alumno).getInstitucion());

        System.out.println(alumnoInt.getNombre()+
                " " + alumnoInt.getApellido()+
                " " + alumnoInt.getInstitucion()+
                " " + alumnoInt.getPais());

        System.out.println(" Profesor "+ profesor.getAsignatura()+
                ": " + profesor.getNombre() +
                " " + profesor.getApellido());


        // Investiga las lineas jerarquicas
        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija+ "es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }


    }
}
