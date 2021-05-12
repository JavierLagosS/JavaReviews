package org.jlagos.app.hogar;

import org.jlagos.app.jardin.Perro;

import static org.jlagos.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();
        String saludo = saludar();
    }
}
