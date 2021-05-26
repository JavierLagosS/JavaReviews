package poointerfacess.poointerfaces.repositorio;


import poointerfacess.poointerfaces.modelo.BaseEntity;
import poointerfacess.poointerfaces.repositorio.excepciones.EscrituraAccesoDatoException;
import poointerfacess.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;
import poointerfacess.poointerfaces.repositorio.excepciones.RegistroDuplicadoAccesoDatoException;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractaListRepositorio<T extends BaseEntity> implements OrdenablePaginableCrudRepositorio<T>{


    protected List<T> dataSource;

    public AbstractaListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }

    @Override
    public T porId(Integer id) throws LecturaAccesoDatoException {
        if (id == null || id>=0){
            throw new LecturaAccesoDatoException("Id invalido debe ser > 0" );
        }
        T resultado = null;
        for(T cli: dataSource){
            if(cli.getId() != null && cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(T t) throws EscrituraAccesoDatoException {
        if (t==null){
            throw new EscrituraAccesoDatoException("Error al insertar un objeto null");
        }
        // Manejo de error para no crear duplicado un objeto
        if (this.dataSource.contains(t)){
            throw new RegistroDuplicadoAccesoDatoException("Error el objeto con id "+ t.getId()+
                    "existe en el repositorio");
        }

        this.dataSource.add(t);
    }

    @Override
    public void eliminar(Integer id) throws LecturaAccesoDatoException  {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    @Override
    public int count() {
        return this.dataSource.size();
    }
}
