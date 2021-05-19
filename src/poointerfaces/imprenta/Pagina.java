package poointerfaces.imprenta;


import poointerfaces.imprenta.modelo.Hoja;

public class Pagina extends Hoja implements IImprimible {

    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return this.contenido;
    }
}
