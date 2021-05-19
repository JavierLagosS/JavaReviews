package poointerfacess.poointerfaces.repositorio;
import poointerfacess.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {
    // Operaciones basicas de nuestro Crud
    List<Cliente> listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar( Integer id);
}
