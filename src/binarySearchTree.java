public class binarySearchTree {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data,Node left,Node right){
            this.data=data;
            this.left=null;
            this.right=null;
        }}
        public Node insert(Node root,int data){
            System.out.println("Running Insert Function");
            if (root==null) {
                System.out.println("Root is Null");
                Node newNode=new Node(data, null, null);
                root=newNode;
                return root;
            }
            // Duplicacy is Avoided for This Case
            if (root.data>data) {
                System.out.println(" if Condition Going To Left Subtree");
                root.left=insert(root.left,data);
            }
            else{
                System.out.println(" Else Condition Going To Right Subtree");
                root.right=insert(root.right,data);
            }
            return root;
        }
    public  boolean search(Node root,int val){
        if (root==null) {
            return false ;
        }
        if (root.data>val) {
            search(root.left, val);
        }
        else if (root.data==val) {
            return true;
        }
        else{
            search(root.right, val);
        }
        return false;
    }

    public void inorder(Node root){
        if (root==null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
    System.out.println("Binary Search Tree");
    int values[]={5,1,3,4,2,7};
    binarySearchTree bst=new binarySearchTree();
    Node root=null;
    for (int i = 0; i < values.length; i++) {
        root=bst.insert(root, values[i]);
    }
    bst.inorder(root);
    System.out.println();
    boolean get=bst.search(root, 7);
    System.out.println(get);
    System.out.println(root.right.data);


    }
}
