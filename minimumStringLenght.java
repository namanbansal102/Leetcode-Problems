import java.util.Stack;

public class minimumStringLenght {
    public static void main(String[] args) {
        System.out.println("Minimum String Lenght After Removing SubString LeetCode Problem");
        String s="ACBBD";
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (st.isEmpty()) {
                st.push(ch);
            }
            else if (st.peek()=='A' && ch=='B') {
               st.pop(); 
            }
            else if (st.peek()=='C' && ch=='D') {
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        System.out.println(st);
    }
}
