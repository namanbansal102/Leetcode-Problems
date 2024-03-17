public class catlanNumber {
    public static  int cN(int n,int dp[]){
        if (n==0 || n==1) {
            return 1;
        }
        if (dp[n]!=0) {
            return dp[n];
        }
        int ans=0;
        for (int i = 0; i < n; i++) {
            ans+=cN(i,dp)*cN(n-i-1,dp);
        }
        dp[n]=ans;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Catlan Number Fnding");
        int n=30;
        int dp[]=new int[n+1];
        int get=cN(n,dp);
        System.out.println("The Resutlt Of Catlan Number is:::"+get);
    }
}
