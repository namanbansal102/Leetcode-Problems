public class implementTriee {
    Node root;
    class Node{
        Node children[];
        boolean endOfWord;
        Node(){
            children=new Node[26];
            endOfWord=false;
            for (int i = 0; i < 26; i++) {
            children[i]=null;
        }
        
    }
}
//Constructor of Triee Class
implementTriee(){
        root=new Node();

    }
    
    public void insert(String word){
        Node current=root;
        for (int i = 0; i < word.length(); i++) {
            int idx=word.charAt(i)-'a';
            if (current.children[idx]==null) {
                current.children[idx]=new Node();
            }
            if (i==word.length()-1) {
               current.children[idx].endOfWord=true;
            }
            current=current.children[idx];
        }
    }
    public boolean search(String word){
        Node current=root;
        for (int i = 0; i < word.length(); i++) {
            int idx=word.charAt(i)-'a';
            if (current.children[idx]==null) {
                return false;
            }
            if (i==word.length()-1 && current.children[idx].endOfWord==false) { 
                return false;
            }
            current=current.children[idx];
        }
        return true;
    }
    public boolean startsWith(String prefix){
        Node current=root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx=prefix.charAt(i)-'a';
            if (current.children[idx]==null) {
                System.out.println("Not Found of ch="+prefix.charAt(i));
                return false;
            }
            
            current=current.children[idx];

        }
        return true;
    }
    public boolean wordBreakk(String word){
        if (word.length()==0) {
            return true;
        }
        for (int i = 1; i <=word.length(); i++) {
            
            String firstPart=word.substring(0,i);
            String secPart=word.substring(i);
            if (search(firstPart) && wordBreakk(secPart)) {
                return true;
            }
        }
        return false;
    }
    // Function To Count Nodes
    public int countNodes(Node root){
        if (root==null) {
            return 0;
        }
        int count=0;
        for (int i = 0; i <26; i++) {
            
            if (root.children[i]!=null) {
                count+=countNodes(root.children[i]);
            }
        }
        return count+1;
    }
    public int countUnique(String word){
        
        for (int i = 0; i < word.length(); i++) {
            String suffix=word.substring(i , word.length());
            System.out.println(suffix);
            insert(suffix);
        }
        return countNodes(root);
    }
    static String ans="";
    public void longestWordWithAllPrefix(Node root,StringBuilder temp){
        //BaseCase
        if (root==null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i]!=null && root.children[i].endOfWord==true) {
                temp.append((char)(i+'a'));
                if (temp.length()>ans.length()) {
                    ans=temp.toString();
                }
                longestWordWithAllPrefix(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);   
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("triee Data Structure LeetCode Problem");
        implementTriee t1=new implementTriee();
        String word="cac";
        String wordDict[]={"a","ap","app","appl","apply","apple"};
        for (String wordo : wordDict) {
            t1.insert(wordo);
        }
        System.out.println("Inserted Successfully");
        t1.longestWordWithAllPrefix(t1.root, new StringBuilder());
        System.out.println(t1.ans);
        
        
        


    }
}
