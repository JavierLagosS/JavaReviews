public class WraperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 =num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("Son el mismo Objeto " + (num1==num2));

        num2=1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo Objeto ?" + (num1==num2));

        System.out.println("Tiene el mismo valor ?" +(num1.equals(num2)));


    }
}
