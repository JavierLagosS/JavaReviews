package poointerfacess.poointerfaces.repositorio;

//Herencia Multiple de interfaces
public interface OrdenablePaginableCrudRepositorio<T> extends OrdenableRepositorio<T>,
PaginableRepositorio<T>,CrudRepositorio<T>, ContableRepositorio{
}
