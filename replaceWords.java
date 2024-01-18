public class replaceWords {
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
    public String search(String word,StringBuilder sb){
        Node current=root;
        for (int i = 0; i < word.length(); i++) {
            int idx=word.charAt(i)-'a';
            if (current.children[idx]!=null && current.children[idx].eow==true) {
                sb.append(word.charAt(i));
                return sb.toString();
            }
            if (current.children[idx]!=null) {
                sb.append(word.charAt(i));
                current=current.children[idx];
            }
            else {
              return word;
            }
        }
        
        return sb.toString();
    }
    public static void main(String[] args) {
        String dictionary[]={"a","b","c"};
        String sentence= "aadsfasf absbs bbab cadsfafs";
        replaceWords w1=new replaceWords();
        for (int i = 0; i < dictionary.length; i++) {
            w1.insert(dictionary[i]);
        }
        System.out.println("Words Inserted Sucessfully");
        String sen[]=sentence.split(" ");
        String newArr[]=new String[sen.length];
        int i=0;
        for (String woString : sen) {
            
            newArr[i++]=w1.search(woString, new StringBuilder());
        }
        String res=String.join(" ", newArr);
        System.out.println(res);


    }
}