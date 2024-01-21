public class validPalindrome {
    public static void main(String[] args) {
        System.out.println("Valid Palindrome Leetcode Problem");
        String s="Marge, let's \\\"[went].\\\" I await {news} telegram.";
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if ((ch-'a'>=0 && ch-'a'<26) || (ch-'0'>=0 && ch-'0'<=9)) {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
        s=sb.toString();
        int i=0;
        int j=s.length()-1;
        while (i<=j) {
            if (s.charAt(i)!=s.charAt(j)) {
                System.out.println(s.charAt(i));
                System.out.println(s.charAt(j));
                System.out.println("Finally Loop Breaks");
                break;
            }
            i++;
            j--;
        }
        System.out.println('{'-'a');
    }
}
