package Matrices;

public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {
        String[][] nombres = {{"Pepe","Pepa"},{"Josefa","Paco"},{"Lucas","Pancha"}};


        System.out.println("=== iterando con ForEach: ===");
        for (String[] fila: nombres){
            for (String nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }



    }
}
