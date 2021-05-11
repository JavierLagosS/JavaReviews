package Matrices;

public class EjemploMatricesColumnasVariables {
    public static void main(String[] args) {
        int[][] matriz = new int[3][];
    matriz[0]  = new int[2];
    matriz[1] = new int[3];
    matriz[2] = new int[4];


        System.out.println("matriz.length = " + matriz.length);
        System.out.println("fila 0 lenght = " + matriz[0].length);
        System.out.println("fila 1 lenght = " + matriz[1].length);
        System.out.println("fila 2 lenght = " + matriz[2].length);

        System.out.println("=== Poblando la matriz");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i+j;
            }
        }


        System.out.println("=== Iterando con foreach");
        for( int[] dato : matriz){
            for (int datounico: dato){
                System.out.print(datounico + "\t");
            }
            System.out.println();
        }



    }
}
