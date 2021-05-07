public class ConversionDeTipos {
    public static void main(String[] args) {

        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = " 987654.43e-3";
        double realDouble= Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logitoStr = "false";
        boolean logicoboolean = Boolean.parseBoolean(logitoStr);
        System.out.println("logicoboolean = " + logicoboolean);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr= String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = 32768;
        // se fuerza la conversion pero puede haber perdida de datos
        short s = (short)i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char b = (char)i;
        System.out.println("b = " + b);
        float f = (float)i;
        System.out.println("f = " + f);



    }
}
