/*
Crea una clase llamada Tarea con los siguientes atributos: 
descripción (String)  
completada (boolean)
 */
package taller_3;


public class DatosTarea {
    String nombreTarea, descripion;
    boolean completada;

    public DatosTarea(String nombreTarea, String descripion) {
        this.nombreTarea = nombreTarea;
        this.descripion = descripion;
        this.completada = completada;
    }
    
    public String getDescripion() {
        return descripion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }    
}
