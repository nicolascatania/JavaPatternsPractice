package iteratorPractice.btree;

import java.util.Iterator;
import java.util.Stack;

public class BinaryTree implements Iterable<Integer> {
    private TreeNode root;

    // Constructor para inicializar el árbol con un valor raíz.
    public BinaryTree(int value) {
        this.root = new TreeNode(value);
    }

    // Métod para agregar un hijo a la izquierda o derecha (solo como ejemplo, puedes expandirlo)
    public void addLeft(TreeNode parent, int value) {
        parent.left = new TreeNode(value);
    }

    public void addRight(TreeNode parent, int value) {
        parent.right = new TreeNode(value);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new InOrderIterator(root);
    }

    // Iterador en orden
    private class InOrderIterator implements Iterator<Integer> {
        private Stack<TreeNode> stack = new Stack<>();

        // Inicializamos el iterador apuntando al nodo raíz
        public InOrderIterator(TreeNode root) {
            pushLeft(root);
        }

        // Método que recursivamente agrega los nodos más a la izquierda a la pila
        private void pushLeft(TreeNode node) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new IllegalStateException("No more elements");
            }

            // Extraemos el nodo más a la izquierda de la pila
            TreeNode current = stack.pop();
            // Si el nodo tiene hijo derecho, procesamos su subárbol
            if (current.right != null) {
                pushLeft(current.right);
            }

            return current.value;
        }
    }

    public static void main(String[] args) {
        // Crear el árbol binario
        BinaryTree tree = new BinaryTree(1);
        tree.addLeft(tree.root, 2);
        tree.addRight(tree.root, 3);
        tree.addLeft(tree.root.left, 4);
        tree.addRight(tree.root.left, 5);

        // Recorrer el árbol con el iterador
        for (int value : tree) {
            System.out.println(value);
        }
    }
}
