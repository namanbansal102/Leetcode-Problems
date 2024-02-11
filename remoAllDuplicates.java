import java.util.Stack;

public class remoAllDuplicates {

    public static void main(String[] args) {
        System.out.println("Remove All Duplicates Fom String");
        String s="azxxzy";
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (st.isEmpty()) {
                st.push(ch);
            }
            else if (st.peek()==ch) {
                st.pop();
            }else{
                st.push(ch);
            }
        }
        for (Character subChar : st) {
            sb.append(subChar);
        }
        System.out.println(sb.toString());
    }
}