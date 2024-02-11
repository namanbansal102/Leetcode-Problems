import java.util.HashMap;

public class wordPattern {
    public static void main(String[] args) {
        System.out.println("Word Pattern Leetcode Problem");
        String pattern = "abba";
        String s = "dog dog dog dog";
        HashMap<Character,String> map=new HashMap<>();
        String newS[]=s.split(" ");
        if (pattern.length()!=newS.length) {
            System.out.println("False...");
        }
        for (int i = 0; i < pattern.length(); i++) {
            char ch=pattern.charAt(i);
            System.out.println(map.get(ch)+newS[i]);
            if (map.containsKey(ch) && !(map.get(ch)).equals(newS[i])) {
                System.out.println("False False in For Loop.................");
                break;
            }
            if (!map.containsKey(ch) && map.containsValue(newS[i])) {
                System.out.println("Containing Value False.....");
                break;
            }
            map.put(pattern.charAt(i), newS[i]);
            System.out.println(map);
        }
    }
}
