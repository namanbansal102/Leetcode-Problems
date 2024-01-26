public class winnerofCircularGame {
    public static int findWinner(int n,int k){
        if (n==1) {
            return 0;
        }
        int x=findWinner(n-1, k);
        int y=(x+k)%n;
        return y;
    }
    public static void main(String[] args) {
        System.out.println("Winner Of Circular Game LeetCode");
        int sol=findWinner(6, 5);
        System.out.println(sol);

    }
}
