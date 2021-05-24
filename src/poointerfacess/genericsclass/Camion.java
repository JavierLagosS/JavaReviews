package poointerfacess.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// al implementar Iterable podemos recorrer la clase con un foreach
public class Camion <T> implements Iterable<T>{


    private List<T> objetos;
    private  int max;

    public Camion(int max) {
        this.max = max;
        this.objetos= new ArrayList();
    }

    public  void  add(T objeto){
        if(this.objetos.size() <= max){
            this.objetos.add(objeto);
        }else {
            // Estamos lanzando con throw un objeto de exepcion
            throw  new RuntimeException("No hay mas espacio.");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }
}
