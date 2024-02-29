import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseSubstringParen {

    public static void main(String[] args) {
        System.out.println("Reverse substring between Each Pair Of Parenthesis LeetCode Problem");
        String s="(u(love)i)";
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (ch==')') {
                Queue<Character> q=new LinkedList<>();
                while (!st.isEmpty()) {
                    char subch=st.pop();
                    if (subch=='(') {
                        break;
                    }  
                    q.add(subch);
                }
                System.out.println(q);
            }
            st.push(ch);
            
        }
    }
}