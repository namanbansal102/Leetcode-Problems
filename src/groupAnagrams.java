import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class groupAnagrams {
    public static void main(String[] args) {
        System.out.println("Group Anagrams Problem");
        String strs[]={""};
        HashMap<String,List<String>> map=new HashMap<>();
        for (String str : strs) {
            char sorted[]=str.toCharArray();
            Arrays.sort(sorted);
            String newStr=new String(sorted);
            if (!map.containsKey(newStr)) {
                map.put(newStr, new LinkedList<>());
            }
            map.get(newStr).add(str);
        }
        List<List<String>> res=new ArrayList<>();
        for (Map.Entry<String, List<String>> get : map.entrySet()) {
            res.add(get.getValue());
        }
        System.out.println(res);
    }
}
