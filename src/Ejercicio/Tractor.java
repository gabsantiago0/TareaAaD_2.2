package Ejercicio;

public class Tractor {

    private int id;
    private TipoTractor tipo;
    private int velocidad;
    private float precio_venta;
    private String proxima_coesacha;
    private int id_construccion;


    public Tractor(int id, TipoTractor tipo, int velocidad, float precio_venta, String proxima_coesacha, int id_construccion) {
        this.id = id;
        this.tipo = tipo;
        this.velocidad = velocidad;
        this.precio_venta = precio_venta;
        this.proxima_coesacha = proxima_coesacha;
        this.id_construccion = id_construccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public float getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(float precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getProxima_coesacha() {
        return proxima_coesacha;
    }

    public void setProxima_coesacha(String proxima_coesacha) {
        this.proxima_coesacha = proxima_coesacha;
    }

    public int getId_construccion() {
        return id_construccion;
    }

    public void setId_construccion(int id_construccion) {
        this.id_construccion = id_construccion;
    }

    public TipoTractor getTipo() {
        return tipo;
    }

    public void setTipo(TipoTractor tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tractor{");
        sb.append("id=").append(id);
        sb.append(", velocidad=").append(velocidad);
        sb.append(", precio_venta=").append(precio_venta);
        sb.append(", proxima_coesacha='").append(proxima_coesacha).append('\'');
        sb.append(", id_granjero=").append(id_construccion);
        sb.append('}');
        return sb.toString();
    }
}
