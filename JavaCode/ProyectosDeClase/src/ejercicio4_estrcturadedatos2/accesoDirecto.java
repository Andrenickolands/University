/*

 */
package ejercicio4_estrcturadedatos2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Nicolás
 */
class accesoDirecto {

      //ruta del archivo
    private final String archivo = "D:\\Users\\AndresNicolasSepulve\\Documents\\NetBeansProjects\\proyectos_universidad_estructuraDeDatos2-master\\proyectos_universidad_estructuraDeDatos2-master\\src\\ejercicio4_estrcturadedatos2\\datos_manipulacionArchivosDirecto.txt";
    File Archivo = new File(archivo);
    
    protected void crear_Archivo() throws IOException {
        File archivo = new File("datos_manipulacionArchivos.txt");
        // Si el archivo no existe, se crea!
        if (!archivo.exists()) {
            archivo.createNewFile();
        }
    }

    protected void accesoDirectoo() {

        //abrir un archivo en modo de lectura/escritura
        try {

            RandomAccessFile ran = new RandomAccessFile(archivo, "rwd");

            if (archivo.length() == 0) {
                System.out.println("El documento está vacío");
                return;
            }

            ran.seek(0);

            //leer
            String valor = ran.readLine();
            while (valor != null) {
                System.out.println("La información es: " + valor);
                valor = ran.readLine();
            }

            //Cerrar el archivo
            ran.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    protected void eliminar() {
        Archivo.delete();
    }
}
