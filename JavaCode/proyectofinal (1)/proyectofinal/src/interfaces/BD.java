
package interfaces;

import java.sql.Connection;  // conexion de base de datos, las que se van a utilizar
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel; // interactua con la interfaz

public class BD extends javax.swing.JFrame { /// clases Jframe
    
    /// atributos 
String NOM_BD;  
Connection BD_historial_oro; // tipo de dato conexion, se usa como atributo , ese objeot esta vacio


// arreglo
JLabel escritura [] = new JLabel [3]; 



        


public BD(String nombre_BD) {
    NOM_BD=nombre_BD;
    initComponents();
    escritura[0]=jLabel1;
    escritura[1]=jLabel2;
    escritura[2]=jLabel3;
  

 
}
    ///metodo conexion 
public static Connection conectar (String nombre_BD) { // parametro String , para nombrar la base de datos
  Connection conectar2 = null; // objeto o atributo conexion , tipo de dato connection 
    try {   // este tipo de conexion puede fallar 
    
     String url = "jdbc:sqlite:"+nombre_BD;   // String para conectarnos y el nombre el String y direccion de conexion y el texto para conectarse 
    conectar2 = DriverManager.getConnection(url); /// getcon= metodo para conectar viene en la libreria java, siempre pide el url
     System.out.println("Conexión a la base de datos establecida.");
}catch ( SQLException e){ //// se le da gestion si llegaa reventar el error
        System.out.println("error no se pudo conectar");
        e.printStackTrace();//// menciona el error que va a reventar
}
 return conectar2;
} 

public static void desconectar (Connection obj_conectado){  /// parametro Connection obj_conectado
try{
obj_conectado.close(); /// cerrar la ejecucion  "close de java"
    System.out.println("se desconecto");
}catch (SQLException e){
    System.out.println("no se desconecto ");
    e. printStackTrace();
}
}

public void crear_tabla (String nombre_BD){
 BD_historial_oro = conectar(nombre_BD);// siempre va a retornar un conexion  // "BD_historial_oro" se va a guardar en esta variable que es de tipo conexion
 String creacion_SQL=   "CREATE TABLE Jugadores ("
                        +"Nombre VARCHAR(50),"  // salto de linea
                        +"Victorias VARCHAR(50) DEFAULT 0);";

 
 try{java.sql.Statement sentencia = BD_historial_oro.createStatement(); /// "java.sql" libreria , Statement tipo de dato,, sentencia el objeto
 sentencia.execute (creacion_SQL); /// sentencia.execute metodo para mandar la sentencia a sql que es el nombre del string  
     System.out.println("fueron creadas las tablas en la base de datos "+ nombre_BD);
 }catch (SQLException e){ /// se gestiona 
    
     System.out.println("la tabla ya esta creada"+ nombre_BD);
 }finally{
 desconectar(BD_historial_oro); /// se desconecta 
 }

}


public void borrar_tablas ( String nombre_BD)  {

    
    BD_historial_oro = conectar(nombre_BD); /// nos conectamos 
    
    String eliminar_SQL="DELETE FROM Jugadores;";   /// se manda a sql para que elimine las tablas

 
 try{java.sql.Statement sentencia = BD_historial_oro.createStatement(); // se crea conexion de java con la libreria
 sentencia.execute (eliminar_SQL);
     System.out.println("fueron eliminadas las tablas en la base de datos "+ nombre_BD);
 }catch (SQLException e){
     System.out.println("error al eliminar las tablas en la base de tatos "+ nombre_BD);
 }finally{
 desconectar(BD_historial_oro);
 }
}
public void insertar (String nombre_BD , String jugador_win){
BD_historial_oro = conectar(nombre_BD);
    String insertar_SQL="INSERT INTO Jugadores ( Nombre, Victorias) VALUES" + // se crea sentencia SQL insertar SQL 
"('"+ jugador_win+"','ganador');";
    
try{java.sql.Statement sentencia = BD_historial_oro.createStatement();
 sentencia.execute (insertar_SQL);
     System.out.println("fueron ingresados los datos "+ nombre_BD);
}catch (SQLException e){
     System.out.println("error al ingresar "+ nombre_BD);
     e.printStackTrace();
 }finally{
 desconectar(BD_historial_oro);
         }

}

public void contar(){
    try {
        int i=0;
        BD_historial_oro = conectar(NOM_BD);

        String consulta_SQL = "SELECT Nombre, COUNT(*) AS cantidad_repeticiones FROM Jugadores GROUP BY Nombre";

        try (java.sql.Statement sentencia = BD_historial_oro.createStatement(); /// conexion con la libreria 
             ResultSet datos = sentencia.executeQuery(consulta_SQL);) { // manda la consultas

            while (datos.next()&&i<3) { // mientras el contador sea menor a 3 se va a ejecutar 
                String nom = datos.getString("Nombre");/// se captura el tipo n de dato en un string que va a ser nombre,
                int victory = datos.getInt("cantidad_repeticiones"); // capturamos el numero de repeticiones

                escritura[i].setText("Nombre: " + nom + ", Número de victorias: " + victory); /// se imprime, arreglo escritura
                i++;
            }
        }
    } catch (SQLException e) {
        System.out.println("Error al recopilar");
        e.printStackTrace(); // imprime el error por si llega aparecer
    } finally {
        desconectar(BD_historial_oro);
    }
}

 

//*

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 51, 255));

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
  
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
