/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tree.BinaryTree;
import tree.BinaryTreeMain;
import tree.Nodo;
/**
 *
 * @author HP
 */
public class NodoSettings extends JPanel {
    
    private JButton leftChild; 
    private JButton rightChild; 

    private JTextField newValue; 
    private boolean placedANodo = false; 
    private boolean clickedANodo = false; 

    private JButton clickedChildButton; 

    private ButtonActionListener leftListener; 
    private ButtonActionListener rightListener;

    private JLabel levelText;

    private final NodoPanel nodoPanel;

    public NodoSettings(NodoPanel nodoPanel) {
        this.nodoPanel = nodoPanel;
        JLabel clickText = new JLabel("Haga clic en cualquier lugar para colocar un nodo.");
        clickText.setFont(new Font("Serif", Font.PLAIN, 30));
        this.add(clickText);
    }

    public boolean getPlaced() {
        return placedANodo;
    }

    public boolean getClicked() {
        return clickedANodo;
    }

    public JButton getClickedChildButton() {
        return clickedChildButton;
    }

    public ButtonActionListener getLeftListener() {
        return leftListener;
    }

    public ButtonActionListener getRightListener() {
        return rightListener;
    }

    public void setClickedChildButton(JButton button) {
        clickedChildButton = button;
    }

    public void flipClickedChildButton() {
        if (leftListener.getActiveState()) {
            rightListener.setActivateState(true);
            leftListener.setActivateState(false);
            clickedChildButton = rightChild;
        } else {
            leftListener.setActivateState(true);
            rightListener.setActivateState(false);
            clickedChildButton = leftChild;
        }
        leftListener.flipColor();
        rightListener.flipColor();
    }

    public void placedANodo() { 
        placedANodo = true;
        removeAll();
        JLabel clickText = new JLabel("Haga clic en un nodo para configurar sus ajustes."); 
        clickText.setFont(new Font("Serif", Font.PLAIN, 30));
        this.add(clickText);
        this.revalidate();
    }

    public void clickedANodo() { 
        removeAll();
        clickedANodo = true;
        leftChild = new JButton("Set Left"); 
        rightChild = new JButton("Set Right");
        leftChild.setBackground(Color.GRAY);
        rightChild.setBackground(Color.GRAY);
        leftChild.setForeground(Color.WHITE);
        rightChild.setForeground(Color.WHITE);

        JButton deleteNodo = new JButton("Borrar Nodo"); 
        deleteNodo.setBackground(Color.GRAY);
        deleteNodo.setForeground(Color.WHITE);

        deleteNodo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Nodo deletedNodo = MouseListener.getPrevClicked();
                Nodo parent = deletedNodo.getParent();
                if (parent != null && parent.getLeftChild() == deletedNodo) {
                    parent.setLeftChild(null);
                } else if (parent != null && parent.getRightChild() == deletedNodo) {
                    parent.setRightChild(null);
                }
                nodoPanel.removeNodo(deletedNodo);
                nodoPanel.repaint();
            }
        });
        this.add(deleteNodo);

        JLabel enterValueText = new JLabel("Enter value: ");
        newValue = new JTextField("Enter",3);
        newValue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                Nodo currentClicked = MouseListener.getPrevClicked();
                currentClicked.setValue(Integer.parseInt(newValue.getText()));
                nodoPanel.repaint();
            }
        });

        leftListener = new ButtonActionListener(leftChild,this,nodoPanel,Color.blue,true); 
        rightListener = new ButtonActionListener(rightChild,this,nodoPanel,Color.red,false);
        leftChild.addActionListener(leftListener);
        rightChild.addActionListener(rightListener);

        levelText = new JLabel("Level: 0");

        this.add(leftChild); 
        this.add(rightChild);
        this.add(enterValueText);
        this.add(newValue);
        this.add(levelText);
        this.revalidate();
    }

    public void updateNodoSettings(Nodo nodo) { 
        if(nodo.getLeftChild() != null) {
            leftChild.setText("Desasignar Left");
        } else {
            leftChild.setText("Set Left");
        }
        if(nodo.getRightChild() != null) {
            rightChild.setText("Desasignar Right");
        } else {
            rightChild.setText("Set Right");
        }
        levelText.setText("Level: " + nodo.getLevel());
        this.revalidate();
    }
}