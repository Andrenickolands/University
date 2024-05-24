package funciones;
import java.awt.Color;
import javax.swing.JPanel;
public class TableroModel extends JPanel{

    private int Ancho;
    private int Alto;
    private Color colorTablero;
    
    private Jugador Player1;
    private Jugador Player2;
    public TableroModel(){
    init();
    }
    private void init(){
    Ancho=50;
    Alto=50;
    colorTablero=Color.BLACK;
    Player1 = new Jugador();
    Player2 = new Jugador();
    }
    

    
    
    public void crearTablero(){
        setLayout(null);
        setSize(Ancho,Alto);
        setBackground(colorTablero);
    }   
    
    public int getAncho() {
        return Ancho;
    }
    public void setAncho(int Ancho) {
        this.Ancho = Ancho;
    }
    public int getAlto() {
        return Alto;
    }
    public void setAlto(int Alto) {
        this.Alto = Alto;
    }
    public Color getColorTablero() {
        return colorTablero;
    }
    public void setColorTablero(Color colorTablero) {
        this.colorTablero = colorTablero;
    }
    public Jugador getPlayer1() {
        return Player1;
    }
    public void setPlayer1(Jugador Player1) {
        this.Player1 = Player1;
    }
    public Jugador getPlayer2() {
        return Player2;
    }
    public void setPlayer2(Jugador Player2) {
        this.Player2 = Player2;
    }
    
    
    
}
