import java.util.*;;
public class threeSum {
    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> set=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            set.put(arr[i], i);
        }
        for (int j = 0; j < arr.length; j++) {
            
            if (set.containsKey(target-arr[j])) {
                int num=set.get(target-arr[j]);
                if(num!=arr[j]){

                int k[]={num,j};
                return k;
                }
            }
        }
        int yut[]={};
        return yut;
    }
    public static void main(String[] args) {
        List<List<Integer>> lst=new ArrayList<>();
        HashSet<List<Integer>> set=new HashSet<>();
        System.out.println("3 Sum LeetCode Problem");
        int nums[]={-1,0,1,2,-1,-4};
        for (int i = 0; i < nums.length; i++) {
            List<Integer> subLst=new ArrayList<>();
            // int o[]=Arrays.copyOfRange(nums, i+1,nums.length);
            int k[]=twoSum(nums, -nums[i]);
            System.out.print(nums[k[0]]+" ");
            System.out.print(nums[k[1]]);
            System.out.println();
            if (k.length!=0 && k[0]!=k[1] && k[1]!=i && k[0]!=i ) {
                subLst.add(nums[k[0]]);
                subLst.add(nums[k[1]]);
                subLst.add(nums[i]);
                set.add(subLst);
            }
        }
        for (List<Integer> gy : set) {
            lst.add(gy);
        }
        System.out.println(lst);
    }
}