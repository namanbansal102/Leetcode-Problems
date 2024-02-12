public class IntegerReplace {
    static int count=0;
    public static int callFunc(int n,int count){
        if (n==1) {
        
            return count;
        }
        if (n%2==0) {
           return callFunc(n/2,count+1);

        }
        else{
            int m1=callFunc(n+1,count+1);
            int m2=callFunc(n-1,count+1);
           return  Math.min(m1,m2);
        }

    }
    public static void main(String[] args) {
        System.out.println("Integer ReplaceMent LeetCode Problem DP");
        int n=3;
        int dp[]=new int[]
        int get=callFunc(n,0);
        System.out.println("Value of get is:"+get);
    }
}
