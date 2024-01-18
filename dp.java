public class dp {
    public static int fibonacci(int n,int dp[]){
        if (n<=1) {
            return 1;
        }
        // if (dp[n]!=-1) {
        //     return dp[n];
        // }
        dp[n]=fibonacci(n-1,dp)+fibonacci(n-2,dp);
        return dp[n] ;
    }
    public static void main(String[] args) {
        System.out.println("Dynamic Programming in Java");
        int n=232;
        int dp[]=new int[n+1];
        for (int i = 0; i < n+1; i++) {
            dp[i]=-1;
        }
        int val=fibonacci(n,dp);
        System.out.println(val);

    }
}
