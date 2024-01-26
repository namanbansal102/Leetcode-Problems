import java.util.ArrayList;
import java.util.List;

public class removeSubfolder {
    class Node{
        Node[] children;
        boolean eow;
        Node(){
            children=new Node[26];
            for (int i = 0; i < 26; i++) {
                this.children[i]=null;
            }
            this.eow=false;
        }
    }
    Node root=new Node();

    public void insert(String path){
        Node curr=root;
        for (int i = 0; i <path.length(); i++) {
        int idx=path.charAt(i)-'a';
        if (curr.children[idx]==null) {
            curr.children[idx]=new Node();
        }
        if (i==path.length()-1) {
            curr.children[idx].eow=true;
        }
        curr=curr.children[idx];
        
        }
        
    }
    
    
    public void getfold(Node curr,StringBuilder sb,List<String> lst){
        if (root==null) {
            lst.add(sb.toString());
            return;
        }
        for (int i = 0; i < 26; i++) {
            // BaseCase if root.children idx is null
            System.out.println("running for loop for i="+i);
            if (curr.children[i]!=null && curr.children[i].eow==true) {
                char ch=(char)(i+'a');
                sb.append(ch);
                System.out.println("running Condition for char ch="+ch);
                getfold(curr.children[i],sb, lst);
                sb.deleteCharAt(sb.length()-1);
            }
            
                }
    }
    public static void main(String[] args) {
        System.out.println("Remove SubFolders From Given Folder LeetCode Problem");
        removeSubfolder r1=new removeSubfolder();
       
        r1.insert( "a");
        r1.insert( "b");
        r1.insert( "ab");
        List<String> lst=new ArrayList<>();
        r1.getfold(r1.root,new StringBuilder(""), lst);
        System.out.println(lst);

    }
}
