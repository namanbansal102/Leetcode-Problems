import java.util.HashSet;

public class determineIfStringHalves {
    public static void main(String[] args) {
        System.out.println("Determine If String halves Are Alike LeetCode Problem");
        String s="textbook";
        s=s.toLowerCase();
        int n=s.length();
        int i=0;
        int j=n-1;
        HashSet<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int first=0;
        int second=0;
        while (i<j) {
            char firstH=s.charAt(i);
            char secondH=s.charAt(j);
            if (set.contains(firstH)) {
                first++;
            }
            if (set.contains(secondH)) {
                second++;
            }
            i++;
            j--;

        }
        System.out.println("The First="+first);
        System.out.println("The Second="+second);
    }
}
