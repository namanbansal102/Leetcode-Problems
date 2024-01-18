public class minCostOfSegements {
    public static int cutSegments(int n,int x,int y,int z){
        if (n==0) {
            return 0;
        }
        if (n<0) {
            return Integer.MAX_VALUE;
        }
        int a=cutSegments(n-x, x, y, z)+1;
        int b=cutSegments(n-y, x, y, z)+1;
        int c=cutSegments(n-z, x, y, z)+1;
        int ans=Integer.max(a,Integer.max(b,c));
        return ans;
    }
    public static void main(String[] args) {
        int get=cutSegments(7, 5, 2, 2);
        System.out.println(get);
    }
}
