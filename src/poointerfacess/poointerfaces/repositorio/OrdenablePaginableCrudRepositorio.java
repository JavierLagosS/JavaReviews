package poointerfacess.poointerfaces.repositorio;

//Herencia Multiple de interfaces
public interface OrdenablePaginableCrudRepositorio extends OrdenableRepositorio,
PaginableRepositorio,CrudRepositorio, ContableRepositorio{
}
