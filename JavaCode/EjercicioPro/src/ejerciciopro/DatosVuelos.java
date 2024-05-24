
package ejerciciopro;

import java.util.ArrayList;

public class DatosVuelos {
    private int numero;
    private String fechaSalida;
    private String fechaLlegada;
    private String origen;
    private String destino;
    private int capacidad;
    private ArrayList<Integer> asientosDisponibles;

    public DatosVuelos(int numero, String fechaSalida, String fechaLlegada, String origen, String destino) {
        this.numero = numero;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.origen = origen;
        this.destino = destino;

        this.capacidad = 10; // Capacidad predeterminada
        this.asientosDisponibles = new ArrayList<>();
        for (int i = 1; i <= capacidad; i++) {
            asientosDisponibles.add(i);
        }
    }
    public int getNumero() {
        return numero;
    }
    public boolean tieneAsientosDisponibles() {
        return !asientosDisponibles.isEmpty();
    }
    public int asignarAsiento() {
        int numAsiento = asientosDisponibles.remove(0);
        return numAsiento;
    }
}
    

