public class houseRobbery {
    public static int Robbery(int nums[],int i,int n){
        if (i>=n) {
            return 0;
        }
        int steal=nums[i]+Robbery(nums, i+2,n);
        int skip=Robbery(nums, i+1,n);
        return Math.max(steal, skip);
    }
    public static void main(String[] args) {
        System.out.println("House Robbery LeetCode Problem");
        int nums[]={2,7,9,3,1};
        int val=Robbery(nums, 0, nums.length);
        System.out.println(val);

    }
}