package pooherencia.ejemplo;

import pooherencia.pooherencia.Alumno;
import pooherencia.pooherencia.AlumnoInternacional;
import pooherencia.pooherencia.Persona;
import pooherencia.pooherencia.Profesor;

public class EjemploHerenciaSobrecargaToString {
    public static void main(String[] args) {

        // al declarar que es una clase Persona , no se puede acceder
        // a los metodos propios de la clase Alumno ,
        // por lo tanto hay que castear , hacia la clase alumno
        //Persona alumno = new Alumno();
        // ((Alumno)alumno).setInstitucion("Instituto Nacional");

        System.out.println("====== Creando La instancia de alumno ======");

        Alumno alumno = new Alumno("Javier", "lagos",27,"Instituto Nacional");
        alumno.setNotaMatematica(6.9);
        alumno.setNotaHistoria(4.8);
        alumno.setNotaLenguaje(6.1);
        alumno.setEmail("Javier@mail.cl");


        System.out.println(" === Creando la instancia de alumno Internacional======");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Pan","Australia");
        alumnoInt.setEdad(16);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaLenguaje(5.5);
        alumnoInt.setNotaMatematica(6.8);
        alumnoInt.setNotaHistoria(4.9);
        alumnoInt.setNotaIdiomas(7.0);
        alumnoInt.setEmail("Pepe@mail.com");

        System.out.println("==== crando la Instancia de Profesor ===== ");
        Profesor profesor = new Profesor("Andres","Guzman","Herencia");
        profesor.setEdad(40);
        profesor.setEmail("Andres@master.com");


        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);


    }

    public static void imprimir(Persona persona){
        System.out.println(persona);
    }
}
