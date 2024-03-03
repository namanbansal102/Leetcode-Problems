import java.util.Arrays;
import java.util.Comparator;

public class fractionalKnapSap {
    public static void main(String[] args) {
        System.out.println("Fractional KnapSap Problem Java");
        int w=10;
        // int matrix[][]=new int[weight.length][2];
        // for (int i = 0; i < matrix.length; i++) {
            //     matrix[i][0]=i;
            //     matrix[i][1]=boxTypes[i][0]*boxTypes[i][1];
            //     matrix[i][2]=boxTypes[i][1];
            // }
            // System.out.println(Arrays.deepToString(matrix));
            int boxTypes[][]={{5,10},{2,5},{4,7},{3,9}};
            int calc=0;
        Arrays.sort(boxTypes,Comparator.comparingDouble(o->o[1]));
        for (int i = boxTypes.length-1; i>=0; i--) {
            int getW=boxTypes[i][0];
            int getV=boxTypes[i][1]*boxTypes[i][0];
            int ratio=boxTypes[i][1];
            if (w>=getW) {
                w-=getW;
                calc+=getV;
            }
            else{

                calc+=ratio*w;
                w=0;
                 break;
                
            }
        }
        System.out.println(calc);


    }
}
