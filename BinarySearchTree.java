public class BinarySearchTree {
    public  static  Node root;
    public static void InsertNode(int _data){
        Node newNode = new Node(_data);
        if(root==null){
            newNode = root;
            return;
        }
    }
    public BinarySearchTree() {
        this.root = null;
    }
}

class Node{
    int data;
    Node right;
    Node left;
    public Node(int data)
    {
        this.data = data;
        this.right = null;
        this.left = null;
    }
}
