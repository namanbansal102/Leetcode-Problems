public class perfectSq {
    public static int helper(int n){
        if (n==0) {
            return 0;
        }
        for (int i = 0; i*i <=n; i++) {
            int result=1+helper(n-i*i);
        }
    }
    public static void main(String[] args) {
        System.out.println("Perfect Squares LeetCode Problem");

    }
}
