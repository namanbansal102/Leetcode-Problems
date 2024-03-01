import java.util.ArrayList;

public class binarySearchTree {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            
        }}
        public Node insert(Node root,int data){
            // System.out.println("Running Insert Function");
            if (root==null) {
                // System.out.println("Root is Null");
                Node newNode=new Node(data);
                root=newNode;
                return root;
            }
            // Duplicacy is Avoided for This Case
            if (root.data>data) {
                // System.out.println(" if Condition Going To Left Subtree");
                root.left=insert(root.left,data);
            }
            else{
                // System.out.println(" Else Condition Going To Right Subtree");
                root.right=insert(root.right,data);
            }
            return root;
        }
    public  boolean search(Node root,int val){
        if (root==null) {
            return false ;
        }
        if (root.data>val) {
            return search(root.left, val);
        }
        else if (root.data==val) {
            return true;
        }
        else{
            return search(root.right, val);
        }
             
    }

    public void inorder(Node root){
        if (root==null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
   ArrayList<String>  lst=new ArrayList<>();
    public void printRootToLeaf(Node root,ArrayList <Integer> arr){
        if (root==null) {
            return;
        }
        arr.add(root.data);
        if (root.left==null & root.right==null) {
            StringBuilder sb=new StringBuilder();
            for (int i = 0; i < arr.size(); i++) {
                sb.append(arr.get(i)+"->");
            }
            lst.add(sb.toString());
            System.out.println(arr);
            arr.remove(arr.size()-1);
            return;
        }
        printRootToLeaf(root.left, arr);
        printRootToLeaf(root.right, arr);
        arr.remove(arr.size()-1);
    }
    public int printInRange(Node root,int X,int Y,int count){
        if (root==null) {
            return count;
        }
        System.out.println("The Root.data is:"+count);
        if (root.data>=X &&  root.data<=Y) {
            System.out.println("Running If Condition");
            printInRange(root.left, X, Y,count+root.data);
            System.out.println(count+" count count");
            printInRange(root.right, X, Y,count);
        }
        else if (root.data<Y) {
            System.out.println("Running root.data is Greater than upper Limit If Condition");
            printInRange(root.right, X, Y,count);    
        }
        else{
            System.out.println("Running root.data is Smaller than upper Limit If Condition");
            printInRange(root.left, X, Y,count);
        }
        return count;
    }
    public Node  deleteNode(Node root,int val){
     
        if (root.data>val) {
            // Go To Left Subtree
            root.left=deleteNode(root.left, val);
        }
        else if (root.data<val) {
            // Go To Right subTree
            root.right=deleteNode(root.right, val);
        }
        else{
            // If it has One Child
            if (root.left==null && root.right==null) {
                return null;
            }
            // If the Root Node has Only One Children
            if (root.left==null) {
                return root.right;
            }
            else if (root.right==null) {
                return root.left;
            }
            // If The Root Node has Two Children
          
                // It is Always LeftMost Part of Right Subtree
                Node IS=inOrderSuccessor(root.right);
                root.data=IS.data;
                root.right=deleteNode(root.right,IS.data);


            
        }
        return root;
    }
    public Node inOrderSuccessor(Node root){
        while (root.left!=null) {
            root=root.left;
        }
        return root;
    }
    public static void main(String[] args) {
    System.out.println("Binary Search Tree");
    // boolean get=bst.search(root, 7);
    // int val=0;
    //    int rangeVal= bst.printInRange(root, 7, 15,0);
    //     System.out.println("Val is val is val is val is"+rangeVal);
    //     System.out.println(get);
    //     System.out.println(root.right.data);
    int values[]={1,2,3,5};
    binarySearchTree bst=new binarySearchTree();
    Node root=null;
    for (int i = 0; i < values.length; i++) {
        root=bst.insert(root, values[i]);
    }
    Node rootNew=bst.deleteNode(root, 1);
    bst.inorder(root);
    System.out.println("fdfdfdfdfdfdfdfd"+root.data);
    
    ArrayList<Integer> arr=new ArrayList<>();
    
    bst.printRootToLeaf(root, arr);
    ArrayList<String> getLst=bst.lst;
    System.out.println(getLst);
    
        // System.out.println(bst.lst);
        
    }
}
