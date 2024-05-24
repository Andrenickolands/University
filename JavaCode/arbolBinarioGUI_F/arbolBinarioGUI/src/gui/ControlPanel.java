
package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tree.BinaryTree;
import tree.BinaryTreeMain;
import tree.Nodo;

public class ControlPanel extends JPanel {
     public ControlPanel(NodoPanel nodoPanel) {
         
        setLayout(new FlowLayout());
        JButton sortButton = new JButton("Clasificar");
        JButton reconfigureButton = new JButton("Reconfigurar");
        JButton invertButton = new JButton("Invertir");
        JButton randomizeTreeButton = new JButton("Random");
        invertButton.setBackground(Color.ORANGE);
        invertButton.setForeground(Color.WHITE);
        sortButton.setBackground(Color.ORANGE);
        sortButton.setForeground(Color.WHITE);
        reconfigureButton.setBackground(Color.ORANGE);
        reconfigureButton.setForeground(Color.WHITE);
        randomizeTreeButton.setBackground(Color.ORANGE);
        randomizeTreeButton.setForeground(Color.WHITE);
        

        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BinaryTree unsortedTree = new BinaryTree(nodoPanel);
                unsortedTree.sort();
            }
        });

        reconfigureButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nodoPanel.reconfigureTree();
            }
        });

        invertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BinaryTree tree = new BinaryTree(nodoPanel);
                tree.invert();
            }
        });

        randomizeTreeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BinaryTree tree = new BinaryTree(nodoPanel);
                tree.randomizeTree();
            }
        });
        this.add(sortButton);
        this.add(reconfigureButton);
        this.add(invertButton);
        this.add(randomizeTreeButton);
    }
}
