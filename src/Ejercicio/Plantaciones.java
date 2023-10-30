package Ejercicio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class Plantaciones {

    private int id;
    private String nombre;
    private float precio_compra;
    private float precio_venta;
    private String proxima_cosecha;
    private int id_granjero;

    public Plantaciones(int id, String nombre, float precio_compra, float precio_venta, String proxima_cosecha, int id_granjero) {
        this.id = id;
        this.nombre = nombre;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.proxima_cosecha = proxima_cosecha;
        this.id_granjero = id_granjero;
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

    public float getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(float precio_compra) {
        this.precio_compra = precio_compra;
    }

    public float getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(float precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getProxima_cosecha() {
        return proxima_cosecha;
    }

    public void setProxima_cosecha(String proxima_cosecha) {
        this.proxima_cosecha = proxima_cosecha;
    }

    public int getId_granjero() {
        return id_granjero;
    }

    public void setId_granjero(int id_granjero) {
        this.id_granjero = id_granjero;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Plantaciones{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio_compra=").append(precio_compra);
        sb.append(", precio_venta=").append(precio_venta);
        sb.append(", proxima_cosecha='").append(proxima_cosecha).append('\'');
        sb.append(", id_granjero=").append(id_granjero);
        sb.append('}');
        return sb.toString();
    }
}
