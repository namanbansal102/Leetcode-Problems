public class searchInsertPos {

    public static void main(String[] args) {
        System.out.println("Search Insert Position LeetCode Problem");
        int nums[]={1,3};
        int n=nums.length;
        int first=0;
        int last=n-1;
        int target=2;
        while (first<=last) {
            int mid=(first+last)/2;
            if (nums[mid]==target) {
                System.out.println("Founded The Element"+mid);
                break;
            }
            else if (mid<target) {
                first=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        System.out.println(last);
        System.out.println(first);
        if(last<0   )System.out.println("Condition is last less than 0 "+0);
        else if(last==n-1)System.out.println("Condition is last equal to n "+n);
        else System.out.println(last);
    }
}