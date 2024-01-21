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
    
    public boolean pathSum(Node curr,int targetSum){
        // int arr[]={1,2,-1,-1,3,-1,-1};
        if(curr==null)return null;
        if (curr==null && targetSum==0 ) {
            return true;
        }
        pathSum(curr.left,targetSum-curr.data);
        pathSum(curr.right,targetSum-curr.data);
        return false;
        
    }
    public static void main(String[] args) {
        System.out.println("Binary Tree Data Structure");
        binaryTree b1=new binaryTree();
        // int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int arr[]={1,2,3,-1,-1,-1,4,-1,-1};
        Node c=b1.buildTree(arr);
        int targetSum=6;
        int totSum=b1.pathSum(c,targetSum);
        System.out.println(totSum);
        // System.out.println(c.data);

    }
}
