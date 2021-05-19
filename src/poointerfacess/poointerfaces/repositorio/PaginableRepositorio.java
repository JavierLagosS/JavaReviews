package poointerfacess.poointerfaces.repositorio;

import poointerfacess.poointerfaces.modelo.Cliente;
import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde , int hasta);

}
