import java.util.HashMap;

public class romanToInteger {
    public static void main(String[] args) {
        System.out.println("Roman To Integer LeetCode Problem");
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        String s="MCMXCIV";
        int total=0;
        int i=0;
        int n=s.length();
        while (i<s.length()) {
            char ch=s.charAt(i);
            if (i<n-1 && ((ch=='I' && s.charAt(i+1)=='V')||  (ch=='I' && s.charAt(i+1)=='X'))) {
                total+=map.get(s.charAt(i+1))-map.get(ch);
                i+=2;
            }
            else if (i<n-1 && ((ch=='X' && s.charAt(i+1)=='L')||  (ch=='X' && s.charAt(i+1)=='C'))) {
                total+=map.get(s.charAt(i+1))-map.get(ch);
                i+=2;
            }
            else if (i<n-1 && ((ch=='C' && s.charAt(i+1)=='D')||  (ch=='C' && s.charAt(i+1)=='M'))) {
                total+=map.get(s.charAt(i+1))-map.get(ch);
                i+=2;
            }
            else{

                total+=map.get(ch);
                i++;
            }
        }
        System.out.println(total);
    }
}
