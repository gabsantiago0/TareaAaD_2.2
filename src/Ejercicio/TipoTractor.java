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

    public static TipoTractor deStringATipoTractor(String t) {
        return switch (t.toLowerCase()
                ) {
            case "rural" -> RURAL;
            case "cosecha" -> COSECHA;
            case "urbano" -> URBANO;
            case "de carreras" -> DE_CARRERAS;
            case "plantar" -> PLANTAR;
            default -> null;
        };


    }
}