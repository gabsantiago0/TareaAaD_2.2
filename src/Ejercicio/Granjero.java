package Ejercicio;

public class Granjero {

    private int id;
    private String nombre;
    private String descripcion;
    private int dinero;
    private int puntos;
    private int nivel;


    public Granjero(int id, String nombre, String descripcion, int dinero, int puntos, int nivel) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.dinero = dinero;
        this.puntos = puntos;
        this.nivel = nivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
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
