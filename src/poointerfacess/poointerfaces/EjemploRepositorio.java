package poointerfacess.poointerfaces;

import poointerfacess.poointerfaces.modelo.Cliente;
import poointerfacess.poointerfaces.repositorio.*;
import poointerfacess.poointerfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        OrdenablePaginableCrudRepositorio<Cliente> repositorio = new ClienteListRepositorio();

        repositorio.crear(new Cliente("Jano","Perez"));
        repositorio.crear(new Cliente("Bea","Gonzales"));
        repositorio.crear(new Cliente("Luci","Martinez"));
        repositorio.crear(new Cliente("Javier","Lagos"));

       List<Cliente> clientes= repositorio.listar();
        clientes.forEach(System.out::println);

        System.out.println("=== Paginable ===");
        List<Cliente> paginable = repositorio.listar(1,3);
        paginable.forEach(System.out::println);

        System.out.println( "=== ordernable Ascendente nombre===");
        List<Cliente> clientesOrdenAsc = repositorio
                .listar("nombre", Direccion.ASC);
        clientesOrdenAsc.forEach(System.out::println);

        System.out.println( "=== ordernable Descendente===");
        List<Cliente> clientesOrdenDesc = repositorio
                .listar("nombre", Direccion.DESC);
        clientesOrdenDesc.forEach(System.out::println);

        System.out.println("=== Editar ===");
        Cliente beaActualizar = new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repositorio.editar(beaActualizar);
        Cliente bea = repositorio.porId(2);
        System.out.println(bea);

        System.out.println("=== Eliminar === ");
        repositorio.eliminar(2);
        repositorio.listar().forEach(System.out::println);

        System.out.println("=== Total ===");
        System.out.println("Total Registros: " + repositorio.count());

    }
}
