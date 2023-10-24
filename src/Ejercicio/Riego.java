package Ejercicio;

public class Riego {
    private int id;
    private String tipo;
    private int velocidad;
    private int id_plantacion;

    public Riego(int id, String tipo, int velocidad, int id_plantacion) {
        this.id = id;
        this.tipo = tipo;
        this.velocidad = velocidad;
        this.id_plantacion = id_plantacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getId_plantacion() {
        return id_plantacion;
    }

    public void setId_plantacion(int id_plantacion) {
        this.id_plantacion = id_plantacion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Riego{");
        sb.append("id=").append(id);
        sb.append(", tipo='").append(tipo).append('\'');
        sb.append(", velocidad=").append(velocidad);
        sb.append(", id_plantacion=").append(id_plantacion);
        sb.append('}');
        return sb.toString();
    }
}
