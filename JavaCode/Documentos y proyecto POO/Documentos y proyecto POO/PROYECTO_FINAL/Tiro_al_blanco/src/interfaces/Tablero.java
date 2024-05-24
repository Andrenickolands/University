package interfaces;

import funciones.ContadorTeclas;
import funciones.Jugador;
import funciones.TableroModel;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

public class Tablero extends javax.swing.JFrame {        
    public Tablero(){}
    
    ContadorTeclas contar;
    private Jugador Player1;
    private Jugador Player2;
    private Jugador Player3;
    private Jugador Player4;
    
    private Jugador jugadorActual;
    private ArrayList <Jugador> jugadores = new ArrayList();
    
    private TableroModel tablero;
    
    private int ronda; 
    private int turno;
    
    private int filaResaltar;
    private int columnaResaltar;
    private int [][] ocupados = {
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };
    
    public Tablero(Jugador Player1, Jugador Player2, Jugador Player3, Jugador Player4) {
        this.Player1=Player1;
        this.Player2=Player2;
        this.Player3=Player3;
        this.Player4=Player4;
        
        this.jugadores.add(Player1);
        this.jugadores.add(Player2);
        this.jugadores.add(Player3);
        this.jugadores.add(Player4);        

        this.ronda = 1;
        this.turno = 0;
        this.jugadorActual = jugadores.get(turno);
        this.jugadorActual.setRonda(ronda);
        
        this.filaResaltar = 0;
        this.columnaResaltar = 0;
        
        init();
        jTable1.setDefaultRenderer(Object.class, new PintarTablero());
        JOptionPane.showMessageDialog(null,"Turno jugador " + jugadorActual.getNombre(), "Turno " + ronda, JOptionPane.INFORMATION_MESSAGE);
    }

    
    public void init(){
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        
        lblJugador1.setText(Player1.getNombre());
        lblJugador2.setText(Player2.getNombre());
        lblJugador3.setText(Player3.getNombre());
        lblJugador4.setText(Player4.getNombre());
        
        tablero = new TableroModel();
        tablero.setPlayer1(Player1);
        tablero.setPlayer2(Player2);
        tablero.setAncho(690);
        tablero.setAlto(570);
        tablero.setBackground(Color.BLACK);
        tablero.setLocation(10,10);
        tablero.crearTablero();
        tablero.setVisible(true);
        
        panelFondo.add(tablero);
        Border bordeBoton = BorderFactory.createLineBorder(new Color(225,204,51));
        panelBoton.setBorder(bordeBoton);
     
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblJugador1 = new javax.swing.JLabel();
        panelJugador1 = new javax.swing.JPanel();
        panelJugador2 = new javax.swing.JPanel();
        lblJugador2 = new javax.swing.JLabel();
        panelJugador3 = new javax.swing.JPanel();
        lblJugador3 = new javax.swing.JLabel();
        panelBoton = new javax.swing.JPanel();
        lblSiguiente = new javax.swing.JLabel();
        panelLanzar = new javax.swing.JPanel();
        lblLanzar = new javax.swing.JLabel();
        lblCierre = new javax.swing.JLabel();
        panelJugador4 = new javax.swing.JPanel();
        lblJugador4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setLayout(null);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(690, 570));

        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int col){
                return false;
            }
        };
        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1},
                {1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1},
                {1, 2, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1},
                {1, 2, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1},
                {1, 2, 3, 4, 4, 4, 3, 3, 3, 2, 2, 2, 1, 1, 1},
                {1, 2, 3, 4, 4, 4, 3, 3, 3, 2, 2, 2, 1, 1, 1},
                {1, 2, 3, 4, 4, 4, 3, 3, 3, 2, 2, 2, 1, 1, 1},
                {1, 2, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1},
                {1, 2, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1},
                {1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1},
                {1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
            },
            new String [] {
                "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""
            }
        ));
        jTable1.setToolTipText("");
        jTable1.setAutoscrolls(false);
        jTable1.setFocusable(false);
        jTable1.setMaximumSize(new java.awt.Dimension(690, 570));
        jTable1.setMinimumSize(new java.awt.Dimension(690, 570));
        jTable1.setName(""); // NOI18N
        jTable1.setPreferredSize(new java.awt.Dimension(690, 570));
        jTable1.setRequestFocusEnabled(false);
        jTable1.setRowHeight(40);
        jTable1.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        panelFondo.add(jScrollPane1);
        jScrollPane1.setBounds(20, 30, 670, 580);

        lblJugador1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        lblJugador1.setForeground(new java.awt.Color(255, 255, 255));
        lblJugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugador1.setText("JUGADOR 1");
        panelFondo.add(lblJugador1);
        lblJugador1.setBounds(720, 140, 134, 50);

        panelJugador1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelJugador1Layout = new javax.swing.GroupLayout(panelJugador1);
        panelJugador1.setLayout(panelJugador1Layout);
        panelJugador1Layout.setHorizontalGroup(
            panelJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        panelJugador1Layout.setVerticalGroup(
            panelJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelFondo.add(panelJugador1);
        panelJugador1.setBounds(720, 140, 130, 50);

        panelJugador2.setBackground(new java.awt.Color(0, 0, 0));

        lblJugador2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        lblJugador2.setForeground(new java.awt.Color(255, 255, 255));
        lblJugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugador2.setText("JUGADOR 2");

        javax.swing.GroupLayout panelJugador2Layout = new javax.swing.GroupLayout(panelJugador2);
        panelJugador2.setLayout(panelJugador2Layout);
        panelJugador2Layout.setHorizontalGroup(
            panelJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJugador2Layout.createSequentialGroup()
                .addComponent(lblJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        panelJugador2Layout.setVerticalGroup(
            panelJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJugador2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelJugador2);
        panelJugador2.setBounds(720, 210, 130, 50);

        panelJugador3.setBackground(new java.awt.Color(0, 0, 0));

        lblJugador3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        lblJugador3.setForeground(new java.awt.Color(255, 255, 255));
        lblJugador3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugador3.setText("JUGADOR 3");

        javax.swing.GroupLayout panelJugador3Layout = new javax.swing.GroupLayout(panelJugador3);
        panelJugador3.setLayout(panelJugador3Layout);
        panelJugador3Layout.setHorizontalGroup(
            panelJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJugador3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        panelJugador3Layout.setVerticalGroup(
            panelJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJugador3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelJugador3);
        panelJugador3.setBounds(720, 280, 130, 50);

        panelBoton.setBackground(new java.awt.Color(0, 0, 0));

        lblSiguiente.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        lblSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        lblSiguiente.setText("SIGUIENTE");
        lblSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSiguienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSiguienteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSiguienteMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonLayout = new javax.swing.GroupLayout(panelBoton);
        panelBoton.setLayout(panelBotonLayout);
        panelBotonLayout.setHorizontalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSiguiente)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelBotonLayout.setVerticalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSiguiente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelFondo.add(panelBoton);
        panelBoton.setBounds(740, 560, 90, 50);

        panelLanzar.setBackground(new java.awt.Color(51, 255, 0));
        panelLanzar.setForeground(new java.awt.Color(102, 255, 0));

        lblLanzar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        lblLanzar.setForeground(new java.awt.Color(255, 255, 255));
        lblLanzar.setText("LANZAR");
        lblLanzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLanzarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLanzarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLanzarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelLanzarLayout = new javax.swing.GroupLayout(panelLanzar);
        panelLanzar.setLayout(panelLanzarLayout);
        panelLanzarLayout.setHorizontalGroup(
            panelLanzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLanzarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLanzar)
                .addGap(22, 22, 22))
        );
        panelLanzarLayout.setVerticalGroup(
            panelLanzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLanzarLayout.createSequentialGroup()
                .addComponent(lblLanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelFondo.add(panelLanzar);
        panelLanzar.setBounds(740, 510, 90, 40);

        lblCierre.setFont(new java.awt.Font("Gill Sans MT", 1, 30)); // NOI18N
        lblCierre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        lblCierre.setBounds(750, 30, 60, 30);

        panelJugador4.setBackground(new java.awt.Color(0, 0, 0));

        lblJugador4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        lblJugador4.setForeground(new java.awt.Color(255, 255, 255));
        lblJugador4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugador4.setText("JUGADOR 4");

        javax.swing.GroupLayout panelJugador4Layout = new javax.swing.GroupLayout(panelJugador4);
        panelJugador4.setLayout(panelJugador4Layout);
        panelJugador4Layout.setHorizontalGroup(
            panelJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelJugador4Layout.setVerticalGroup(
            panelJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJugador4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelFondo.add(panelJugador4);
        panelJugador4.setBounds(720, 350, 130, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseEntered
        panelBoton.setBackground(new Color(0));
    }//GEN-LAST:event_lblSiguienteMouseEntered

    private void lblSiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseExited
        panelBoton.setBackground(new Color(0));
    }//GEN-LAST:event_lblSiguienteMouseExited

    private void lblSiguienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMousePressed
        //this.dispose();
        if(turno == 3 && ronda == 1){
            calcularCoordenada(contar.getJugadorActual());
            jTable1.getColumnModel().getColumn(columnaResaltar).setCellRenderer(highlightRenderer);
            jTable1.repaint();
            jugadores.set(turno, contar.getJugadorActual());
            ronda = 2;
            turno = 0;
            jugadorActual = jugadores.get(turno);
            jugadorActual.setRonda(ronda);
            JOptionPane.showMessageDialog(null, "Turno jugador " + jugadorActual.getNombre(), "Turno " + ronda, JOptionPane.INFORMATION_MESSAGE);
        }
        else if (turno == 3 && ronda == 2){
            jugadores.set(turno, contar.getJugadorActual());
            this.dispose();
            PuntajeFinal puntaje = new PuntajeFinal(jugadores);
            puntaje.setVisible(true);
        }
        else {
            calcularCoordenada(contar.getJugadorActual());
            jTable1.getColumnModel().getColumn(columnaResaltar).setCellRenderer(highlightRenderer);
            jTable1.repaint();
            jugadores.set(turno, contar.getJugadorActual());
            turno++;
            jugadorActual = jugadores.get(turno);
            jugadorActual.setRonda(ronda);
            JOptionPane.showMessageDialog(null, "Turno jugador " + jugadorActual.getNombre(), "Turno " + ronda, JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_lblSiguienteMousePressed

    private void lblLanzarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLanzarMouseEntered
        panelLanzar.setBackground(new Color(0));
    }//GEN-LAST:event_lblLanzarMouseEntered

    private void lblLanzarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLanzarMouseExited
        panelLanzar.setBackground(new Color(0));
    }//GEN-LAST:event_lblLanzarMouseExited

    private void lblLanzarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLanzarMousePressed
        contar = new ContadorTeclas(jugadorActual);
        contar.setVisible(true);
    }//GEN-LAST:event_lblLanzarMousePressed

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.GRAY);
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblCierreMouseExited

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
    public Jugador getPlayer3() {
        return Player3;
    }
    public void setPlayer3(Jugador Player3) {
        this.Player3 = Player3;
    }
    
    DefaultTableCellRenderer highlightRenderer = new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            // Comprueba si esta es la celda que deseas resaltar
            if (row == filaResaltar && column == columnaResaltar) {
                c.setBackground(Color.GREEN);
                c.setForeground(Color.GREEN);
            } else {
                int numero = (int) table.getValueAt(row, column);
 
                if (numero == 1) {
                    setBackground(Color.BLACK);
                    setForeground(Color.BLACK);
                } else if (numero == 2) {
                    setBackground(Color.WHITE);
                    setForeground(Color.WHITE); 
                } else if (numero == 3) {
                    setBackground(Color.BLACK);
                    setForeground(Color.BLACK);
                } else {
                    setBackground(Color.WHITE);
                    setForeground(Color.WHITE);
                }
            }

            return c;
        }
    };
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblJugador1;
    private javax.swing.JLabel lblJugador2;
    private javax.swing.JLabel lblJugador3;
    private javax.swing.JLabel lblJugador4;
    private javax.swing.JLabel lblLanzar;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JPanel panelBoton;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelJugador1;
    private javax.swing.JPanel panelJugador2;
    private javax.swing.JPanel panelJugador3;
    private javax.swing.JPanel panelJugador4;
    private javax.swing.JPanel panelLanzar;
    // End of variables declaration//GEN-END:variables

    private void calcularCoordenada(Jugador jugador) {
        Random random = new Random();
        Boolean encontradas = false;
        do{
            filaResaltar = random.nextInt(15);
            columnaResaltar = random.nextInt(15);
            if((int)jTable1.getValueAt(filaResaltar, columnaResaltar) == jugador.getPuntajeIndice(jugador.getRonda()-1)){
                if(ocupados[filaResaltar][columnaResaltar] == 0)
                    encontradas = true;
            }
        }while(!encontradas);
    }
    
    
}
