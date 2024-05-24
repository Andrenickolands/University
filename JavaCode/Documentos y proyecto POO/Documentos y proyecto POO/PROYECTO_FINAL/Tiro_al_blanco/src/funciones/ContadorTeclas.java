package funciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ContadorTeclas extends JFrame {
    private JButton startButton;
    private int tiempoRestante = 5;
    private Timer timer;
    private int contadorSLASH = 0;
    private int contadorN = 0;
    private Jugador jugadorActual;

    public ContadorTeclas(Jugador jugador) {
        setTitle("Contador");
        setSize(300, 200);

        startButton = new JButton("Iniciar contador");
        add(startButton);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startButton.setEnabled(false);
                tiempoRestante = 5;
                contadorSLASH = 0;
                contadorN = 0;
                timer.start();
            }
        });

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tiempoRestante == 0) {
                    timer.stop();
                    startButton.setEnabled(true);
                    System.out.println("Tecla '/' presionada " + contadorSLASH + " veces.");
                    System.out.println("Tecla 'N' presionada " + contadorN + " veces.");
                    calcularPuntaje();
                    dispose();
                } else {
                    tiempoRestante--;
                }
            }

            private void calcularPuntaje() {
                int pulsacionesTotales = contadorSLASH + contadorN;
                if(pulsacionesTotales < 10)
                    jugador.setPuntajeIndice(jugador.getRonda()-1, 1);
                else if(pulsacionesTotales >= 10 && pulsacionesTotales < 20)
                    jugador.setPuntajeIndice(jugador.getRonda()-1, 2);
                else if(pulsacionesTotales >= 20 && pulsacionesTotales < 30)
                    jugador.setPuntajeIndice(jugador.getRonda()-1, 3);
                else
                    jugador.setPuntajeIndice(jugador.getRonda()-1, 4);
                jugadorActual = jugador;
            }
        });

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // No se usa en este ejemplo
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == '/' && !startButton.isEnabled()) {
                    contadorSLASH++;
                }
                if (e.getKeyChar() == 'n' && !startButton.isEnabled()) {
                    contadorN++;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // No se usa en este ejemplo
            }
        });

        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        setLocationRelativeTo(null);
    }
    
    public Jugador getJugadorActual() {
        return jugadorActual;
    }

    public void setJugadorActual(Jugador jugadorActual) {
        this.jugadorActual = jugadorActual;
    }

}