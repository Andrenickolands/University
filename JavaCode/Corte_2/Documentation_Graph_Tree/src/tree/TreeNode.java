/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author nicolas sepulveda
 */
public class TreeNode {
    //se crean las variables val de tipo entero, left y right de tipo TreeNode
    int val;
    TreeNode left;
    TreeNode right;
    
    //método constructor público de TreeNode que inicializa val y también los atributos left y right en null
    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
