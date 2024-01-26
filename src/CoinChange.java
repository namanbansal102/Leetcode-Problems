public class CoinChange {
    public static int coinChange(int coins[],int amount,int dp[]){
        if (amount==0) {
            return 0;
        }
        if (amount<0) {
            return 9999;
        }
        if (dp[amount]!=-1) {
            return dp[amount];
        }
        int mini=9999;
        for (int i = 0; i < coins.length; i++) {
            int ans=coinChange(coins,amount-coins[i],dp);
            if (ans!=9999) {
                mini=Math.min(mini, ans+1);
            }
        }
        dp[amount]=mini;
        return dp[amount];
    }
    public static void main(String[] args) {
        System.out.println("Coin change LeetCode Problem");
        int coins[]={1};
        int amount=10000;
        int dp[]=new int[amount+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i]=-1; 
        }
        int get=coinChange(coins, amount,dp);
        System.out.println(get);

    }
}
