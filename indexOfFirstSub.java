import java.security.cert.TrustAnchor;

public class indexOfFirstSub {
    public static boolean compare(String hayStack,String needle,int i){
        int n1=hayStack.length();
        int n2=needle.length();
        for (int j = 0; j < n2; j++) {
            if (i>=n1) {
                return false;
            }
            if (needle.charAt(j)!=hayStack.charAt(i++)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Find the First SubString First Occurence LeetCode");
        String hayStack="sadbutsad";
        System.out.println(hayStack.length());
        String needle="sad";
        for (int i = 0; i < hayStack.length(); i++) {
            if (hayStack.charAt(i)==needle.charAt(0)) {
                
                if (compare(hayStack,needle,i)==true) {
                    System.out.println("Compared Successfully"+i);
                    break;
                    
                }
            }
        }
        
    }
}
