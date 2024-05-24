/*
Cada estudiante debe tener los siguientes atributos: 
nombre, 
edad, 
género y 
una lista de cursos que 
está tomando. 
 */
package ejerciciopr1;


public class DatosEstudiantes {
  private String nombre, genero, listcursos;
  private int edad;

  
    public DatosEstudiantes(int edad, String nombre, String genero, String listcursos){
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.listcursos = listcursos;
    }

    DatosEstudiantes(String nombre, int edad, String genero, String listcursos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String get_nombre(){
    return nombre;
    }
    
    public void set_nombre(String nombre){
    this.nombre = nombre;    
    }
    
    public String get_genero(){
    return genero;
    }
    
    public void set_genero(String genero){
    this.genero = genero;    
    }
    
    public String get_listCursos(){
    return listcursos;
    }
    
    public void set_listCursos(String listcursos){
    this.listcursos = listcursos;    
    }
    
    public int get_edad(){
    return edad;
    }
    
    public void set_edad(int edad){
    this.edad = edad;    
    }
}
