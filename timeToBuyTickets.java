import java.util.LinkedList;
import java.util.Queue;

public class timeToBuyTickets {
    public static void main(String[] args) {
        System.out.println("Time Needed To Buy Tickets LeetCode Problem");
        int tickets[]={2,3,2};
        int k=2;
        Queue<Integer> queue=new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            queue.add(i);
        }
        System.out.println(queue);
        int times=0;
        // int tickets[]={5,1,1,1};
        while (queue.contains(k)) {
                tickets[queue.peek()]--;
                times++;
                int a=queue.remove();
                if(tickets[a]!=0){
                    queue.add(a);
                 }            
       }
       System.out.println(times);
    }
}
