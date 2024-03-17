import java.sql.Array;
import java.util.Arrays;

public class mcm {
    public static int mcmF(int arr[],int i,int j,int dp[][]){
        // int arr[]={1,2,3,4};
        if (i==j) {
            // System.out.println("i==j Condition Statisfied");
            return 0;
        }
        if (dp[i][j]!=-1) {
            return dp[i][j];
        }
        int ans=Integer.MAX_VALUE;
            for (int k = i; k < j; k++) {
                // System.out.println("Running For Loop");
                
                int cost1=mcmF(arr, i, k,dp);
                // System.out.println("Value of Cost1 is:::::"+cost1);
                int cost2=mcmF(arr, k+1, j,dp);
                // System.out.println("Value of Cost2 is:::::"+cost2);
                int cost3=arr[i-1]*arr[k]*arr[j];
                // System.out.println("Value of cost3 is:"+cost3);
                int total=cost1+cost2+cost3;
                // System.out.println("Total Cost is:::::"+total);
                ans=Math.min(ans,total);
                dp[i][j]=ans;
                // System.out.println("Value of ans is:"+ans);
            }
            return ans;
    }
    public static void main(String[] args) {
        System.out.println("Memmziation DP Problem Matrix Chain Multiplication");
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
        int n=arr.length;
        int dp[][]=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j]=-1;
            }
        }
        int get=mcmF(arr, 1, arr.length-1,dp);
        System.out.println(Arrays.deepToString(dp));
        System.out.println(get);

    }
}
