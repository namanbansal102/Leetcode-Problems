import java.util.HashMap;

public class my {
    public static void main(String[] args) {
        System.out.println("2 Sum Leet Code Problem");
        HashMap<Integer,Integer> set=new HashMap<>();
        int arr[]={3,2,4};
        int target=6;
        for (int i = 0; i < arr.length; i++) {
            set.put(arr[i], i);
        }
        System.out.println(set);
        for (int j = 0; j < arr.length; j++) {
            
            if (set.containsKey(target-arr[j])) {
                int num=set.get(target-arr[j]);
                if (num==j) {
                    
                }
                System.out.println(num+" "+j);
            }
        }

    }
}
