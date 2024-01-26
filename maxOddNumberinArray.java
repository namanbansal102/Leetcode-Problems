public class maxOddNumberinArray {
    public static void main(String[] args) {
        System.out.println("Maximum Odd Number in An String LeetCode");
        String num="";
        String odd="";
        if ((num.charAt(num.length()-1)-'0')%2!=0) {
            System.out.println("Num is an odd Number");
        }
        else{
            for (int i = num.length()-2 ; i>=0; i--) {
                System.out.println(num.charAt(i));
                if ((num.charAt(i)-'0')%2!=0) {
                    odd=num.substring(0, i+1);
                    break;
                }
            }
        }
        System.out.println(odd);
    }
}
