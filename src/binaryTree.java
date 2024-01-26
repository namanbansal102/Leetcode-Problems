public class binaryTree {
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
    static int total=0;
    public void sumrootToLeafNodes(Node curr,int val){
        if (curr==null) {
            System.out.println("Curr=null");
            return;
        }
        val=val*10+curr.data;
        if (curr.left==null && curr.right==null) {
            total+=val;
            return;
        }
        sumrootToLeafNodes(curr.left,val);
        sumrootToLeafNodes(curr.right,val);

    }
    public static void main(String[] args) {
        System.out.println("Binary Tree Data Structure");
        binaryTree b1=new binaryTree();
        int arr[]={4,9,5,-1,-1,1,-1,-1,0,-1,-1};
        // int arr[]={1,2,-1,-1,3,-1,-1};
        Node c=b1.buildTree(arr);
        b1.sumrootToLeafNodes(c, 0);
        System.out.println(b1.total);
    }
}
