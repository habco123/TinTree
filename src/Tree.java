
public class Tree {
    private Node root;
    
    public void add(int data){
        root = addRecursive(root, data);
    }

    private Node addRecursive(Node current, int data) {
        Node newNode = new Node(data);

        if (current == null) {
            return new Node(data);
        }

        if(data < current.getData()){
            current.setLeft(addRecursive(current.getLeft(), data));
        }else if(data > current.getData()){
            current.setRight(addRecursive(current.getRight(), data));
        }else{
            return current;
        }
        return current;
    }

    public void print(){
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node node) {
        if(node != null){
            inOrderTraversal(node.getLeft());
            System.out.println(node.getData());
            inOrderTraversal(node.getRight());
        }
    }

}
