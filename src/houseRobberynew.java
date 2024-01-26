public class houseRobberynew {
    public static int Robbery(int nums[],int i,int n,int dp[]){
        if (i>=n) {
            return 0;}
        if (dp[i]!=-1) {
            return dp[i];
        }
        int steal=nums[i]+Robbery(nums, i+2,n,dp);
        System.out.println("Value of Steal is="+steal);
        int skip=Robbery(nums, i+1,n,dp);
        System.out.println("Value of Skip is="+skip);
        int getMax=Math.max(steal, skip);
        dp[i]=getMax;
        System.out.println("Value of GetMax is:"+getMax);
        return dp[i];
    }
    public static void main(String[] args) {
        int houses[]={1,2,3,1,1,2,3,4,5,6,6,7,8,8,9,2,2,4,4,5,4,4,65,3,43,3,43,53,3,343,343,43,43,432,34,343,43,434,3};
        int dp[]=new int[houses.length+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i]=-1;
        }
        int get=Robbery(houses, 0, houses.length,dp);
        System.out.println(get);

        
    }
}
