package Ejercicio;

public class Construccion {
    private int id;
    private String nombre;
    private int precio;
    private int id_Granjero;

    public Construccion(int id, String nombre, int precio, int id_Granjero) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.id_Granjero = id_Granjero;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId_Granjero() {
        return id_Granjero;
    }

    public void setId_Granjero(int id_Granjero) {
        this.id_Granjero = id_Granjero;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Construccion{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", id_Granjero=").append(id_Granjero);
        sb.append("/n");
        return sb.toString();
    }
}
