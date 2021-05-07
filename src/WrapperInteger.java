public class WrapperInteger {
    public static void main(String[] args) {
        Integer intObjeto = Integer.valueOf(32768);
        Integer intObjeto2= 32768;
        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto;
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLcf= "67000";
        Integer valor = Integer.valueOf(valorTvLcf);
        System.out.println("valor = " + valor);
        // recordar que puede haber perdida de informacion al tranformar

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObjeto= intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);

    }
}
