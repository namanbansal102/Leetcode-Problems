import java.util.Stack;

public class OneThreeTwoPattern {

    public static void main(String[] args) {
        System.out.println("132 Pattern LeetCode Problem");
        int nums[]={3,5,0,4};
            Stack<Integer> st=new Stack<>();
            int n=nums.length;
            int nums3=-9999;
            for (int i = n-1; i>=0; i--) {
                if (nums[i]<nums3) {
                    System.out.println(true);
                    break;
                }
                while (!st.isEmpty() && st.peek()<nums[i]) {
                    nums3=st.peek();
                    st.pop();
                }
                st.push(nums[i]);
                System.out.println("The Stack is:"+st);
            }
        System.out.println(st);

    }
}