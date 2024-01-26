import java.util.HashMap;
import java.util.HashSet;

public class interSection {

    public static void main(String[] args) {
        System.out.println("Intersection of Two Array LeetCode Problem");
        int nums1[]={4,9,5,4,9};
        int nums2[]={9,4,9,8,4};
        HashMap<Integer,Integer> numMap1=new HashMap<>();
        HashMap<Integer,Integer> numMap2=new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            numMap1.put(nums1[i], numMap1.getOrDefault(nums1[i], 0) + 1);
        }
        for (int i = 0; i < nums2.length; i++) {
           numMap2.put(nums2[i], numMap2.getOrDefault(nums2[i], 0) + 1);  
        }
        int k=0;
        System.out.println(numMap1);
        System.out.println(numMap2);
    
        int res[]=new int[numMap1.size()];
        for (int i = 0; i < nums2.length; i++) {
            if(numMap1.containsKey(nums2[i]) && numMap1.get(nums2[i])!=0 && numMap1.get(nums2[i])==numMap2.get(nums2[i])){
                System.out.println("If Conditon Satisfies for"+nums2[i]);
                int key=numMap1.get(nums2[i]);
                while (key>=0) {
                    res[k++]=nums2[i];
                    key--;
                }
            }
                else if (numMap1.containsKey(nums2[i])) {
                    res[k++]=nums2[i];
                    numMap1.put(nums2[i], numMap1.get(nums2[i])-1);
                    numMap2.put(nums2[i], numMap2.get(nums2[i])-1);
                }
        }
        for (int j = 0; j < res.length; j++) {
            System.out.println(res[j]);
        }
        
    }
}