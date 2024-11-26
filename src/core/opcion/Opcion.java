package core.opcion;
public class Opcion {
    private String descripcion;
    private int puntaje;
    private String explicacion ;

    public String getExplicacion() {
        return explicacion;
    }

    public void setExplicacion(String explicacion) {
        this.explicacion = explicacion;
    }

    public Opcion(String descripcion, int puntaje,String explicacion) {
        this.descripcion = descripcion;
        this.puntaje = puntaje;
        this.explicacion = explicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    
}
