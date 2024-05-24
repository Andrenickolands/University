/*
 Cada curso debe tener los siguientes atributos: 

nombre, 

código 

y nota.

 */
package ejerciciopr1;


public class DatosCursos {
    private String nombreC;
    private int codigo;
    private double nota;
    
    public DatosCursos(int codigo, String nombreC, double nota){
        this.nombreC = nombreC;
        this.codigo = codigo;
        this.nota = nota;
    }

    DatosCursos(String nombreC, int codigo, double nota) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String get_nombreC(){
    return nombreC;
    }
    
    public void set_nombreC(String nombreC){
    this.nombreC = nombreC;
    }
    
    public int get_codigo(){
    return codigo;
    }
    
    public void set_codigo(int codigo){
    this.codigo = codigo;    
    }

    public double get_nota(){
    return nota;
    }
    
    public void set_nota(double nota){
    this.nota = nota;    
    }
}
