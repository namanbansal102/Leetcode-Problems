import java.util.Arrays;
import java.util.PriorityQueue;

public class weakestSoldier {
    static class NSoldiers implements Comparable<NSoldiers>{
        int n;
        int i;
        NSoldiers(int n,int i){
            this.n=n;
            this.i=i;
        }
        public int compareTo(NSoldiers obj1){
            if (obj1.n==this.n) {
                return this.i-obj1.i;
            }
            return this.n-obj1.n;
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Weakest Soldier Problem Priority Queue");
        int param=3;
        int army[][]={{1,1,0,0,0},
                      {1,1,1,1,0},
                      {1,0,0,0,0},
                      {1,1,0,0,0},
                      {1,1,1,1,1}}; 
        PriorityQueue<NSoldiers> pq=new PriorityQueue<>();
        for (int i = 0; i < army.length; i++) {
            int k[]=army[i];
            int count=0;
            for (int j = 0; j < k.length; j++) {
                if (k[j]==1) {
                    count+=k[j];
                }
            }
            pq.add(new NSoldiers(count, i));

        }
        int res[]=new int[param];
        for (int i = 0; i < param; i++) {
            res[i]=pq.poll().i;
        }
        System.out.println(Arrays.toString(res));

    }
}
