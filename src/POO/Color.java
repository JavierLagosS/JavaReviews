package POO;

public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris Oscuro"),
    NARANJO("Naranjo"),
    NEGRO("Negro");
    private final String color;

    // Construimos un constructor para personalizar el "color "
    Color(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
