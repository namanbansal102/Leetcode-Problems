import java.util.HashMap;

public class countNicePairs {
    public static void main(String[] args) {
        System.out.println("Count Nice Pairs in An Array");
        int MOD=1000000000+7;
        int nums[]={432835222,112141211,5408045,456281503,283322436,414281561,37773,286505682};
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // formula is nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])
            // nums[i] - rev(nums[i]) == nums[j] - rev(nums[j])
            // Reversing The Number
            int newNum=0;
            int temp=nums[i];
            while (temp>0) {
                int rem=temp%10;
                newNum=(newNum*10)+rem;
                temp/=10;
            }
            nums[i]-=newNum;
        }
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                count+=map.get(nums[i])%MOD;
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            System.out.println(map);
        }
        System.out.println(map);
        
        System.out.println(count);
    }
}
