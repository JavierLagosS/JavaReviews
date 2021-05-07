import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes entre 1-12");
        int mes =s.nextInt();
        String nombreMes= null;

        switch (mes){
            case 1:
                nombreMes="enero";
                break;
            case 2:
                nombreMes="febrero";
                break;
            case 3:
                nombreMes="marzo";
                break;
            case 4:
                nombreMes="abril";
                break;
            case 5:
                nombreMes="mayo";
                break;
            case 6:
                nombreMes="junio";
                break;
            case 7:
                nombreMes="julio";
                break;
            case 8:
                nombreMes="agosto";
                break;
            case 9:
                nombreMes="septiembre";
                break;
            case 10:
                nombreMes="octubre";
                break;
            case 11:
                nombreMes="noviembre";
                break;
            case 12:
                nombreMes="diciembre";
                break;
            default:
                nombreMes="indefinido";
                break;
        }
        System.out.println("nombreMes = " + nombreMes);




        int num =3;
        switch (num){
            case '0':
                System.out.println("el num es 0");
                break;
            case '1':
                System.out.println("el num es 1");
                break;
            case '2':
                System.out.println("el num es 2");
                break;
            case '3':
                System.out.println("el num es 3");
                break;
            case 'a':
                System.out.println("el caracter es a");
                break;
            default:
                System.out.println("El caracter o numero no es reconocido");
                break;
        }
    }
}
