public class uniquePathsRobot {
    public static int detectPath(int sr,int sc,int er,int ec){
        if (sr>er || sc>ec) {
            return 0;
        }
        if (sr==er && sc==ec) {
            return 1;
        }
        int downWays=detectPath(sr+1, sc, er, ec);
        int rightWays=detectPath(sr, sc+1, er, ec);
        int totalWays=downWays+rightWays;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println("Unique Paths of a Robot Problem");
        // Number of Rows
        int m=19;
        // Number of Columns
        int n=13;
        System.out.println(detectPath(0, 0, m-1, n-1));
    }
}
