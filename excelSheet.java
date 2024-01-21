public class excelSheet {
    public static void main(String[] args) {
        System.out.println("Excel Sheet LeetCode Problem");
        int n=701;
        String s="";
        while (n>0) {
            //Finding Remainder
            n--;
            int rem=n%26;
            System.out.println("Value of rem is:"+rem);
            char ch=(char)('a'+rem);
            System.out.println("Value of char is:"+ch);
            s=ch+s;
            //Dividing The Number
            n=n/26;
        }
        System.out.println(s.toUpperCase());

    }
}
