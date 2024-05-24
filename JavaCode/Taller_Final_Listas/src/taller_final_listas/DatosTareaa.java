package taller_final_listas;

public class DatosTareaa {
    //Se crean las variables del onjeto
    private String tarea;
    private String DescTarea;

    //Se los constructores, gets y sets
    public DatosTareaa(String tarea, String DescTarea) {
        this.tarea = tarea;
        this.DescTarea = DescTarea;
    }

    public String getDescTarea() {
        return DescTarea;
    }

    public void setDescTarea(String DescTarea) {
        this.DescTarea = DescTarea;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    } 
}
