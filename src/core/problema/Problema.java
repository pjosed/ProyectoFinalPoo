package core.problema;

import core.opcion.Opcion;
import java.util.ArrayList;

public abstract class Problema {
    protected String tipo; // Puede haber otra enum de tipo problema en vez de que sea string
    protected ArrayList<Opcion> opciones;

    public Problema(String tipo, ArrayList<Opcion> opciones) {
        this.tipo = tipo;
        this.opciones = opciones;
    }

    public String getTipo() {
        return tipo;
    }

    public ArrayList<Opcion> getOpciones() {
        return opciones;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setOpciones(ArrayList<Opcion> opciones) {
        this.opciones = opciones;
    }
    
    public void generarOpciones(){
        // No implementadoa aun
    }
    
    public int evaluarOpcion(Opcion opcion){
        return 0;
    }
    
    
    
}
