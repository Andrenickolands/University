/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package puntos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Juan Jose
 */
public class PUNTOS {

    
   

    private int puntos = 0;

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
  public static void main(String[] args) {
      
        JFrame frame = new JFrame("Juego de puntos");

        // Crea un JPanel
        JPanel panel = new JPanel();

        // Agrega un KeyListener al JPanel
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // Obtiene la tecla presionada
                int tecla = e.getKeyCode();

                // Si la tecla presionada es la barra espaciadora
                if (tecla == KeyEvent.VK_SPACE) {
                    // Aumenta el puntaje del jugador
                    int puntos = panel.getPuntos();
                    puntos += (int) (System.currentTimeMillis() - tiempoPresionada);
                    panel.setPuntos(puntos);
                } else if (tecla == KeyEvent.VK_MINUS) {
                    // Disminuye el puntaje del jugador
                    int puntos = panel.getPuntos();
                    puntos -= (int) (System.currentTimeMillis() - tiempoPresionada);
                    panel.setPuntos(puntos);
                }

                // Actualiza el tiempo de la tecla presionada
                tiempoPresionada = System.currentTimeMillis();
            }
        });

        // Agrega un JLabel al JPanel para mostrar el puntaje
        JLabel etiquetaPuntos = new JLabel("Puntos: 0");
        panel.add(etiquetaPuntos);

        // Agrega el JPanel al JFrame
        frame.getContentPane().add(panel);

        // Inicia el juego
        iniciarJuego(panel);

        // Muestra el JFrame
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    private static void iniciarJuego(JPanel panel) {
        // Inicializa el puntaje del jugador
        panel.setPuntos(0);

        // Inicia el temporizador
        new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Termina el juego
                terminarJuego(panel);
            }
        }).start();
    }

    private static void terminarJuego(JPanel panel) {
        // Detiene el temporizador
        ((Timer) e.getSource()).stop();

        // Muestra el puntaje final
        JOptionPane.showMessageDialog(null, "El puntaje final es: " + panel.getPuntos());
    }

    private static long tiempoPresionada = 0;

    // Métodos getPuntos y setPuntos

   
}
