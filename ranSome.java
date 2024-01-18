import java.util.HashMap;

public class ranSome {
    public static void main(String[] args) {
        System.out.println("RanSom Note LeetCode Problem");
        String ransomNote="aac";
        String magazine="aab";
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char ch=magazine.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch=ransomNote.charAt(i);
            if (map.containsKey(ch) && map.get(ch)!=0) {
                map.put(ch, map.getOrDefault(ch, 0)-1);
            }
            else{
                System.out.println("Else Condition Gets");
                break;
            }
        }
        System.out.println(map);
    }
}
