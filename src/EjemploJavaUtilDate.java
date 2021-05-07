import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();

        System.out.println("fecha = " + fecha);


        // buscar en google SimpledateFormat java xx , y veras como puedes modificar
        //https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html

        // con cuatro MMMM muestra el nombre del mes
        // con tres MMM muestra el nombre del mes abreviado
        // con dos MM muestra el numero del mes


        SimpleDateFormat df = new SimpleDateFormat("EEEE, dd 'de',MMMM, yyyy");
        String fechaStr= df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);

        long j= 0;
        for (int i = 0; i < 10000; i++) {
            i+=i;

        }
        System.out.println("j = " + j);
        Date fecha2 = new Date();
        long tiempoFinal= fecha2.getTime()-fecha.getTime();

        System.out.println(" TIempo transcurido en el for = " + tiempoFinal);
        System.out.println("fechaStr = "+ fechaStr);

    }
}
