import java.util.*;
public class PrQueue {
    public static void main(String[] args) {
        System.out.println("Priority Queue LeetCode Problem");
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int matrix[][]={{1,2},{1,3}};
        int n=matrix.length;
        int k=2;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Value of num="+matrix[i][j]);
                if (pq.size()<k) {
                    pq.add(matrix[i][j]);
                    System.out.println("The Size of PQ is:"+pq.size());
                }
                else{
                    System.out.println("Running Into Else Condition");
                    if (pq.peek()>matrix[i][j]) {
                        System.out.println("Running Into If Inside Else Condition");
                        pq.poll();
                        pq.add(matrix[i][j]);
                    }
                }
            }
        }
        
       
        for (int i = 0; i < n*n; i++) {
            System.out.print(pq.peek()+" ");
            pq.poll();
        }
        
        
    }
}
