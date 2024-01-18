import java.util.HashSet;

public class KthSmallestElem {
    public static void main(String[] args) {
        System.out.println("Kth Smallest Element in an Array");
        int matrix[][]={{1,5,9},{10,11,13},{12,13,15}};
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                set.add(matrix[i][j]);
            }
        }
        System.out.println(set);
    }
}
