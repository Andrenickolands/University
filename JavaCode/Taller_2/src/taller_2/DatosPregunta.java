/*
Crea una clase llamada Pregunta con los siguientes atributos:
enunciado (String), 
respuesta (String)  
puntuacion (int).
 */
package taller_2;


public class DatosPregunta {
    String enunciado, respuesta;
    int puntuacion;

    public DatosPregunta(String enunciado, String respuesta, int puntuacion) {
        this.enunciado = enunciado;
        this.respuesta = respuesta;
        this.puntuacion = puntuacion;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public int getPuntuacion() {
        return puntuacion;
    }
    
    
    
}
