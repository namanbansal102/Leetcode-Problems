import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * minAbsoluteDifferecnePair
 */
public class minAbsoluteDifferecnePair {

    public static void main(String[] args) {
        System.out.println("Minimum Absoulte Differecne Pair LeetCode Problem");
        int nums1[]={1,7,5};
        int nums2[]={2,3,5};
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int sum=0;
        for (int i = 0; i < nums2.length; i++) {
            sum+=Math.abs(nums1[i]-nums2[i]);
        }
        System.out.println(sum);
    }
}