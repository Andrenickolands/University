/*
 Cada producto debe tener los siguientes atributos: 
nombre, 
precio 
cantidad vendida.
 */
package ejerciciopr2;


public class DatosProducto {
    private String nombre;
    private double precio;
    private int cantventas;

    public DatosProducto(String nombre, double precio, int cantventas) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantventas = cantventas;
    }

    DatosProducto(String nombre, double precio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantventas() {
        return cantventas;
    }
    
    
}
