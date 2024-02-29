import java.util.Stack;

public class basicCalculator {
    public static void main(String[] args) {
        System.out.println("Basic Calculator Leetcode Problem");
        String s="3+2*2";
        Stack<Integer> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            int idx=ch-'0';
            if (idx>=0 &&  idx<=9) {
                val.push(idx);
            }
            if (op.isEmpty()) {
                op.push(ch);
            }
            else{
                if ((ch=='*' && op.peek()=='/') || (ch=='/' && op.peek()=='*')) {
                    
                }
                if ((ch=='-' && op.peek()=='+') || (ch=='+' && op.peek()=='-')) {
                    
                }
            }
        }
    }
}
