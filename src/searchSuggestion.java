public class searchSuggestion {
    Node root=new Node();
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
    public static void main(String[] args) {
        System.out.println("Search Suggestion LeetCode Problem");
        searchSuggestion s1=new searchSuggestion();
        String products[]={"mobile","mouse","moneypot","monitor","mousepad"};
        String searchWord="mouse";
    }
}
