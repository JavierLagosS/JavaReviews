package poointerfacess.poointerfaces;

import poointerfacess.poointerfaces.modelo.Cliente;
import poointerfacess.poointerfaces.modelo.Producto;
import poointerfacess.poointerfaces.repositorio.Direccion;
import poointerfacess.poointerfaces.repositorio.OrdenablePaginableCrudRepositorio;
import poointerfacess.poointerfaces.repositorio.lista.ClienteListRepositorio;
import poointerfacess.poointerfaces.repositorio.lista.ProductListRepositorio;

import java.util.List;

public class EjemploRepositorioInterfaces {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio<Producto> repositorio = new ProductListRepositorio();

        repositorio.crear(new Producto("Mesa",50.52));
        repositorio.crear(new Producto("Silla",18.0));
        repositorio.crear(new Producto("Lampara",15.5));
        repositorio.crear(new Producto("Notebook",400.124));

       List<Producto> productos= repositorio.listar();
        productos.forEach(System.out::println);

        System.out.println("=== Paginable ===");
        List<Producto> paginable = repositorio.listar(1,3);
        paginable.forEach(System.out::println);

        System.out.println( "=== Ordenable Ascendente ===");
        List<Producto> productosOrdenAsc = repositorio
                .listar("descripcion", Direccion.ASC);
        productosOrdenAsc.forEach(System.out::println);

        System.out.println( "=== ordernable Descendente===");
        List<Producto> productosOrdenDesc = repositorio
                .listar("nombre", Direccion.DESC);
        productosOrdenDesc.forEach(System.out::println);

        System.out.println("=== Editar ===");
        Producto LamparaActualizar = new Producto("Lampara", 60.8);
        LamparaActualizar.setId(3);
        repositorio.editar(LamparaActualizar);
        Producto lampara = repositorio.porId(3);
        System.out.println(lampara);

        System.out.println("=== Eliminar === ");
        repositorio.eliminar(2);
        repositorio.listar().forEach(System.out::println);

        System.out.println("=== Total ===");
        System.out.println("Total Registros: " + repositorio.count());

    }
}
