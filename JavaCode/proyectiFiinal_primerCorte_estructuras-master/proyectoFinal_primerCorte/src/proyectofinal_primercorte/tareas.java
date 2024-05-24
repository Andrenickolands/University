/*
    manipulacionArchivos
 */
package proyectofinal_primercorte;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Nicolás
 */
public class tareas {

    Scanner data = new Scanner(System.in);

    String nombreTarea [] = new String[5];
    String descripion [] = new String[5];
    
    public void crear() throws IOException {
        archivoTarea();
        crearTarea();
        writeTarea();
    }

    public void archivoTarea() throws IOException {

        File tarea = new File("C:\\tareas\\");
        tarea.mkdir();
        if (tarea.exists()) {
            System.out.println("Archivo creado correctamente");
        } else {
            System.out.println("Error al crear archivo");
        }

        if (tarea.exists()) {
            File info = new File("C:\\tareas\\Info tarea.txt");
            info.createNewFile();
        }
    }

    protected void crearTarea() {

            for (int i = 0; i < nombreTarea.length; i++) {
            System.out.println("Nombre de la tarea " + (i + 1) + ": ");
            nombreTarea[i] = data.nextLine();

            System.out.println("Descripción de la tarea " + (i + 1) + ": " + "\n");
            descripion[i] = data.nextLine();
            }
    }

    public void writeTarea() {

        try (BufferedWriter datosP = new BufferedWriter(new FileWriter("C:\\tareas\\Info tarea.txt"))) {
            for (int i = 0; i < nombreTarea.length; i++) {
                datosP.write(nombreTarea[i] + "," + descripion[i]);
                datosP.newLine();
            }
            
        } catch (IOException e) {

        }

    }

    protected void mostrarTarea() {
         try (Scanner scanner = new Scanner(new File("C:\\tareas\\Info tarea.txt"))) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] mostrarTarea = linea.split("_____");
 
                System.out.println("Nombre: " + mostrarTarea[0]);
                System.out.println("Descripion: " + mostrarTarea[1]);
                System.out.println();
            }
        } catch (IOException e) {
            
        }
    }
    
    
    protected void buscarTarea() {

    }

    protected void actuazlizarTarea() {

    }

    protected void eliminarTarea() {

    }

}
