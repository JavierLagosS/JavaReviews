package pooherencia.pooherencia;

public class Alumno  extends Persona {
    private  String institucion;
    private double notaMatematica;
    private double notaLenguaje;
    private double notaHistoria;

    public Alumno() {
        System.out.println("Alumno: Inicializando Constructor" );
    }

    public Alumno(String nombre, String apellido){
        super(nombre,apellido);
    }

    public Alumno(String nombre , String apellido , int edad){
        super(nombre, apellido, edad);
    }
    public Alumno(String nombre , String apellido , int edad, String institucion){
        super(nombre, apellido, edad);
        this.institucion= institucion;
    }
    public  Alumno(String nombre , String apellido , int edad, String institucion,
                    double notaMatematica , double notaLenguaje, double notaHistoria ){
        this(nombre, apellido, edad, institucion);
        this.notaMatematica= notaMatematica;
        this.notaLenguaje = notaLenguaje;
        this.notaHistoria = notaHistoria;
    }




    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematico() {
        return notaMatematica;
    }

    public void setNotaMatematico(double notaMatematico) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaLenguaje() {
        return notaLenguaje;
    }

    public void setNotaLenguaje(double notaLenguaje) {
        this.notaLenguaje = notaLenguaje;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }
}
