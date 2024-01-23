import java.util.HashMap;
import java.util.HashSet;

public class setMismatch {
    public static void main(String[] args) {
        System.out.println("Set Mismatch leetCode problem");
        int nums[]={2,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        int key=0;
        int l=1;
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                System.out.println("Map key="+nums[i]);
                key=nums[i];
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);

        }
        while (map.containsKey(l)) {
            l++;
        }
        int arr[]={l,key};
        System.out.println(l);
        System.out.println(key);
        System.out.println(map);
    }
}
