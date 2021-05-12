package POO;

public class Estanque {
    private int capacidad;

    // Para darle una capacidad por defecto
    public Estanque() {
        this.capacidad=40;
    }

    public Estanque(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
