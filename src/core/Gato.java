package core;

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

    public Gato(EstadoAnimo estadoAnimo, int puntaje) {
        this.estadoAnimo = estadoAnimo;
        this.puntaje = puntaje;
        this.problemas = new ArrayList();
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
    
    
    
    
    
    public EstadoAnimo cambiarEstado(EstadoAnimo estadoAnimo){
        
        if (this.puntaje <= 333.3){
            return triste;
        } else if((this.puntaje >= 333) && (this.puntaje <= 666) ){
            return normal;
        }else if((this.puntaje >= 666) && (this.puntaje <= 1000) ){
            return normal;
        }
        return null;
    }
    
    public boolean actualizarProblema(){
        // No implementado aun
        return true;
    }
    
    public int actualizarPuntaje(int puntaje){
        // No implementado aun
        return 0;
    }
    
    
    
            }
