public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = "Creando un objeto de la clase String.... que tal!";
        Integer num = 7;

        boolean b1 = texto instanceof String;


        System.out.println("texto es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es del tipo object = " + b1);

        b1 = num instanceof Integer;
        System.out.println("texto es del tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("texto es del tipo Number = " + b1);



    }
}
