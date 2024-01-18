import java.util.HashSet;

public class DuplicateNumber {
    public static void main(String[] args) {
        System.out.println("Duplicate Number  Problem");
        int arr[]={1,3,4,2};
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                System.out.println(arr[i]);
                break;
            }
            set.add(arr[i]);
        }
    }
}
