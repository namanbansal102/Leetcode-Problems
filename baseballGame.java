import java.util.Stack;

public class baseballGame {
    public static void main(String[] args) {
        System.out.println("BaseBall Game LeetCode Problem");
        String ops[]={"61","-50","65","+","D","-99","-58","88","19","-11"};
        int sum=0;
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            char ch=ops[i].charAt(0);
            
            int idx=ch-'0';
            if (ch=='-' ||(idx>=0 && idx <=9)) {
                System.out.println("Conditioned satisfied for:"+ops[i]);
                int k=Integer.parseInt(ops[i]);
                st.push(k);
                sum+=k;
            }
            else{
                if (ch=='C') {
                    int popped=st.pop();
                    sum-=popped;
                }
                if (ch=='D') {
                    int log=2*st.peek();
                    st.push(log);
                    sum+=log;
                }
                if (ch=='+') {
                    int elem=st.pop();
                    int summed=elem+st.peek();
                    st.push(elem);
                    sum+=summed;
                    st.push(summed);
                }
            }  
            System.out.println("Stack is:"+st);
        }
        System.out.println(st);
        System.out.println(sum);

    }
}
