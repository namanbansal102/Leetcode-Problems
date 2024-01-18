import java.util.ArrayList;
import java.util.List;

public class winnerofArray {
    public static void main(String[] args) {
        System.out.println("Winner of Array Game LeetCode Problem");
        int arr[]={2,1,3,5,4,6,7};
        int k=2;
        int consecutive=0;
        int ans=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>ans) {
                ans=arr[i];
                consecutive=0;
            }
            consecutive++;
            if (consecutive==k) {
                break;
            }
        }
        System.out.println(ans);
        

        
    }
}
