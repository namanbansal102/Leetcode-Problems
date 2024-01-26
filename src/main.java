import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        System.out.println("Majority Element ii LeetCode Problem");
        int nums[]={1,2};
        int n=nums.length/3;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);
        ArrayList<Integer> lst=new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            int key=entry.getKey();
            int value=entry.getValue();
            if (value>n) {
                lst.add(key);
            }
        }
        System.out.println(lst);


    }
    
}