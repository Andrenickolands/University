package interfaces;


import java.awt.Color;

public class Formulario_Jugadores extends javax.swing.JFrame {
    
diseño Tablero = new diseño();

    public Formulario_Jugadores() {
        initComponents();
       this.setLocationRelativeTo(null);//salga en el centro
       
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Panel_Titulo = new javax.swing.JPanel();
        Titulo_lbl = new javax.swing.JLabel();
        Panel_Formulario = new javax.swing.JPanel();
        Jugador1_lbl = new javax.swing.JLabel();
        Selec_Nom_lbl = new javax.swing.JLabel();
        Selec_Nom_lbl1 = new javax.swing.JLabel();
        Campo_Nombre_1 = new javax.swing.JTextField();
        Elegir_Color_1 = new javax.swing.JComboBox<>();
        Jugador1_lbl1 = new javax.swing.JLabel();
        Selec_Nom_lbl2 = new javax.swing.JLabel();
        Campo_Nombre_2 = new javax.swing.JTextField();
        Selec_Nom_lbl3 = new javax.swing.JLabel();
        Elegir_Color_2 = new javax.swing.JComboBox<>();
        Jugador1_lbl2 = new javax.swing.JLabel();
        Selec_Nom_lbl4 = new javax.swing.JLabel();
        Campo_Nombre_3 = new javax.swing.JTextField();
        Selec_Nom_lbl5 = new javax.swing.JLabel();
        Elegir_Color_3 = new javax.swing.JComboBox<>();
        Btn_Salir = new javax.swing.JButton();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Jugar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo.setBackground(new java.awt.Color(255, 51, 51));

        Panel_Titulo.setBackground(new java.awt.Color(255, 102, 204));

        Titulo_lbl.setBackground(new java.awt.Color(0, 0, 0));
        Titulo_lbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Titulo_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_lbl.setText("J  U  G  A  D  O  R  E  S");

        javax.swing.GroupLayout Panel_TituloLayout = new javax.swing.GroupLayout(Panel_Titulo);
        Panel_Titulo.setLayout(Panel_TituloLayout);
        Panel_TituloLayout.setHorizontalGroup(
            Panel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_TituloLayout.createSequentialGroup()
                .addContainerGap(191, Short.MAX_VALUE)
                .addComponent(Titulo_lbl)
                .addGap(171, 171, 171))
        );
        Panel_TituloLayout.setVerticalGroup(
            Panel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TituloLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Titulo_lbl)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        Panel_Formulario.setBackground(new java.awt.Color(255, 204, 204));

        Jugador1_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jugador1_lbl.setText("J U G A D O R 1 :");

        Selec_Nom_lbl.setForeground(new java.awt.Color(0, 0, 102));
        Selec_Nom_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Selec_Nom_lbl.setText("Seleccione un nombre:");

        Selec_Nom_lbl1.setForeground(new java.awt.Color(102, 0, 0));
        Selec_Nom_lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Selec_Nom_lbl1.setText("Seleccione un color :");

        Campo_Nombre_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_Nombre_1ActionPerformed(evt);
            }
        });

        Elegir_Color_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azul", "Magenta", "Rosado", "Rojo", "Amarillo", "Verde", "Cyan" }));

        Jugador1_lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jugador1_lbl1.setText("J U G A D O R 2:");

        Selec_Nom_lbl2.setForeground(new java.awt.Color(0, 0, 102));
        Selec_Nom_lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Selec_Nom_lbl2.setText("Seleccione un nombre:");

        Campo_Nombre_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_Nombre_2ActionPerformed(evt);
            }
        });

        Selec_Nom_lbl3.setForeground(new java.awt.Color(102, 0, 0));
        Selec_Nom_lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Selec_Nom_lbl3.setText("Seleccione un color :");

        Elegir_Color_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azul", "Magenta", "Rosado", "Rojo", "Amarillo", "Verde", "Cyan" }));

        Jugador1_lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jugador1_lbl2.setText("J U G A D O R 3:");

        Selec_Nom_lbl4.setForeground(new java.awt.Color(0, 0, 102));
        Selec_Nom_lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Selec_Nom_lbl4.setText("Seleccione un nombre:");

        Campo_Nombre_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_Nombre_3ActionPerformed(evt);
            }
        });

        Selec_Nom_lbl5.setForeground(new java.awt.Color(102, 0, 0));
        Selec_Nom_lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Selec_Nom_lbl5.setText("Seleccione un color :");

        Elegir_Color_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azul", "Magenta", "Rosado", "Rojo", "Amarillo", "Verde", "Cyan" }));

        Btn_Salir.setForeground(new java.awt.Color(0, 0, 153));
        Btn_Salir.setText("S A L I R");
        Btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirActionPerformed(evt);
            }
        });

        Btn_Guardar.setForeground(new java.awt.Color(0, 0, 153));
        Btn_Guardar.setText("G U A R D A R");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        Btn_Jugar.setForeground(new java.awt.Color(0, 0, 153));
        Btn_Jugar.setText("J U G A R");
        Btn_Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_JugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_FormularioLayout = new javax.swing.GroupLayout(Panel_Formulario);
        Panel_Formulario.setLayout(Panel_FormularioLayout);
        Panel_FormularioLayout.setHorizontalGroup(
            Panel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_FormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_Guardar)
                .addGap(36, 36, 36)
                .addComponent(Btn_Salir)
                .addGap(25, 25, 25))
            .addGroup(Panel_FormularioLayout.createSequentialGroup()
                .addGroup(Panel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_FormularioLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(Panel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Jugador1_lbl1)
                            .addGroup(Panel_FormularioLayout.createSequentialGroup()
                                .addGroup(Panel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Selec_Nom_lbl2)
                                        .addComponent(Selec_Nom_lbl3)
                                        .addComponent(Selec_Nom_lbl4, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(Selec_Nom_lbl5))
                                .addGap(18, 18, 18)
                                .addGroup(Panel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Elegir_Color_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Campo_Nombre_2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Campo_Nombre_3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Elegir_Color_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(Panel_FormularioLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(Jugador1_lbl))
                    .addGroup(Panel_FormularioLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(Panel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Btn_Jugar)
                            .addComponent(Jugador1_lbl2)))
                    .addGroup(Panel_FormularioLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(Panel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Selec_Nom_lbl)
                            .addComponent(Selec_Nom_lbl1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Elegir_Color_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Campo_Nombre_1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_FormularioLayout.setVerticalGroup(
            Panel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_FormularioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Jugador1_lbl)
                .addGap(18, 18, 18)
                .addGroup(Panel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Selec_Nom_lbl)
                    .addComponent(Campo_Nombre_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Selec_Nom_lbl1)
                    .addComponent(Elegir_Color_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Jugador1_lbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Selec_Nom_lbl2)
                    .addComponent(Campo_Nombre_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(Panel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Elegir_Color_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Selec_Nom_lbl3))
                .addGap(35, 35, 35)
                .addComponent(Jugador1_lbl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Selec_Nom_lbl4)
                    .addComponent(Campo_Nombre_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Elegir_Color_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Selec_Nom_lbl5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(Panel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Salir)
                    .addComponent(Btn_Guardar)
                    .addComponent(Btn_Jugar))
                .addContainerGap())
        );

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_Formulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_Formulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Campo_Nombre_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_Nombre_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_Nombre_1ActionPerformed

    private void Campo_Nombre_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_Nombre_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_Nombre_2ActionPerformed

    private void Campo_Nombre_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_Nombre_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_Nombre_3ActionPerformed

    private void Btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Btn_SalirActionPerformed

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
        Guardar_Datos();
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Btn_JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_JugarActionPerformed
        Tablero . setVisible(true);
        this.dispose();/// se cierra formulario
    }//GEN-LAST:event_Btn_JugarActionPerformed
    
    // M E T O D O S //
    
       
    // Guardar datos //

    public void Guardar_Datos () {
    Nombre_Jugador_1();    
    Nombre_Jugador_2();
    Nombre_Jugador_3();

    
    Color_Jugador_1();
    Color_Jugador_2();
    Color_Jugador_3();
     
    
    }
    
     //Guardar Nombres
    
    public void Nombre_Jugador_1 (){
    Tablero . jugador_1 .nombre = Campo_Nombre_1 . getText();   
    }
    
    public void Nombre_Jugador_2 (){
    Tablero . jugador_2 .nombre = Campo_Nombre_2 . getText();   
    }
     
    public void Nombre_Jugador_3 (){
    Tablero . jugador_3 .nombre = Campo_Nombre_3 . getText();   
    }
      

    
    //Guardar Colores    
    public Color Color_Jugador_1 (){        
    Tablero . jugador_1 .color_selecionado = Color.BLACK;    
    String Seleccion_Jugador_1 = (String) Elegir_Color_1.getSelectedItem(); //trae lo seleccionado
    
    if (Seleccion_Jugador_1 == "Azul"){
    Tablero . jugador_1 .color_selecionado = Color.BLUE;
    } else {
    if (Seleccion_Jugador_1 == "Rojo"){
    Tablero . jugador_1 .color_selecionado = Color.RED;
    } else {
    if (Seleccion_Jugador_1 == "Verde"){
    Tablero . jugador_1 .color_selecionado = Color.GREEN;
    } else {
    if (Seleccion_Jugador_1 == "Amarillo"){
    Tablero . jugador_1 .color_selecionado = Color.YELLOW;
    } else {
    if (Seleccion_Jugador_1 == "Naranja"){
    Tablero . jugador_1 .color_selecionado = Color.ORANGE;
    } else {
    if (Seleccion_Jugador_1 == "Rosado"){
    Tablero . jugador_1 .color_selecionado = Color.PINK;
    } else {
    if (Seleccion_Jugador_1 == "Magenta"){
    Tablero . jugador_1 .color_selecionado = Color.MAGENTA;
    } else {
    if (Seleccion_Jugador_1 == "Cyan"){
    Tablero . jugador_1 .color_selecionado = Color.CYAN;
    }
                                }    
                            }    
                        }    
                    }
                }
            }
        }        
    return Tablero . jugador_1 .color_selecionado;
    }
    
    public Color Color_Jugador_2 (){        
    Tablero . jugador_2 .color_selecionado = Color.BLACK;    
    String Seleccion_Jugador_2 = (String) Elegir_Color_2.getSelectedItem();
    
    if (Seleccion_Jugador_2 == "Azul"){
    Tablero . jugador_2 .color_selecionado = Color.BLUE;
    } else {
    if (Seleccion_Jugador_2 == "Rojo"){
    Tablero . jugador_2 .color_selecionado = Color.RED;
    } else {
    if (Seleccion_Jugador_2 == "Verde"){
    Tablero . jugador_2 .color_selecionado = Color.GREEN;
    } else {
    if (Seleccion_Jugador_2 == "Amarillo"){
    Tablero . jugador_2 .color_selecionado = Color.YELLOW;
    } else {
    if (Seleccion_Jugador_2 == "Naranja"){
    Tablero . jugador_2 .color_selecionado = Color.ORANGE;
    } else {
    if (Seleccion_Jugador_2 == "Rosado"){
    Tablero . jugador_2 .color_selecionado = Color.PINK;
    } else {
    if (Seleccion_Jugador_2 == "Magenta"){
    Tablero . jugador_2 .color_selecionado = Color.MAGENTA;
    } else {
    if (Seleccion_Jugador_2 == "Cyan"){
    Tablero . jugador_2 .color_selecionado = Color.CYAN;
    }
                                }    
                            }    
                        }    
                    }
                }
            }
        }
    
    return Tablero . jugador_2 .color_selecionado;
    }
     
    public Color Color_Jugador_3 (){        
    Tablero . jugador_3 .color_selecionado = Color.BLACK;    
    String Seleccion_Jugador_3 = (String) Elegir_Color_3.getSelectedItem();
    
    if (Seleccion_Jugador_3 == "Azul"){
    Tablero . jugador_3 .color_selecionado = Color.BLUE;
    } else {
    if (Seleccion_Jugador_3 == "Rojo"){
    Tablero . jugador_3 .color_selecionado = Color.RED;
    } else {
    if (Seleccion_Jugador_3 == "Verde"){
    Tablero . jugador_3 .color_selecionado = Color.GREEN;
    } else {
    if (Seleccion_Jugador_3 == "Amarillo"){
    Tablero . jugador_3 .color_selecionado = Color.YELLOW;
    } else {
    if (Seleccion_Jugador_3 == "Naranja"){
    Tablero . jugador_3 .color_selecionado = Color.ORANGE;
    } else {
    if (Seleccion_Jugador_3 == "Rosado"){
    Tablero . jugador_3 .color_selecionado = Color.PINK;
    } else {
    if (Seleccion_Jugador_3 == "Magenta"){
    Tablero . jugador_3 .color_selecionado = Color.MAGENTA;
    } else {
    if (Seleccion_Jugador_3 == "Cyan"){
    Tablero . jugador_3 .color_selecionado = Color.CYAN;
    }
                                }    
                            }    
                        }    
                    }
                }
            }
        }
    
    return Tablero . jugador_3 .color_selecionado;
    }
      
    //Fin del metodo
    

// -__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__-__- //
    
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_Jugadores().setVisible(true); //muestra el formulario
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Jugar;
    private javax.swing.JButton Btn_Salir;
    private javax.swing.JTextField Campo_Nombre_1;
    private javax.swing.JTextField Campo_Nombre_2;
    private javax.swing.JTextField Campo_Nombre_3;
    private javax.swing.JComboBox<String> Elegir_Color_1;
    private javax.swing.JComboBox<String> Elegir_Color_2;
    private javax.swing.JComboBox<String> Elegir_Color_3;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Jugador1_lbl;
    private javax.swing.JLabel Jugador1_lbl1;
    private javax.swing.JLabel Jugador1_lbl2;
    private javax.swing.JPanel Panel_Formulario;
    private javax.swing.JPanel Panel_Titulo;
    private javax.swing.JLabel Selec_Nom_lbl;
    private javax.swing.JLabel Selec_Nom_lbl1;
    private javax.swing.JLabel Selec_Nom_lbl2;
    private javax.swing.JLabel Selec_Nom_lbl3;
    private javax.swing.JLabel Selec_Nom_lbl4;
    private javax.swing.JLabel Selec_Nom_lbl5;
    private javax.swing.JLabel Titulo_lbl;
    // End of variables declaration//GEN-END:variables
}
