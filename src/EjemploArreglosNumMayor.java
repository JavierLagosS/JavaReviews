import java.util.Scanner;

public class EjemploArreglosNumMayor {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner s = new Scanner(System.in);

        System.out.println(" Ingrese 5 eneros: ");
        for (int i = 0; i < a.length; i++) {
            a[i]= s.nextInt();
        }
        int max =0;
        int min =0;
        for (int i = 1; i < a.length; i++) {
            max = (a[max] > a[i])? max:i;
            min = (a[min] < a[i])? min:i;
        }
        System.out.println("max = " + a[max]);
        System.out.println("min = " + a[min]);

    }
}
