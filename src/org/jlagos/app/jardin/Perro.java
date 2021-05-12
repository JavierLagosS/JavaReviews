package org.jlagos.app.jardin;

import org.jlagos.app.hogar.Persona;

public class Perro {
    // Public = publicas
    // private = Las clases que estan dentro del mismo paquete
    // protected = es modificable dentro del mismo paquete y desde hereda
    protected String nombre;
    protected String raza;
    String jugar(Persona persona){
        return persona.lanzarPelota();
    }
}
