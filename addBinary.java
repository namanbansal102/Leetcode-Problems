public class addBinary {
    public static void main(String[] args) {
        System.out.println("Add Binary LeetCode Problem");
        String a="1010";
        String b="1011";
        StringBuilder sb=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while (i>=0 || j>=0) {
            int sum=0;
            if (i>=0) {
                sum+=a.charAt(i)-'0';
                i--;
            }
            if (j>=0) {
                sum+=b.charAt(i)-'0';
                j--;
            }
            sum+=carry;
            sb.append(sum%2);
            carry=sum/2;
        }
        System.out.println(carry);
        if (carry==1) {
            sb.append(1);
        }
        System.out.println(sb.reverse().toString());
    }
}
