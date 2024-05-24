package funciones;

public class Jugador {

    private String nombre;
    private int ronda;
    private int[] puntaje = {0,0};

    public int getRonda() {
        return ronda;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }

    public int[] getPuntaje() {
        return puntaje;
    }
    
    public int sumarPuntaje(){
         return puntaje[0]+puntaje[1];
    }
    public int getPuntajeIndice(int indice) {
        return puntaje[indice];
    }
    public void setPuntaje(int[] puntaje) {
        this.puntaje = puntaje;
    }
    
    public void setPuntajeIndice(int indice, int puntaje) {
        this.puntaje[indice] = puntaje;
    }

    public Jugador(){}
    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
