import java.util.ArrayList;
import java.util.List;
public class Triangle {
public static int calcMin(List<List<Integer>> triangle,int r,int c,int dp[][]){
    // [   [2],
    //    [3, 4],
    //   [6, 5, 7],
    //  [4, 1, 8, 3]]
    int R=triangle.size();
    if (r>=R) {
        return 0;
    }
    if (dp[r][c]!=0) {
        return dp[r][c];
    }
    int firstHalf=calcMin(triangle, r+1, c,dp);
     System.out.println("Value of First Half is:"+firstHalf);
    int secondHalf=calcMin(triangle, r+1, c+1,dp);
    System.out.println("Value of Second Half is:"+secondHalf);
    System.out.println("Total Returned Value is:"+(Math.min(firstHalf,secondHalf)+triangle.get(r).get(c)));
    dp[r][c]=Math.min(firstHalf,secondHalf)+triangle.get(r).get(c);
    return dp[r][c];
}

    public static void main(String[] args) {
        System.out.println("Triangle LeetCode Problem");
        List<List<Integer>> triangle =new ArrayList<>();
        List<Integer> sublst1=new ArrayList<>();
        sublst1.add(2);
        triangle.add(sublst1);
        List<Integer> sublst2=new ArrayList<>();
        sublst2.add(3);
        sublst2.add(4);
        triangle.add(sublst2);
        List<Integer> sublst3=new ArrayList<>();
        sublst3.add(6);
        sublst3.add(5);
        sublst3.add(7);
        triangle.add(sublst3);
        List<Integer> sublst4=new ArrayList<>();
        sublst4.add(4);
        sublst4.add(1);
        sublst4.add(8);
        sublst4.add(3);
        triangle.add(sublst4);
        int dp[][]=new int[triangle.size()+1][triangle.size()+1];
        int get=calcMin(triangle, 0, 0,dp);

        System.out.println("The Value of Get is:"+get);
        System.out.println(triangle);
    }
}
