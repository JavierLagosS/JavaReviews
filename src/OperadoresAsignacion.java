import sun.security.rsa.RSASignature;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5, j=1+4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i+=2; // i=i+2
        System.out.println("i = " + i);

        i+=5; // i=i+5
        System.out.println("i = " + i);

        i-=4; // i=i-4
        System.out.println("i = " + i);

        j*=3; // j=j*3
        System.out.println("j = " + j);

        String sqlString = "select * from clientes as c";
        sqlString += "where c.nombre = 'andres";
        sqlString += "and c.activos=1";
        System.out.println("sqlString = " + sqlString);


    }
}
