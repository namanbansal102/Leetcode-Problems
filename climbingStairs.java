public class climbingStairs {
    public static void printdp(int dp[]){
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i]+" ");
        }
        System.out.println();
    }
    public static int climbdp(int dp[],int n){
        if (n==0) {
            return 1;
        }
        if (n==1 || n==2) {
            return n; 
        }
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        
        dp[n]=climbdp(dp,n-1)+climbdp(dp,n-2);
        printdp(dp);
        return dp[n];
    }
     
    public static void main(String[] args) {
        System.out.println("Climbing Stairs Leet Code Problem");
        int n=4;
        int dp[]=new int[n+1];
        for(int i=0;i<n+1;i++){
            dp[i]=-1;
        }
        int get=climbdp(dp,n);
        System.out.println(get);
        
    }
}
