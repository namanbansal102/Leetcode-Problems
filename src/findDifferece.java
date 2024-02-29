public class findDifferece {
    public static void main(String[] args) {
        System.out.println("Find the Difference LeetCode Problem");
        String s = "abcde";
        String t = "edabcf";
        s=s+'0';
        int a=0;
        for (int i = 0; i < t.length(); i++) {
            int sChar=s.charAt(i)-'0';
            int tChar=t.charAt(i)-'0';
            a=(a^sChar^tChar);
        }
        System.out.println((char)(a+'0'));
    }
}
