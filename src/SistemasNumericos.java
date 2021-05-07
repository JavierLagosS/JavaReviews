import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 0;

         try {
              numeroDecimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entero "));
         }catch (NumberFormatException e){
             JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
             main(args);
             System.exit(0);
         }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "numero binario de  " + numeroDecimal + "=" + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        String mensajeOctal = "El octal de  = " + numeroDecimal + " = "+ Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);

        int numeroOctal= 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        String mensajeHexadecimal= "Numero hexadecimal de  = " + numeroDecimal + "=" + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHexadecimal);

        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        String mensaje = mensajeBinario;
        mensaje += mensajeOctal;
        mensaje += mensajeHexadecimal;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
