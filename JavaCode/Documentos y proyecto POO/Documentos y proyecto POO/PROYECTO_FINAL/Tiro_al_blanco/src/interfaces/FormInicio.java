package interfaces;

import funciones.Jugador;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class FormInicio extends javax.swing.JFrame {
    public FormInicio() {
        init();
    }

    public void init(){
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setBackground(new Color(0,0,0,0));
        panelFondo.requestFocus(); 
        panelFondo.setOpaque(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new funciones.Modelo_redondeado();
        lblCierre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPlayer3 = new javax.swing.JTextField();
        txtPlayer1 = new javax.swing.JTextField();
        txtPlayer2 = new javax.swing.JTextField();
        txtPlayer4 = new javax.swing.JTextField();
        panelBoton = new javax.swing.JPanel();
        lblIniciar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setPreferredSize(new java.awt.Dimension(416, 315));
        panelFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelFondoMousePressed(evt);
            }
        });
        panelFondo.setLayout(null);

        lblCierre.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        lblCierre.setText("X");
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCierreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCierreMouseExited(evt);
            }
        });
        panelFondo.add(lblCierre);
        lblCierre.setBounds(430, 10, 20, 40);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 31)); // NOI18N
        jLabel1.setText("¡Bienvenido Tiro al Blanco!");
        panelFondo.add(jLabel1);
        jLabel1.setBounds(60, 50, 360, 60);

        txtPlayer3.setBackground(new java.awt.Color(0, 0, 0));
        txtPlayer3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        txtPlayer3.setForeground(new java.awt.Color(255, 255, 255));
        txtPlayer3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPlayer3.setText("JUGADOR 3");
        txtPlayer3.setBorder(null);
        txtPlayer3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPlayer3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPlayer3FocusLost(evt);
            }
        });
        txtPlayer3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPlayer3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPlayer3MouseExited(evt);
            }
        });
        txtPlayer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlayer3ActionPerformed(evt);
            }
        });
        txtPlayer3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlayer3KeyTyped(evt);
            }
        });
        panelFondo.add(txtPlayer3);
        txtPlayer3.setBounds(140, 210, 180, 40);

        txtPlayer1.setBackground(new java.awt.Color(0, 0, 0));
        txtPlayer1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        txtPlayer1.setForeground(new java.awt.Color(255, 255, 255));
        txtPlayer1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPlayer1.setText("JUGADOR 1");
        txtPlayer1.setBorder(null);
        txtPlayer1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPlayer1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPlayer1FocusLost(evt);
            }
        });
        txtPlayer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPlayer1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPlayer1MouseExited(evt);
            }
        });
        txtPlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlayer1ActionPerformed(evt);
            }
        });
        txtPlayer1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlayer1KeyTyped(evt);
            }
        });
        panelFondo.add(txtPlayer1);
        txtPlayer1.setBounds(140, 110, 180, 40);

        txtPlayer2.setBackground(new java.awt.Color(0, 0, 0));
        txtPlayer2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        txtPlayer2.setForeground(new java.awt.Color(255, 255, 255));
        txtPlayer2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPlayer2.setText("JUGADOR 2");
        txtPlayer2.setBorder(null);
        txtPlayer2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPlayer2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPlayer2FocusLost(evt);
            }
        });
        txtPlayer2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPlayer2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPlayer2MouseExited(evt);
            }
        });
        txtPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlayer2ActionPerformed(evt);
            }
        });
        txtPlayer2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlayer2KeyTyped(evt);
            }
        });
        panelFondo.add(txtPlayer2);
        txtPlayer2.setBounds(140, 160, 180, 40);

        txtPlayer4.setBackground(new java.awt.Color(0, 0, 0));
        txtPlayer4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        txtPlayer4.setForeground(new java.awt.Color(255, 255, 255));
        txtPlayer4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPlayer4.setText("JUGADOR 4");
        txtPlayer4.setBorder(null);
        txtPlayer4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPlayer4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPlayer4FocusLost(evt);
            }
        });
        txtPlayer4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPlayer4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPlayer4MouseExited(evt);
            }
        });
        txtPlayer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlayer4ActionPerformed(evt);
            }
        });
        txtPlayer4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlayer4KeyTyped(evt);
            }
        });
        panelFondo.add(txtPlayer4);
        txtPlayer4.setBounds(140, 260, 180, 40);

        panelBoton.setBackground(new java.awt.Color(0, 0, 0));

        lblIniciar.setBackground(new java.awt.Color(0, 0, 0));
        lblIniciar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        lblIniciar.setForeground(new java.awt.Color(255, 255, 255));
        lblIniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniciar.setText("¡JUGAR!");
        lblIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIniciarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblIniciarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonLayout = new javax.swing.GroupLayout(panelBoton);
        panelBoton.setLayout(panelBotonLayout);
        panelBotonLayout.setHorizontalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBotonLayout.setVerticalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelFondo.add(panelBoton);
        panelBoton.setBounds(180, 310, 100, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
       lblCierre.setForeground(Color.GRAY);
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblCierreMouseExited

    private void txtPlayer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlayer3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlayer3ActionPerformed

    private void txtPlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlayer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlayer1ActionPerformed

    private void txtPlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlayer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlayer2ActionPerformed

    private void txtPlayer1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlayer1MouseEntered
        Border borde = BorderFactory.createLineBorder(new Color(0,0,0),2);
        txtPlayer1.setBorder(borde);
    }//GEN-LAST:event_txtPlayer1MouseEntered

    private void txtPlayer1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlayer1MouseExited
        txtPlayer1.setBorder(null);
    }//GEN-LAST:event_txtPlayer1MouseExited

    private void txtPlayer2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlayer2MouseEntered
        Border borde = BorderFactory.createLineBorder(new Color(0,0,0),2);
        txtPlayer2.setBorder(borde);
    }//GEN-LAST:event_txtPlayer2MouseEntered

    private void txtPlayer2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlayer2MouseExited
        txtPlayer2.setBorder(null);
    }//GEN-LAST:event_txtPlayer2MouseExited

    private void txtPlayer3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlayer3MouseEntered
        Border borde = BorderFactory.createLineBorder(new Color(0,0,0),2);
        txtPlayer3.setBorder(borde);
    }//GEN-LAST:event_txtPlayer3MouseEntered

    private void txtPlayer3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlayer3MouseExited
        txtPlayer3.setBorder(null);
    }//GEN-LAST:event_txtPlayer3MouseExited

    private void txtPlayer1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlayer1FocusGained
        if(txtPlayer1.getText().equals("JUGADOR 1"))
            txtPlayer1.setText("");
    }//GEN-LAST:event_txtPlayer1FocusGained

    private void txtPlayer2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlayer2FocusGained
        if(txtPlayer2.getText().equals("JUGADOR 2"))
            txtPlayer2.setText("");
        
    }//GEN-LAST:event_txtPlayer2FocusGained

    private void txtPlayer3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlayer3FocusGained
        if(txtPlayer3.getText().equals("JUGADOR 3"))
            txtPlayer3.setText("");
    }//GEN-LAST:event_txtPlayer3FocusGained

    private void txtPlayer1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlayer1FocusLost
        if(txtPlayer1.getText().equals(""))
            txtPlayer1.setText("JUGADOR 1");
    }//GEN-LAST:event_txtPlayer1FocusLost

    private void txtPlayer2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlayer2FocusLost
        if(txtPlayer2.getText().equals(""))
            txtPlayer2.setText("JUGADOR 2");
    }//GEN-LAST:event_txtPlayer2FocusLost

    private void txtPlayer3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlayer3FocusLost
        if(txtPlayer3.getText().equals(""))
            txtPlayer3.setText("JUGADOR 3");
    }//GEN-LAST:event_txtPlayer3FocusLost

    private void panelFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMousePressed
        panelFondo.requestFocus();
    }//GEN-LAST:event_panelFondoMousePressed

    private void txtPlayer1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlayer1KeyTyped
        char carac = Character.toUpperCase(evt.getKeyChar());
        evt.setKeyChar(carac);
        if(txtPlayer1.getText().length()>=10)
            evt.consume();
        
        
    }//GEN-LAST:event_txtPlayer1KeyTyped

    private void txtPlayer2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlayer2KeyTyped
        char carac = Character.toUpperCase(evt.getKeyChar());
        evt.setKeyChar(carac);
        if(txtPlayer2.getText().length()>=10)
            evt.consume();
    }//GEN-LAST:event_txtPlayer2KeyTyped

    private void txtPlayer3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlayer3KeyTyped
        char carac = Character.toUpperCase(evt.getKeyChar());
        evt.setKeyChar(carac);
        if(txtPlayer3.getText().length()>=10)
            evt.consume();
    }//GEN-LAST:event_txtPlayer3KeyTyped

    private void lblIniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarMousePressed
        this.dispose();

        Jugador Jugador1 = new Jugador();
        if(txtPlayer1.getText().equals(""))
        Jugador1.setNombre("JUGADOR 1");
        else{
            Jugador1.setNombre(txtPlayer1.getText());
        }

        Jugador Jugador2 = new Jugador();
        if(txtPlayer2.getText().equals(""))
        Jugador2.setNombre("JUGADOR 2");
        else{
            Jugador2.setNombre(txtPlayer2.getText());
        }

        Jugador Jugador3 = new Jugador();
        if(txtPlayer3.getText().equals(""))
        Jugador3.setNombre("JUGADOR 3");
        else{
            Jugador3.setNombre(txtPlayer3.getText());
        }

        Jugador Jugador4 = new Jugador();
        if(txtPlayer4.getText().equals(""))
        Jugador4.setNombre("JUGADOR 4");
        else{
            Jugador4.setNombre(txtPlayer4.getText());
        }
        
        Tablero Tablero = new Tablero(Jugador1,Jugador2,Jugador3, Jugador4);
        Tablero.setVisible(true);
        
        
        
        
    }//GEN-LAST:event_lblIniciarMousePressed

    private void lblIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarMouseExited
        panelBoton.setBackground(new Color(0));
    }//GEN-LAST:event_lblIniciarMouseExited

    private void lblIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarMouseEntered
        panelBoton.setBackground(new Color(0));

    }//GEN-LAST:event_lblIniciarMouseEntered

    private void txtPlayer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlayer4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlayer4ActionPerformed

    private void txtPlayer4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlayer4FocusGained
        if(txtPlayer4.getText().equals("JUGADOR 4"))
            txtPlayer4.setText("");
    }//GEN-LAST:event_txtPlayer4FocusGained

    private void txtPlayer4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlayer4FocusLost
        if(txtPlayer4.getText().equals(""))
            txtPlayer4.setText("JUGADOR 4");
    }//GEN-LAST:event_txtPlayer4FocusLost

    private void txtPlayer4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlayer4KeyTyped
        char carac = Character.toUpperCase(evt.getKeyChar());
        evt.setKeyChar(carac);
        if(txtPlayer4.getText().length()>=10)
            evt.consume();
    }//GEN-LAST:event_txtPlayer4KeyTyped

    private void txtPlayer4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlayer4MouseEntered
        Border borde = BorderFactory.createLineBorder(new Color(0,0,0),2);
        txtPlayer4.setBorder(borde);
    }//GEN-LAST:event_txtPlayer4MouseEntered

    private void txtPlayer4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlayer4MouseExited
        txtPlayer4.setBorder(null);
    }//GEN-LAST:event_txtPlayer4MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblIniciar;
    private javax.swing.JPanel panelBoton;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTextField txtPlayer1;
    private javax.swing.JTextField txtPlayer2;
    private javax.swing.JTextField txtPlayer3;
    private javax.swing.JTextField txtPlayer4;
    // End of variables declaration//GEN-END:variables
}
