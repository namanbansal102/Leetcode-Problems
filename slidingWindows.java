import java.util.PriorityQueue;

public class slidingWindows {
    static class Pair implements Comparable<Pair>{
        int e;
        int idx;
        Pair(int e,int idx){
            this.e=e;
            this.idx=idx;
        }
        public int compareTo(Pair obj1){
            return obj1.e-this.e;
        }
    }
    public static void main(String[] args) {
        System.out.println("Sliding Window Maximum Approach By Priority Queue");
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        int n=arr.length;
        int k=3;
        int res[]=new int[n-k+1];
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }
        System.out.println(pq.peek().e);
        for (int i = k; i <n; i++) {

            int currIdx=pq.peek().idx;
            // System.out.println(currIdx);
            while (pq.size()>0 && currIdx>i) {
                pq.remove();
            }
            int max=pq.peek().e;
            System.out.print(max+" ");
            pq.add(new Pair(arr[i], i));

        }
        System.out.println();
        

    }
}
