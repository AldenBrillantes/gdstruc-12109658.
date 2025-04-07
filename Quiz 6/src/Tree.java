public class Tree {
    private Node root;

    public void insert(int value) {
        // Tree is empty
        if (root == null) {
            root = new Node(value);
            return;
        }

        root.insert(value);
    }

    public void inOrderTraverse() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        root.inOrderTraverse();
    }

    public Node get(int value) {
        // tree is empty
        if (root == null) {
            return null;
        }

        return root.get(value);
    }

    public Node getMin() {
        if (root == null) return null;
        Node current = root;
        while (current.getLeftChild() != null) {
            current = current.getLeftChild();
        }
        return current;
    }

    public Node getMax() {
        if (root == null) return null;
        Node current = root;
        while (current.getRightChild() != null) {
            current = current.getRightChild();
        }
        return current;
    }

    public void traverseInOrderDescending() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }
        traverseDescending(root);
    }

    private void traverseDescending(Node node) {
        if (node == null) return;
        traverseDescending(node.getRightChild());
        System.out.println("Node: " + node.getData());
        traverseDescending(node.getLeftChild());
    }
}
