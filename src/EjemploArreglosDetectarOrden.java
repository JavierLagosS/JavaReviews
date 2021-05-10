import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {
        int[] a = new int[7];
        Scanner s= new Scanner(System.in);
        System.out.println("Ingrese 7 numeros");
        for (int i = 0; i < a.length ; i++) {
            a[i] = s.nextInt();
        }
        boolean ascendente = false;
        boolean descentente = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >a[i+1]) {
                descentente= true;
            }
            if (a[i] <a[i+1]) {
                ascendente= true;
            }
        }


        if (ascendente==true && descentente==true){
            System.out.println("Arreglo = desordenados");
        }

        if( ascendente== false && descentente==false){
            System.out.println("Arreglo = todos son iguales");
        }
        if( ascendente== true && descentente==false){
            System.out.println("Arreglo = Ascendente");
        }

        if( ascendente== false && descentente==true){
            System.out.println("Arreglo =descendente");
        }



    }
}
