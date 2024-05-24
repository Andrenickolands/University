package funciones;
import java.io.FileWriter;
import java.io.IOException;
import funciones.Jugador;
import java.util.ArrayList;
import javax.swing.JLabel;
public class Importartxt {

    public Importartxt(ArrayList <Jugador> jugadores) throws IOException{
        FileWriter DatosP = new FileWriter("Resultados.txt");
        for(Jugador jugador:jugadores){
        DatosP.write(jugador.getNombre()+" Tu puntaje es: "+jugador.sumarPuntaje()+"\n");    
        }
        DatosP.close();
    }
    
}
