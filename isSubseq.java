public class isSubseq {
    public void solve(String s){

    }
    public static void main(String[] args) {
        System.out.println("is Subsequence LeetCode Problem");
        String s = "abc";
        String t = "ahbgdc";
        int m=s.length();
        int n=t.length();
        int i=0;
        int j=0;
        while (i<m && j<n) {
            char ch1=s.charAt(i);
            char ch2=t.charAt(j);
            if (ch1==ch2) {
                i++;
                j++;
            }
            else{
                j++;
            }

        }
        System.out.println(i);

    }
}
