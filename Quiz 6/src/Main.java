public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);

        // Normal in-order traversal (Ascending order)
        System.out.println("In-order Traversal:");
        tree.inOrderTraverse();

        // Get and print the minimum value node
        Node minNode = tree.getMin();
        System.out.println("\nMinimum value in the tree: " + (minNode != null ? minNode.getData() : "Tree is empty"));

        // Get and print the maximum value node
        Node maxNode = tree.getMax();
        System.out.println("Maximum value in the tree: " + (maxNode != null ? maxNode.getData() : "Tree is empty"));

        // Perform descending in-order traversal
        System.out.println("\nIn-order Traversal (Descending):");
        tree.traverseInOrderDescending();

        // Search for a specific value
        int searchValue = 25;
        Node searchNode = tree.get(searchValue);
        System.out.println("\nNode for value " + searchValue + " = " + (searchNode != null ? searchNode : "Not found"));
    }
}
