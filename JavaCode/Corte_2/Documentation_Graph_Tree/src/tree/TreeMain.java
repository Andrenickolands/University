/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author nicolas sepulveda
 */
public class TreeMain {
      //clase main que ejecuta el código
      public void main() {
        //creación de un objeto de tipo BinaryTree llamado tree
        BinaryTree tree = new BinaryTree();
        
        //ciclo condicional if donde se llama al método isValidBST del objeto tree y si es true dice que es válido, sino devuelve false entonces el árbol no es válido como BST
        if (tree.isValidBST()) {
            System.out.println("El árbol es un BST válido.");
        } else {
            System.out.println("El árbol no es un BST válido.");
        }
    }
}
