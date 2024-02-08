import java.util.Stack;

public class symmetricTree {
    class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static int idx=-1;
    public Node buildTree(int arr[]){
        idx++;
        if (arr[idx]==-1) {
            return null;
        }
        Node newNode=new Node(arr[idx]);
        newNode.left=buildTree(arr);
        newNode.right=buildTree(arr);
        return newNode;
    }
public boolean symTree(Node left,Node right){
    if (left==null && right==null) {
        return true;
    }
    if (left==null || right==null) {
        return false;
    }
    if (left.data==right.data && symTree(left.left, right.right) && symTree(left.right, right.left)) {
        return true;
    }
    return false;
}
    
    public static void main(String[] args) {
        System.out.println("Symmetric Tree LeetCode Problem");
        symmetricTree s1=new symmetricTree();
        int arr[]={1,2,3,-1,-1,4,-1,-1,2,4,-1,-1,3,-1,-1};
        // int arr[]={1,2,-1,-1,3,-1,-1};
        Node c=s1.buildTree(arr);
        boolean res=s1.symTree(c.left, c.right);
        System.out.println(res);
        System.out.println(c.data);

    }
}
