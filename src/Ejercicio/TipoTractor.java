package Ejercicio;

public enum TipoTractor {
    RURAL("rural"),
    COSECHA("cosecha"),
    URBANO("urbano"),
    DE_CARRERAS("de carreras"),
    PLANTAR("plantar");

    private final String descripcion;

    TipoTractor(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}