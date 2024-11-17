package core.opcion;
public abstract class Opcion {
    protected String descripcion;
    protected int puntaje;

    public Opcion(String descripcion, int puntaje) {
        this.descripcion = descripcion;
        this.puntaje = puntaje;

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
