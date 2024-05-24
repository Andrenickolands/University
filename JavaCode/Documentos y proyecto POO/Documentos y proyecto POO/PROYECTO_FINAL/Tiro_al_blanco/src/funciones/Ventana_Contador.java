
package funciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
public class Ventana_Contador extends JFrame{
        public Ventana_Contador(){
        setTitle("");
        setSize(200, 100);
        setLocationRelativeTo(null);

        JPanel panelContador = new JPanel();
        JLabel lblContador = new JLabel("En 5 segundos se cerrará esta ventana");
        panelContador.add(lblContador);
        add(panelContador);

        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               dispose(); 
            }
        });

        timer.setRepeats(false); 

        setVisible(true);
        timer.start();
    }
}