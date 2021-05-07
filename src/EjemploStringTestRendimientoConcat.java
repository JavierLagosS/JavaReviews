public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a= "a";
        String b= "b";
        String c= a;
        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();
        // String Builder es el mas eficiente por donde se le mire
        for (int i=0; i<500; i++){
            //c=c.concat(a).concat(b).concat("\n"); // 500 => 2ms
            //c+=a+b+"\n"; // 500=> 16ms
            sb.append(a).append(b).append("\n"); // 500 => 0ms
        }
        long fin = System.currentTimeMillis();
        System.out.println(c);
        System.out.println(fin-inicio);
        System.out.println("sb.toString() = " + sb.toString());
    }
}
