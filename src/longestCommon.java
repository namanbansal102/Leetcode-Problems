import java.lang.reflect.Array;
import java.util.Arrays;

public class longestCommon {
    Node root=new Node();
    class Node{
        Node[] children;
        int mark;
        boolean eow;
        Node(){
            children=new Node[26];
            for (int i = 0; i < 26; i++) {
                this.children[i]=null;
            }
            this.eow=false;
            this.mark=0;
        }
    }
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
        curr.children[idx].mark++;
        curr=curr.children[idx];
        }
    }
    public void display(Node curr,StringBuilder sb){
        // BaseCase
        if (curr==null) {
            return;
        }
        if (curr.eow==true) {
            System.out.println(sb.toString());
        }
        for (int i = 0; i < 26; i++) {
            if (curr.children[i]!=null) {
                char ch=(char)(i+'a');
                sb.append(ch);
                System.out.println("Running For Loop :"+sb.toString());
                display(curr.children[i], sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
        
        }
        public void displayMark(Node curr,int n,StringBuilder sb){
        // BaseCase
        
        for (int i = 0; i < 26; i++) {
            if (curr.children[i]!=null) {
                char ch=(char)(i+'a');
                System.out.println("The Character is:"+ch+" "+curr.children[i].mark);
                if (curr.children[i].mark==n) {
                    sb.append(ch);
                }
                displayMark(curr.children[i],n,sb);  
            }
        }
        
        
        }
    

    public static void main(String[] args) {
        System.out.println("Longest Common Prefix LeetCode Problem");
        String strs[]={"dog","racecar","car"};
        longestCommon l1=new longestCommon();
        for (int i = 0; i < strs.length; i++) {
            l1.insert(strs[i]);
        }
        l1.display(l1.root,new StringBuilder());
        StringBuilder sb=new StringBuilder();
        l1.displayMark(l1.root,strs.length,sb);
        System.out.println("After Completing all"+sb.toString());
    }
}