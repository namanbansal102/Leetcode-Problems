public class Cost {
    public static void printDp(int dp[]){
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i]+" ");
        }
        System.out.println();
    }
    public static int calculateCost(int n,int cost[],int dp[]){
        System.out.println("Calculate Cost Function Running");
        // int cost[]={1,100,1,1,1,100,1,1,100,1};
        if (n==1) {
            System.out.println("Reached To Stair 1 ");
            return cost[1];
        }
        if (n==2) {
            System.out.println("Reached To Stair 2 ");
            return cost[2];
        }
        if (dp[n]!=-1) {
            System.out.println("dp[n]==-1 ");
            return cost[n];
        }
        dp[n]=cost[n]+Math.min(calculateCost(n-1, cost, dp), calculateCost(n-2,cost,dp));
        printDp(dp);
        return dp[n];

    }
    public static void main(String[] args) {
        System.out.println("Minimum Cost of Climbing Stairs LeetCode Problem");
        int cost[]={1,100,1,1,1,100,1,1,100,1};
        int n=cost.length;
        int dp[]=new int[n];
        for (int i = 0; i < dp.length; i++) {
            dp[i]=-1;
        }
        int get1=calculateCost(n-1,cost,dp);
        int get2=calculateCost(n-2,cost,dp);
        // int get2=solve2(n-2,cost,dp);
        System.out.println("The Value of get1:"+get1);        
        System.out.println("The Value of get2:"+get2);        

    }
}
