public class houseRobberynew {
    public static int Robbery(int nums[],int i,int n){
        if (i>=n) {
            return 0;
        }
        int steal=nums[i]+Robbery(nums, i+2,n);
        int skip=Robbery(nums, i+1,n);
        return Math.max(steal, skip);

    }
    public static void main(String[] args) {
        
    }
}
