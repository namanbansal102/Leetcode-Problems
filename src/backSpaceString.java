import java.util.Stack;

public class backSpaceString {
    public static void main(String[] args) {
        System.out.println("BacSpace String Compare Leetcode Problem");
        String s="xywrrmp";
        String t="xywrrmu#p"        ;
        Stack<Character> st=new Stack<>();
        Stack<Character> tt=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (ch!='#') {
                st.push(ch);
            }
            else if (!st.isEmpty() && ch=='#') {
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char ch=t.charAt(i);
            if (ch!='#') {
                tt.push(ch);
            }
            else if (!tt.isEmpty() && ch=='#') {
                tt.pop();
            }
            
        }
        System.out.println(st);
        System.out.println(tt);
        if (st.equals(tt)) {
            System.out.println("St equal to tt");
        }else{
            System.out.println("Not Equal");
        }

    }
}
