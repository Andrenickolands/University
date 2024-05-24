/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author brayan.castellanos
 */
public class PintarTablero extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
         //To change body of generated methods, choose Tools | Templates.
        
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
        
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
    
}
