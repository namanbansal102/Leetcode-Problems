import java.util.*;

public class chocolaProb {
    public static void main(String[] args) {
        System.out.println("ChocoLa problem Greedy Approach");
        int n=4;
        int m=6;
        Integer[] costVer={2,1,3,1,4};
        Integer[] costHor={4,1,2};
        // After Sorting
        // costVer[]={4,3,2,1,1}
        // costHor[]={4,2,1}
        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());
        int h=0;
        int v=0;
        int cost=0;
        while (h<n-1 && v<m-1) {
            if (costVer[v]>costHor[h]) {
                // When Vertical Cost Is Greater Then The Chocolate Vertical Cuts
                cost+=costVer[v]*(h+1);
                v++;
            }
            else{
                // When The Chocolate Horizontal Cuts
                cost+=costHor[h]*(v+1);
                h++;
            }
        }
        while (h<n-1) {
            cost+=costHor[h]*(v+1);
            h++;
        }
        while (v<m-1) {
            cost+=costVer[v]*(h+1);
            v++;
        }
        System.out.println(cost);
    }
}
