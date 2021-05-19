package poointerfacess.poointerfaces.repositorio;

import poointerfacess.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);

}
