public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int data){
        this.data = data;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public Node getLeft() {
        return left;
    }
    public Node getRight() {
        return right;
    }
    public int getData() {
        return data;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
