public class rotateString {
    public static void main(String[] args) {
        System.out.println("Rotate The String LeetCode Problem");
        String s="vcuszhlbtpmksjleuchmjffufrwpiddgyynfujnqblngzoogzg";
        String goal="fufrwpiddgyynfujnqblngzoogzgvcuszhlbtpmksjleuchmjf";
        s=s+s;
        System.out.println(s);
        int idx=0;
        for (int i = 0; i < s.length(); i++) {
            if (idx==goal.length()-1 && s.charAt(i)==goal.charAt(idx)) {
                System.out.println("Idx Value is"+i+" "+s.charAt(i));
                idx++;
                break;
            }
            if(idx==goal.length()-1){
                System.out.println("As This Type of Condition Exists");
                break;
            }
            
            if (s.charAt(i)==goal.charAt(idx)) {
                System.out.println("Idx Value is"+i+" "+s.charAt(i));
                idx++;
            }
            else{
                if (idx!=0) {
                    System.out.println("Else if Condition Satisfies");
                    idx--;
                }
            }
        }
        System.out.println(idx);
        if (idx==goal.length()) {
            
            System.out.println("the Value of idx is:"+idx);
        }
        else{
            System.out.println("Value of If Not Satisfies");
        }
    }
}
