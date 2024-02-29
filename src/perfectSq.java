public class perfectSq {
    public static int calcMin(int n,int dp[]){
        if (n==0) {
            System.out.println("Getting Break Statement;;;;;");
            return 0;
        }
        if (dp[n]!=0) {
            return dp[n];
        }
        int mincount=9999;
        for (int i = 1; i*i <=n; i++) {
            System.out.println("Value of i^sqaure is:"+i*i);
            int get=calcMin(n-i*i,dp);
            System.out.println("Value of Get is:"+get);
            System.out.println("Value of mincount is:"+mincount);
            int result=1+get;
            mincount=Integer.min(result,mincount);
            dp[n]=mincount;
        }
        return mincount;
    }
    public static void main(String[] args) {
        System.out.println("Perfect Squares LeetCode Problem");
        int n=5;
        int dp[]=new int[n+1];
        int val=calcMin(n,dp);
        System.out.println(val);

    }
}
