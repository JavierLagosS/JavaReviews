package poointerfaces.imprenta;

import poointerfaces.imprenta.modelo.*;
import poointerfaces.imprenta.modelo.Genero.*;
import static poointerfaces.imprenta.IImprimible.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo(new Persona("Javier", "Lagos"), "Desarrollador", "Resumen Laboral");
        cv.addExperiencia("Java")
                .addExperiencia("javascript")
                .addExperiencia("Css")
                .addExperiencia("React")
                .addExperiencia("Full Stack")
                .addExperiencia("Swift");

        Libro libro = new Libro(new Persona("Erich", " Ganna"), "Patrones de diseño: Elem. Reusables POO",
                Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));


        Informe informe = new Informe(new Persona("Andres", "Guzman"), new Persona("bill", " Gates"), "Estudio Sobre microservicios");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        imprimir(new IImprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto genérico de una clase anónima!";
            }
        });

        System.out.println(TEXTO_DEFECTO);
    }
}