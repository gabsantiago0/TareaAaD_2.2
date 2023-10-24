package Ejercicio;

public class Granjero {

    private int id;
    private String descripcion;
    private float dinero;

    public Granjero(int id, String descripcion, float dinero) {
        this.id = id;
        this.descripcion = descripcion;
        this.dinero = dinero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Granjero{");
        sb.append("id=").append(id);
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", dinero=").append(dinero);
        sb.append("/n");
        return sb.toString();
    }
}
