package interfaces;

import funciones.Importartxt;
import funciones.Jugador;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class PuntajeFinal extends javax.swing.JFrame {
    

    private ArrayList <Jugador> jugadores = new ArrayList();
    
    public PuntajeFinal(ArrayList Jugadores) {
        this.jugadores=Jugadores;
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
        
        lblPlayer1.setText(jugadores.get(0).getNombre()+" Tu puntaje es: "+jugadores.get(0).sumarPuntaje());
        lblPlayer2.setText(jugadores.get(1).getNombre()+" Tu puntaje es: "+jugadores.get(1).sumarPuntaje());
        lblPlayer3.setText(jugadores.get(2).getNombre()+" Tu puntaje es: "+jugadores.get(2).sumarPuntaje());
        lblPlayer4.setText(jugadores.get(3).getNombre()+" Tu puntaje es: "+jugadores.get(3).sumarPuntaje());

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new funciones.Modelo_redondeado();
        lblCierre = new javax.swing.JLabel();
        lblTblaPuntaje = new javax.swing.JLabel();
        panelCreditos = new javax.swing.JPanel();
        lblCreditos = new javax.swing.JLabel();
        panelPlayer1 = new javax.swing.JPanel();
        lblPlayer1 = new javax.swing.JLabel();
        panelPlayer2 = new javax.swing.JPanel();
        lblPlayer2 = new javax.swing.JLabel();
        panelPlayer3 = new javax.swing.JPanel();
        lblPlayer3 = new javax.swing.JLabel();
        panelPlayer4 = new javax.swing.JPanel();
        lblPlayer4 = new javax.swing.JLabel();

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
        lblCierre.setBounds(610, 0, 60, 40);

        lblTblaPuntaje.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 26)); // NOI18N
        lblTblaPuntaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTblaPuntaje.setText("TABLA DE PUNTAJE");
        panelFondo.add(lblTblaPuntaje);
        lblTblaPuntaje.setBounds(10, 30, 550, 60);

        panelCreditos.setBackground(new java.awt.Color(0, 0, 0));

        lblCreditos.setBackground(new java.awt.Color(0, 0, 0));
        lblCreditos.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        lblCreditos.setForeground(new java.awt.Color(255, 255, 255));
        lblCreditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreditos.setText("CREDITOS");
        lblCreditos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblCreditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCreditosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCreditosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCreditosMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelCreditosLayout = new javax.swing.GroupLayout(panelCreditos);
        panelCreditos.setLayout(panelCreditosLayout);
        panelCreditosLayout.setHorizontalGroup(
            panelCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCreditosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelCreditosLayout.setVerticalGroup(
            panelCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCreditosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelCreditos);
        panelCreditos.setBounds(430, 310, 110, 40);

        panelPlayer1.setBackground(new java.awt.Color(255, 255, 255));
        panelPlayer1.setForeground(new java.awt.Color(255, 255, 255));

        lblPlayer1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        lblPlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayer1.setText("jLabel1");

        javax.swing.GroupLayout panelPlayer1Layout = new javax.swing.GroupLayout(panelPlayer1);
        panelPlayer1.setLayout(panelPlayer1Layout);
        panelPlayer1Layout.setHorizontalGroup(
            panelPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlayer1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        panelPlayer1Layout.setVerticalGroup(
            panelPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPlayer1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelFondo.add(panelPlayer1);
        panelPlayer1.setBounds(20, 80, 560, 50);

        panelPlayer2.setBackground(new java.awt.Color(255, 255, 255));

        lblPlayer2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        lblPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayer2.setText("jLabel1");

        javax.swing.GroupLayout panelPlayer2Layout = new javax.swing.GroupLayout(panelPlayer2);
        panelPlayer2.setLayout(panelPlayer2Layout);
        panelPlayer2Layout.setHorizontalGroup(
            panelPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlayer2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelPlayer2Layout.setVerticalGroup(
            panelPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPlayer2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelPlayer2);
        panelPlayer2.setBounds(20, 140, 550, 50);

        panelPlayer3.setBackground(new java.awt.Color(255, 255, 255));

        lblPlayer3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        lblPlayer3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayer3.setText("jLabel1");

        javax.swing.GroupLayout panelPlayer3Layout = new javax.swing.GroupLayout(panelPlayer3);
        panelPlayer3.setLayout(panelPlayer3Layout);
        panelPlayer3Layout.setHorizontalGroup(
            panelPlayer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlayer3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lblPlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        panelPlayer3Layout.setVerticalGroup(
            panelPlayer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPlayer3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelFondo.add(panelPlayer3);
        panelPlayer3.setBounds(30, 200, 560, 50);

        panelPlayer4.setBackground(new java.awt.Color(255, 255, 255));

        lblPlayer4.setBackground(new java.awt.Color(255, 255, 255));
        lblPlayer4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        lblPlayer4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayer4.setText("jLabel1");

        javax.swing.GroupLayout panelPlayer4Layout = new javax.swing.GroupLayout(panelPlayer4);
        panelPlayer4.setLayout(panelPlayer4Layout);
        panelPlayer4Layout.setHorizontalGroup(
            panelPlayer4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPlayer4Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(lblPlayer4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        panelPlayer4Layout.setVerticalGroup(
            panelPlayer4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPlayer4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelFondo.add(panelPlayer4);
        panelPlayer4.setBounds(40, 260, 520, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
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

    private void panelFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMousePressed
        panelFondo.requestFocus();
    }//GEN-LAST:event_panelFondoMousePressed

    private void lblCreditosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreditosMousePressed
        this.dispose();
        Creditos creditos = new Creditos();
        creditos.setVisible(true);
       
        try {
            Importartxt datos = new Importartxt(jugadores);
        } catch (IOException ex) {
            Logger.getLogger(PuntajeFinal.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }//GEN-LAST:event_lblCreditosMousePressed

    private void lblCreditosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreditosMouseExited
        panelCreditos.setBackground(new Color(0));
    }//GEN-LAST:event_lblCreditosMouseExited

    private void lblCreditosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreditosMouseEntered
        panelCreditos.setBackground(new Color(0));

    }//GEN-LAST:event_lblCreditosMouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblCreditos;
    private javax.swing.JLabel lblPlayer1;
    private javax.swing.JLabel lblPlayer2;
    private javax.swing.JLabel lblPlayer3;
    private javax.swing.JLabel lblPlayer4;
    private javax.swing.JLabel lblTblaPuntaje;
    private javax.swing.JPanel panelCreditos;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelPlayer1;
    private javax.swing.JPanel panelPlayer2;
    private javax.swing.JPanel panelPlayer3;
    private javax.swing.JPanel panelPlayer4;
    // End of variables declaration//GEN-END:variables
}
