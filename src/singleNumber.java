public class singleNumber {
    public static void main(String[] args) {
        System.out.println("Single Number LeetCode Problem");
        int nums[]={4,1,2,1,2};
        int a=0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Value of a:"+Integer.toBinaryString(a)+" nums[i]:"+Integer.toBinaryString(nums[i]));
            a=a^nums[i];
            System.out.println("After Converting:"+Integer.toBinaryString(a));
            // System.out.println("Value of a:"+a+" nums[i]:"+nums[i]);
        }
        System.out.println(a);

    }
}
