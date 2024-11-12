package core;

import core.opcion.Opcion;
import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private int edad;
    private int puntaje;
    private ArrayList<Juego> juegos;
    
    public int escogerOpcion(Opcion opcion){
        // Implementar logica
        return 0;
    }

    public Jugador(String nombre, int edad, int puntaje) {
        this.nombre = nombre;
        this.edad = edad;
        this.puntaje = puntaje;
        this.juegos = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public void setJuegos(ArrayList<Juego> juegos) {
        this.juegos = juegos;
    }
    
    
    
    
    
}
