public class Caracteres {
    public static void main(String[] args) {

        // Buscar en windows mapa de caracteres , para 
        char caracter= '\u0040';
        char decimal= 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter = " + (decimal == caracter));
        
        char simbolo ='@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("(simbolo == caracter) = " + (simbolo == caracter));

        char espacio = '\u0020';
        char retroceso ='\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro= '\r';


        System.out.println("tipo Character corresponde en byte a"+System.lineSeparator() + Character.BYTES);
        System.out.println("tipo Character corresponde en bites a  " + Character.SIZE);
        System.out.println(" el valor maximo de un Character : " + Character.MAX_VALUE);
        System.out.println(" el valor Minimo de un Character : " + Character.MIN_VALUE);

    }
}
