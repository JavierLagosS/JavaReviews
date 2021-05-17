package pooherencia.ejemplo;

import pooherencia.pooherencia.Alumno;
import pooherencia.pooherencia.AlumnoInternacional;
import pooherencia.pooherencia.Persona;
import pooherencia.pooherencia.Profesor;

public class EjemploHerenciaConstructores {
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
        System.out.println("Imprimiendo datos en comun del tipo  Persona");
        System.out.println("Nombre: "+ persona.getNombre()+
                ", Apellido:  " + persona.getApellido()+
                ", edad: " + persona.getEdad()+
                ", email:  " + persona.getEmail());
        if(persona instanceof Alumno){
            System.out.println("Institucion: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota Matematica: "+ ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota Historia: "+ ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota Lenguaje: "+ ((Alumno) persona).getNotaLenguaje());
            if (persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional: ");
                System.out.println("Nota idiomas: " + ((AlumnoInternacional)persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional)persona).getPais());
            }
            System.out.println("=========== Sobre Escritura Promedio ===============");
            System.out.println("Promedio : "+((Alumno) persona).calcularPromedio());

            System.out.println("=========== Sobre Escritura Promedio ===============");

        }

        if (persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del tipo Profesor");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }

        System.out.println("=========== Sobre Escritura saludar ===============");
        System.out.println(persona.saludar());
        System.out.println("===============================");



    }
}
