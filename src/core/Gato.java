package core;

import static core.EstadoAnimo.feliz;
import static core.EstadoAnimo.normal;
import static core.EstadoAnimo.triste;
import core.problema.Problema;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Gato {
    private EstadoAnimo estadoAnimo;
    private ArrayList<Problema> problemas;
    int puntaje;

    private static Gato instancia; // Instancia única del Gato
    
    private Gato() {
        this.estadoAnimo = normal;
        this.puntaje = 500;
        this.problemas = new ArrayList();
    }

    // Método estático para obtener la instancia única del Gato
    public static Gato getInstancia() {
        if (instancia == null) {
            instancia = new Gato();
        }
        return instancia;
    }
    
    public EstadoAnimo getEstadoAnimo() {
        return estadoAnimo;
    }

    public ArrayList<Problema> getProblemas() {
        return problemas;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setEstadoAnimo(EstadoAnimo estadoAnimo) {
        this.estadoAnimo = estadoAnimo;
    }

    public void setProblemas(ArrayList<Problema> problemas) {
        this.problemas = problemas;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    
    
    
    
    public void cambiarEstado(){
        
        if (this.puntaje <= 333){
            this.estadoAnimo= triste;
            
        } else if((this.puntaje > 333) && (this.puntaje <= 666) ){
            this.estadoAnimo= normal;
            
        }else if((this.puntaje > 666) && (this.puntaje <= 1000) ){
            this.estadoAnimo= feliz;
            
        }
        
    }
    
    public boolean actualizarProblema(){
        // No implementado aun
        return true;
    }
    
    public int actualizarPuntaje(int puntos){
        this.puntaje = this.puntaje + puntos;
        return puntaje;
    }
    
    
    
}
