package POO;
// por norma en los POJO
// Primero Atributos , luego Constructores,
// luego Metodos Setter and getter
// luego metodos propios
// al final metodos de sobreescritura


// Ocultar siempre los atributos de las clases
//POJO = Plain Old Java Object
// es un atributo que solo representa datos

public class Automovil implements Comparable<Automovil> {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas;

    private TipoAutomovil tipo;

    private static int capacidadEstanqueEstatico = 30;
    private static Color colorPatente = Color.BLANCO;
    private static int ultimoId;
    // LAS Constantes se escriben Con la siguiente nomenclatura
    // Son Publicas y Staticas
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris";


    public Automovil() {
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if (estanque==null){
            this.estanque=new Estanque();
        }
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Automovil addRueda(Rueda rueda){
        if (indiceRuedas<this.ruedas.length){
        this.ruedas[indiceRuedas++] = rueda;
        }
        return this;
    }


    public String verDetalle() {
        String detalle = "automovil.id = " + this.id +
                "\n automovil.fabricante = " + this.fabricante +
                "\n automovil.modelo = " + this.modelo;
        if (this.getTipo() != null) {
            detalle += "\n automovil.tipo = " + this.getTipo().getDescripcion();
        }
        detalle += "\n automovil.color = " + this.color +
                "\n automovil.patenteColor = " + colorPatente;
        if (this.motor != null) {
            detalle += "\n automovil.cilindrada = " + this.motor.getCilindrada() ;
        };
        detalle += " \nConductor Susuki:"+ this.getConductor();

        if (getRuedas()!= null) {
            detalle += "Ruedas del automovil: ";
            for (Rueda r : this.getRuedas()) {
                detalle += "\n" + r.getFabricante() + " aro: " + r.getAro() + " ancho: " + r.getAncho();
            }
        }
        return detalle;
    }

    public String acelerar(int rpm) {
        return "el auto " + this.fabricante + "acelerando a " + rpm + "rpm";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina) {

        return km / (this.getEstanque().getCapacidad() * porcentajeBencina);
    }

    // Sobre CArga de metodos , mismo nombre del metodo , pero recibe distintos
    // tipos de parametros.
    public float calcularConsumo(int km, int porcentajeBencina) {
        return km / (this.getEstanque().getCapacidad() * (porcentajeBencina / 100f));
    }

    public static float calcularConsumoStatico(int km, int porcentajeBencina) {
        return km / (capacidadEstanqueEstatico * (porcentajeBencina / 100f));
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Automovil)) {
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null &&
                this.fabricante.equalsIgnoreCase(a.getFabricante())
                && this.modelo.equalsIgnoreCase(a.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    // importamos Comparable<Automovil> para poder comparar y ordenar
    //nuestros
    @Override
    public int compareTo(Automovil a) {
        return this.fabricante.compareTo(a.fabricante);
    }


}
