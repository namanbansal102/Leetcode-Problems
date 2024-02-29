import java.util.Stack;

public class makingStringGreat {
    public static String makeGreat(String word){
        // leEeetcode
        for (int i = 0; i < word.length()-1; i++) {
            if (word.charAt(i)+32==word.charAt(i+1) || word.charAt(i+1)+32==word.charAt(i)) {
                String fstHalf=makeGreat(word.substring(0, i));
                System.out.println("First Half and substring is of String is:"+word.substring(0, i)+"  "+fstHalf);
                String scndHalf=makeGreat(word.substring(i+2));
                System.out.println("Second Half and substring of String is:"+word.substring(i+2)+"  "+scndHalf);
                return fstHalf+scndHalf;
            }
        }
        return word;
    }

    public static void main(String[] args) {
        System.out.println("Making The String Great LeetCode Problem");
        String s="abBAcC";
        String op=makeGreat(s);
        System.out.println(op);
        
    }
}