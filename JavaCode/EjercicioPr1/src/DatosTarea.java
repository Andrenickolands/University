
public class DatosTarea {
    private String tarea;
    private String DescTarea;

    public DatosTarea(String tarea, String DescTarea) {
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
