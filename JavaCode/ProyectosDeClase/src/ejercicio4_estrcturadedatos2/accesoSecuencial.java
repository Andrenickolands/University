/*

 */
package ejercicio4_estrcturadedatos2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Nicolás
 */
class accesoSecuencial {

      //ruta del archivo
    private final String archivo = "D:\\Users\\AndresNicolasSepulve\\Documents\\NetBeansProjects\\proyectos_universidad_estructuraDeDatos2-master\\proyectos_universidad_estructuraDeDatos2-master\\src\\ejercicio4_estrcturadedatos2\\datos_manipulacionArchivos.txt";
    File Archivo = new File(archivo);
    
    private final BufferedWriter bw = null;
    private final FileWriter fw = null;

    private final String b = "\u001B[0m";
    private final String fGris = "\033[47m";
    private final String fAmarillo = "\033[43m";
    private final String fCeleste = "\033[46m";

    protected void crear_Archivo() throws IOException {
        File archivo = new File("datos_manipulacionArchivos.txt");
        // Si el archivo no existe, se crea!
        if (!archivo.exists()) {
            archivo.createNewFile();
        }
    }

    protected void lectura() {
        System.out.println("\n");

        try (FileReader fr = new FileReader(archivo); BufferedReader br = new BufferedReader(fr)) {
            String line;
            //lee cada linea del archivo
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void escrituraConSobreEscritura() {
        System.out.println("\n");

        try (FileWriter fw = new FileWriter(archivo); BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write("       " + fGris + "\\`\"-. \n"
                    + b + "        " + fGris + ")  _`-. \n"
                    + b + "       " + fGris + ",  : `. \\ \n"
                    + b + "       " + fGris + ": _   '  \\ \n"
                    + b + "       " + fGris + "; *` _.   `--._ \n"
                    + b + "       " + fGris + "`-.-'          `-. \n"
                    + b + "         " + fGris + "|       `       `. \n"
                    + b + "         " + fGris + ":.       .        \\ \n"
                    + b + "         " + fGris + "| \\  .   :   .-'   . \n"
                    + b + "         " + fGris + ":  )-.;  ;  /      : \n"
                    + b + "         " + fGris + ":  ;  | :  :       ;-. \n"
                    + b + "         " + fGris + "; /   : |`-:     _ `- ) \n"
                    + b + "      " + fGris + ",-' /  ,-' ; .-`- .' `--' \n"
                    + b + "      " + fGris + "`--'   `---' `---' " + b);
            bw.newLine();

            bw.write("       " + fAmarillo + "\\`\"-. \n"
                    + b + "        " + fAmarillo + ")  _`-. \n"
                    + b + "       " + fAmarillo + ",  : `. \\ \n"
                    + b + "       " + fAmarillo + ": _   '  \\ \n"
                    + b + "       " + fAmarillo + "; *` _.   `--._ \n"
                    + b + "       " + fAmarillo + "`-.-'          `-. \n"
                    + b + "         " + fAmarillo + "|       `       `. \n"
                    + b + "         " + fAmarillo + ":.       .        \\ \n"
                    + b + "         " + fAmarillo + "| \\  .   :   .-'   . \n"
                    + b + "         " + fAmarillo + ":  )-.;  ;  /      : \n"
                    + b + "         " + fAmarillo + ":  ;  | :  :       ;-. \n"
                    + b + "         " + fAmarillo + "; /   : |`-:     _ `- ) \n"
                    + b + "      " + fAmarillo + ",-' /  ,-' ; .-`- .' `--' \n"
                    + b + "      " + fAmarillo + "`--'   `---' `---' " + b);
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Cierra instancias de FileWriter y BufferedWriter
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }

    protected void escrituraSinSobreEscritura() {
        System.out.println("\n");

        try (FileWriter fw = new FileWriter(archivo, true); BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write("       " + fCeleste + "\\`\"-. \n"
                    + b + "        " + fCeleste + ")  _`-. \n"
                    + b + "       " + fCeleste + ",  : `. \\ \n"
                    + b + "       " + fCeleste + ": _   '  \\ \n"
                    + b + "       " + fCeleste + "; *` _.   `--._ \n"
                    + b + "       " + fCeleste + "`-.-'          `-. \n"
                    + b + "         " + fCeleste + "|       `       `. \n"
                    + b + "         " + fCeleste + ":.       .        \\ \n"
                    + b + "         " + fCeleste + "| \\  .   :   .-'   . \n"
                    + b + "         " + fCeleste + ":  )-.;  ;  /      : \n"
                    + b + "         " + fCeleste + ":  ;  | :  :       ;-. \n"
                    + b + "         " + fCeleste + "; /   : |`-:     _ `- ) \n"
                    + b + "      " + fCeleste + ",-' /  ,-' ; .-`- .' `--' \n"
                    + b + "      " + fCeleste + "`--'   `---' `---' " + b);
            bw.newLine();

            System.out.println("información agregada!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Cierra instancias de FileWriter y BufferedWriter
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }

    protected void eliminar() {  
        Archivo.delete();
    }

}
