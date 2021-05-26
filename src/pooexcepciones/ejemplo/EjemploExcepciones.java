package pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        String denominador = JOptionPane.showInputDialog("Ingrese un denominador");
        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador");
        int divisor ;
        double division;

        try {
           // divisor = Integer.parseInt(valor);
           // division = cal.dividir(10, divisor);
           // System.out.println("division = " + division);

            double division2 = cal.dividir(numerador,denominador);
            System.out.println("division2 = " + division2);

            // al usar un catch es adecuado tratar las excepciones lo
            // mas especificas posibles , para manejar correctamente el error
        }catch (NumberFormatException nfe){
            System.out.println("Se detecto una excepcion: por favor ingrese un valor numerico " + nfe.getMessage() );
            main(args);
        }catch (FormatoNumeroException fne){
            System.out.println("Se detecto una excepcion : Ingrese un numero valido: " + fne.getMessage());
            fne.printStackTrace(System.out);
            main(args);
        }catch (DivisionPorZeroExcepcion ae){
            System.out.println("Capturamos la excepcion en tiempo de ejecucion" + ae.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional , pero se ejecuta siempre con excepcion o sin ella");
        }
        System.out.println(" Continuamos con la ejecucion");
    }

}
