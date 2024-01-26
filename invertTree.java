import java.util.Stack;

public class invertTree {
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
    public Node inTree(Node root){
        Stack<Node> st=new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {    
            Node curr=st.peek();
            if (curr!=null) {
                System.out.println(curr.data);
            }
            st.pop();
            if (curr!=null) {
                st.push(curr.left);
                if (curr.left!=null) {
                    System.out.print(curr.left.data+"-");
                }
                st.push(curr.right);
                if (curr.right!=null) {
                    
                    System.out.print(curr.right.data);
                }
                System.out.println();
                // Swapping Them
                Node temp=curr.left;
                curr.left=curr.right;
                curr.right=temp;
            }
        }
        return root;
    }
    
    public static void main(String[] args) {
        System.out.println("Binary Tree Data Structure");
        invertTree i1=new invertTree();
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // int arr[]={1,2,-1,-1,3,-1,-1};
        Node c=i1.buildTree(arr);
        Node i=i1.inTree(c);

        System.out.println(i.right.data);

    }
}
