package poointerfacess.poointerfaces.repositorio;

import poointerfacess.poointerfaces.repositorio.excepciones.AccesoDatosException;

import java.util.List;

public interface CrudRepositorio<T> {
    // Operaciones basicas de nuestro Crud
    List<T> listar();
    T porId(Integer id) throws AccesoDatosException;
    void crear(T t) throws  AccesoDatosException;
    void editar(T t) throws AccesoDatosException;
    void eliminar( Integer id) throws AccesoDatosException;
}
