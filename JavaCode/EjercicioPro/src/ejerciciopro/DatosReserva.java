
package ejerciciopro;


public class DatosReserva {
    private int numeroVuelo, numeroAsiento;
    private String nombrePasajero;
    
    public DatosReserva(int numeroVuelo, String nombrePasajero, int numeroAsiento) {
        this.numeroVuelo = numeroVuelo;
        this.nombrePasajero = nombrePasajero;
        this.numeroAsiento = numeroAsiento;
    }
    public int getNumeroVuelo() {
        return numeroVuelo;
    }
    public String getNombrePasajero() {
        return nombrePasajero;
    }
    public int getNumeroAsiento() {
        return numeroAsiento;
    }
}     

