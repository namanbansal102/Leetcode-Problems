public class countandsay {
    public static String countAndSay(int n){
        System.out.println("Value of n is:"+n);
        if (n==1) {
            return "1";
        }
        System.out.println("Running Count and Say Function");
        String str=countAndSay(n-1);
        System.out.println("Finishing Count and Say Function");
        String result="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int count=1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            result+=Integer.toString(count)+ch;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("Count and Say LeetCode Problem");
        String val=countAndSay(4);
        System.out.println("The result is:"+val);

    }
}
