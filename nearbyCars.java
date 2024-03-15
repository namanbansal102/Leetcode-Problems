import java.util.Arrays;
import java.util.PriorityQueue;

public class nearbyCars {
    static class Points implements Comparable<Points>{
        int x[];
        int distSq;
        Points(int x[], int distSq){
            this.x=x;
            this.distSq=distSq;
        }
        public int compareTo(Points obj1){
            return this.distSq-obj1.distSq;
        }
    }
    public static void main(String[] args) {
        System.out.println("Nearby Cars Problem Priority Queue");
        int pts[][]={{1,3},
                    {-2,-2}};
        int k=2;
        PriorityQueue<Points> pq=new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            pq.add(new Points(pts[i], pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1]));
        }
        int res[][]=new int[k][2];
        for (int i = 0; i < k; i++) {
            res[i]=pq.poll().x;
        }
        System.out.println(Arrays.deepToString(res));
    }
}
