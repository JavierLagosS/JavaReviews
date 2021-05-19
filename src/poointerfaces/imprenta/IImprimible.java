package poointerfaces.imprenta;

public interface IImprimible {
// en una interfaz siemrpe debe ser publico asi que seria redundante incluirlo
String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";

    default String imprimir(){
        return TEXTO_DEFECTO;
    }

    static void imprimir(IImprimible imprimible){
        System.out.println(imprimible.imprimir());
    }


}
