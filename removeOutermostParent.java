import java.util.Stack;

public class removeOutermostParent {
    public static void main(String[] args) {
        System.out.println("Remove Outermost Parenthesis LeetCode Problem");
        String s="()()";
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            System.out.println(st);
            if(st.size()==0 && ch=='('){
                System.out.println("Running Old Condition ");
                st.push(ch);
            }
            else if (st.size()==1 && ch==')') {
                st.pop();
                
            }
            else if (st.peek()=='(' && ch==')') {
                st.pop();
                sb.append(ch);
            }
            else if (ch=='(') {
                sb.append(ch);
                st.push(ch);
            }
            
                System.out.println("StringBuilder is:"+sb.toString());
            
        }
        System.out.println(sb.toString());
    }
}
