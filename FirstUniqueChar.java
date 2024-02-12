import java.util.LinkedList;
import java.util.Queue;

public class FirstUniqueChar {
    public static void main(String[] args) {
        System.out.println("Find First Unique Character in a String");
        String s="leetcode";
        int arr[]=new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            int idx=ch-'a';
            System.out.println(idx);
            arr[idx]+=1;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            int idx=ch-'a';
            if (arr[idx]==1) {
                System.out.println("Founded Value on index="+i);
                break;
            }
        }
    }
}
