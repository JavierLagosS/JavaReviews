public class PrimitivosFlotantes {
    public static void main(String[] args) {

        float realFloat = 3.4028235E38f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo Float corresponde en byte a   " + Float.BYTES);
        System.out.println("tipo Float corresponde en bites a  " + Float.SIZE);
        System.out.println(" el valor maximo de un Float : " + Float.MAX_VALUE);
        System.out.println(" el valor Minimo de un Float : " + Float.MIN_VALUE);

        double realDouble= 1.7976931348623157E308;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo Double corresponde en byte a   " + Double.BYTES);
        System.out.println("tipo Double corresponde en bites a  " + Double.SIZE);
        System.out.println(" el valor maximo de un Double : " + Double.MAX_VALUE);
        System.out.println(" el valor Minimo de un Double : " + Double.MIN_VALUE);

    }
}
