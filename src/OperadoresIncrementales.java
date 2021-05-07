public class  OperadoresIncrementales {
    public static void main(String[] args) {
        // pre Incremento
        int i=1 , j=++i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post Incremento
        i = 2;
        System.out.println("i = " + i);

        j=i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Pre Decremento

        i=3;
        j=--i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post Decremento
        i=4;
        j=i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

    }
}
