import java.sql.Array;
import java.util.Arrays;

public class widestVerticalArea {
    public static void main(String[] args) {
        System.out.println("Widest Vertical Area Between Two Points");
        int points[][]={{8,7},{9,9},{7,4},{9,7}};
        int width[]=new int[points.length];
        for (int i = 0; i < width.length; i++) {
            width[i]=points[i][0];
        }
        Arrays.sort(width);
        int max=-1;
        for (int i = 0; i < width.length-1; i++) {
            if (width[i+1]-width[i]>max) {
                max=width[i+1]-width[i];
            }
        }
        System.out.println(max);
    }
}
