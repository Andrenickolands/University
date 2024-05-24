/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author nicolas sepulveda
 */
class BinaryTree {

    //atributo llamado root "Raíz" de tipo TreeNode 
    TreeNode root;

    //método constructor público que inicializa root en null
    public BinaryTree() {
        this.root = null;
    }

    /**
     * método privado booleano llamado isValidBST que ingresa los argumentos,
     * root de tipo TreeNode "nodo raíz a evaluar", min de tipo Integer "valor
     * mínimo permitido del sub-árbol", max de tipo Integer "valor máximo
     * permitido del sub-árbol"
     */
    private boolean isValidBST(TreeNode root, Integer min, Integer max) {
        //ciclo condicional if que evalua si root es igual a null y si lo es retorna true
        if (root == null) {
            return true;
        }

        /**
         * ciclo condicional if que evalua si min es diferente a null y root es
         * menor igual que min o evalua si max es diferente a null y root es
         * mayor igual a max, entonces determina que el árbol no es váido ya que
         * debe ser mayor que todos sus hijos izquierdos y menor que todos sus
         * hijos derechos, esto también verifica los sub-árboles izquierdos y
         * derechos y retorna false
         */
        if ((min != null && root.val <= min) || (max != null && root.val >= max)) {
            return false;
        }

        //si estas condiciones se cumplen retorna true y que es válido el àrbol binario de busqueda
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }

    /**
     * método público de tipo booleano llamado isValidBST, que verifica si todo
     * el árbol cumple con la propiedad BST a partir del nodo raíz y que llama
     * al método anterior y devuelve true si el árbol es un BST válido y false
     * sino lo es
     */
    public boolean isValidBST() {
        return isValidBST(root, null, null);
    }
}
