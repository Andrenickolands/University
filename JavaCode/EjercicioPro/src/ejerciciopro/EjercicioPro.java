package ejerciciopro;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioPro {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<DatosVuelos> ListaDatosvuelos = new ArrayList<>();
    static ArrayList<DatosReserva> ListaDatosReservas = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n¿Qué acción desea realizar?");
            System.out.println("1. Agregar un vuelo");
            System.out.println("2. Hacer una reserva");
            System.out.println("3. Mostrar reservas de un vuelo");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpia el buffer del scanner
            
            switch (opcion) {
                case 1 -> agregarVuelo();
                case 2 -> hacerReserva();
                case 3 -> mostrarReservas();
                case 4 -> {
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                }
                default -> System.out.println("Opción inválida, intente de nuevo.");
            }
        }
    }

    static void agregarVuelo() {
        System.out.println("Ingrese el número de vuelo:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer del scanner
        
        System.out.println("Ingrese la fecha y hora de salida (formato dd/mm/yyyy hh:mm):");
        String fechaSalida = scanner.nextLine();
        
        System.out.println("Ingrese la fecha y hora de llegada (formato dd/mm/yyyy hh:mm):");
        String fechaLlegada = scanner.nextLine();
        
        System.out.println("Ingrese el origen:");
        String origen = scanner.nextLine();
        
        System.out.println("Ingrese el destino:");
        String destino = scanner.nextLine();
        
        ListaDatosvuelos.add(new DatosVuelos(numero, fechaSalida, fechaLlegada, origen, destino));
        System.out.println("Vuelo agregado exitosamente.");
    }

    static void hacerReserva() {
        System.out.println("Ingrese el número de vuelo:");
        int numero = scanner.nextInt();
        scanner.nextLine(); 
        
        
        // Busca el vuelo en la lista de vuelos
        DatosVuelos vuelo = null;
        
        for (DatosVuelos v : ListaDatosvuelos) {
            if (v.getNumero() == numero) {
                vuelo = v;
                break;
            }
            
        }
        if (vuelo == null) {
            System.out.println("Vuelo no encontrado.");
            return;
            
        }
        if (!vuelo.tieneAsientosDisponibles()) {
            System.out.println("Lo sentimos, no hay asientos disponibles en este vuelo.");
            return;
        }
        
        System.out.println("Ingrese el nombre del pasajero:");
        String nombre = scanner.nextLine();
        
        int numAsiento = vuelo.asignarAsiento();
        
        
        DatosReserva reserva = new DatosReserva(numero, nombre, numAsiento);
        ListaDatosReservas.add(reserva);
        
        System.out.println("Reserva realizada exitosamente. Número de asiento: " + numAsiento);
        
    }

    static void mostrarReservas() {
        System.out.println("Ingrese el número de vuelo:");
        int numero = scanner.nextInt();
        
        scanner.nextLine(); // Limpia el buffer del scanner
        
        // Busca el vuelo en la lista de vuelos
        DatosVuelos vuelo = null;
        
        for (DatosVuelos v : ListaDatosvuelos) {
            if (v.getNumero() == numero) {
                vuelo = v;
                break;
            }
        }
        
        if (vuelo == null) {
            System.out.println("Vuelo no encontrado.");
            return;
            
        }
        ArrayList<DatosReserva> reservasVuelo = new ArrayList<>();
        
        // Busca las reservas del vuelo en la lista de reservas
        for (DatosReserva r : ListaDatosReservas) {
            if (r.getNumeroVuelo() == numero) {
                reservasVuelo.add(r);
            }
        }
        if (reservasVuelo.isEmpty()) {
            System.out.println("No hay reservas para este vuelo.");
            return;
        }
        System.out.println("Reservas para el vuelo #" + numero + ":");
        for (DatosReserva r : reservasVuelo) {
            System.out.println("Asiento #" + r.getNumeroAsiento() + ": " + r.getNombrePasajero());
        }
    }
}
