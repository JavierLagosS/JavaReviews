package pooexcepciones.ejemplo;

public class DivisionPorZeroExcepcion extends Exception{
    public DivisionPorZeroExcepcion(String mensaje){
        super(mensaje);
    }
}
