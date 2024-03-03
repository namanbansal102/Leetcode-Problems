import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class activitySelection {
    public static void main(String[] args) {
        System.out.println("Activity Selection Greedy Approach");
        int intervals[][] = {{1,2},{1,2},{1,2}};
        int maxAct=0;
        // Solving by matrix
        int matrix[][]=new int[intervals.length][3];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][0]=i;
            matrix[i][1]=intervals[i][0];
            matrix[i][2]=intervals[i][1];
        }
        Arrays.sort(matrix,Comparator.comparingDouble(o->o[2]));
        ArrayList<Integer> lst=new ArrayList<>();
        // Incrementing maxAct to 1
        maxAct=1;
        lst.add(matrix[0][0]);
        int lastEnd=matrix[0][2];
        for (int i = 0; i < intervals.length; i++) {
            if (matrix[i][1]>=lastEnd) {
                lst.add(matrix[i][0]);
                maxAct++;
                lastEnd=matrix[i][2];
            }
        }
        System.out.println(intervals.length-maxAct);
        
      }
}
