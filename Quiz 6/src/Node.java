public class Node {
    private int data;
    private Node leftChild;
    private Node rightChild;

    public Node(int value) {
        this.data = value;
        leftChild = null;
        rightChild = null;
    }

    public void insert(int value) {
        if (data == value) {
            return;
        }

        if (value > data) {
            if (rightChild == null) {
                rightChild = new Node(value);
            }
            else {
                rightChild.insert(value);
            }
        }
        else {
            if (leftChild == null) {
                leftChild = new Node(value);
            }
            else {
                leftChild.insert(value);
            }
        }
    }

    public void inOrderTraverse() {
        // Left Child
        if (leftChild != null) {
            leftChild.inOrderTraverse();
        }

        System.out.println("Node: " + data);

        // Right Child
        if(rightChild != null) {
            rightChild.inOrderTraverse();
        }
    }

    public Node get(int value) {
        if (value == data) {
            return this;
        }

        if (value > data) {
            if (rightChild != null) {
                return rightChild.get(value);
            }
        }
        else {
            if (leftChild != null) {
                return leftChild.get(value);
            }
        }

        return null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';

    }
}