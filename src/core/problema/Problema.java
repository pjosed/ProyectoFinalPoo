package core.problema;

import core.opcion.Opcion;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public abstract class Problema {
    protected String tipo; // Puede haber otra enum de tipo problema en vez de que sea string
    protected ArrayList<Opcion> opciones;

    public String getTextoProblema() {
        return textoProblema;
    }

    public void setTextoProblema(String textoProblema) {
        this.textoProblema = textoProblema;
    }
    protected String textoProblema ;
    

    public Problema(String tipo, String textoProblema, ArrayList<Opcion> opciones) {
        this.tipo = tipo;
        this.opciones = opciones; 
        this.textoProblema = textoProblema;

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



