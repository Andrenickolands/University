/*
 Cada venta debe tener los siguientes atributos: 
número de venta, 
fecha de venta, 
cliente que realizó la venta 
y una lista de productos que se vendieron en esa venta. 
 */
package ejerciciopr2;


public class DatosVenta {
    private String fechaVenta, NombreCliente, ListProd;
    private int numVenta;

    public DatosVenta(String fechaVenta, String NombreCliente, String ListProd, int numVenta) {
        this.fechaVenta = fechaVenta;
        this.NombreCliente = NombreCliente;
        this.ListProd = ListProd;
        this.numVenta = numVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public String getListProd() {
        return ListProd;
    }

    public int getNumVenta() {
        return numVenta;
    }
    
    
}
