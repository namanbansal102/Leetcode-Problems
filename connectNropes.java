import java.util.PriorityQueue;

public class connectNropes {
    public static void main(String[] args) {
        System.out.println("Connect N Ropes LeetCode Problem");
        int ropes[]={4,3,2,6};
        int cost=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        // Firstly Adding The Elements In Priority Queue By Iteration
        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }
        while (pq.size()!=1) {
            int rope=pq.poll()+pq.poll();
            cost+=rope;
            pq.add(rope);
        }
        System.out.println(cost);
    }
}
