import java.util.Scanner;

public class EjercicioArregloNotasAlumno {

    public static void main(String[] args) {
        double [] claseMatematicas, claseHistoria, claseLenguaje;
        double sumNotasMatematicas =0, sumNotasHistoria=0, sumNotasLenguaje=0;
        claseMatematicas= new double[7];
        claseHistoria= new double[7];
        claseLenguaje= new double[7];

        Scanner s = new Scanner(System.in);
        System.out.println("ingrese 7 notas para matematicas");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] =s.nextDouble();
        }

        System.out.println("ingrese 7 notas para historia");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] =s.nextDouble();
        }

        System.out.println("ingrese 7 notas para lenguaje");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseLenguaje[i] =s.nextDouble();
        }

        for( int i=0; i<7 ; i++){
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }

        double promedioMatematicas=(sumNotasMatematicas/claseMatematicas.length);
        double promedioHistoria= (sumNotasHistoria/claseHistoria.length);
        double promedioLenguaje= (sumNotasLenguaje/claseLenguaje.length);

        System.out.println("Promedio clase Matematicas: " + promedioMatematicas);
        System.out.println("Promedio clase Historia: " +promedioHistoria);
        System.out.println("Promedio clase Lenguaje: " + promedioLenguaje);
        System.out.println("Promedio total del curso: " +(promedioMatematicas+promedioHistoria+promedioLenguaje)/3);


        System.out.println("Ingrese el identificador del alumno (de 0-6):");
        int id = s.nextInt();
        double promedioAlumno= (claseHistoria[id]+ claseMatematicas[id]+claseMatematicas[id])/3;
        System.out.println("promedio Alumno Nro  "+ id +" : " + promedioAlumno);




    }
}
