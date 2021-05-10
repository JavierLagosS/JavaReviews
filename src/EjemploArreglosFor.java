import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;
        productos[0]= "Kingston Pendrive 64GB";
        productos[1]= "Samsug galaxy";
        productos[2]= "Disco Duro .....";
        productos[3]= "Asus Notebook";
        productos[4]= "Macbook air";
        productos[5]= "Chromecast 4ta generacion";
        productos[6]= "Bicicleta Oxford";

        Arrays.sort(productos);
        System.out.println(" === Usando for ===");
        for (int i = 0; i < total ; i++) {
            System.out.println(" Para indice "+ i +": "+productos[i]);
        }

        System.out.println(" === Usando Foreach ===");
        for(String prod:productos){
            System.out.println("prod = " + prod);

        }

        System.out.println("===Usando While ===");
        int i=0;
        while (i<total){
            System.out.println("para indice "+ i + ":" +productos[i]);
            i++;
        }

        System.out.println("=== Usando Do While ==="  );
        int j=0;
        do {
            System.out.println("Para indice" + j + ": " +productos[i]);
            j++;
        }while (i<total);

        int[] numeros = new int[4];
    int totalNumeros =numeros.length;

        for (int k = 0; k <totalNumeros ; k++) {
            numeros[k] = k*3;
        }
        for (int k = 0; k <totalNumeros ; k++) {
            System.out.println("numeros = " + numeros[k]);
        }







    }
}
