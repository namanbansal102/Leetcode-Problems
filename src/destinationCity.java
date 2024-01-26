import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class destinationCity {
    public static void main(String[] args) {
        System.out.println("Destination City LeetCode Problem");
        ArrayList<ArrayList<String>> lst=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            lst.add(new ArrayList<>());
        }
        
            lst.get(0).add("London");
            lst.get(0).add("New York");
            lst.get(1).add("New York");
            lst.get(1).add("Lima");
            lst.get(2).add("Lima");
            lst.get(2).add("Sou Polo");
            System.out.println(lst);
            HashMap<String,String> map=new HashMap<>();
            for (int i = 0; i < lst.size(); i++) {
                map.put(lst.get(i).get(0), lst.get(i).get(1));
            }
            HashMap<String,String> revMap=new HashMap<>();
            for (int i = 0; i < lst.size(); i++) {
                revMap.put(lst.get(i).get(1), lst.get(i).get(0));
            }
            System.out.println(map);
            System.out.println(revMap);
            String start="";
            //iterating loop for starting point
            for (Map.Entry<String,String> entry :map.entrySet()) {
                if (map.containsKey(entry.getKey())) {
                    start=entry.getKey();
                }
            }
            System.out.println(start);
            while (map.containsKey(start)) {
                System.out.println(start);
                start=map.get(start);
            }
            System.out.println(start);
             

        
    }
}
