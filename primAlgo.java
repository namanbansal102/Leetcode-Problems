import java.util.ArrayList;
import java.util.PriorityQueue;

public class primAlgo
 {
    class Edge{
        int src;
        int dest;
        int weight;
        Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.weight=w;
        }
    }
    public void createGraph(ArrayList<Edge> arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new ArrayList<>();
        }
        arr[0].add(new Edge(0, 1, 10));
        arr[0].add(new Edge(0, 2, 15));
        arr[0].add(new Edge(0, 3, 30));

        arr[1].add(new Edge(1, 0, 10));
        arr[1].add(new Edge(1, 3, 40));
       

        arr[2].add(new Edge(2, 3, 50));
        arr[2].add(new Edge(2, 0, 15));

        arr[3].add(new Edge(3, 1, 40));
        arr[3].add(new Edge(3, 0, 30));
        arr[3].add(new Edge(3, 2, 50));

        
        

    }
    public class Pair implements Comparable<Pair>{
        int e;
        int dist;
        Pair(int e,int d){
            this.e=e;
            this.dist=d;
        }
        @Override
        public int compareTo(Pair p2){
            // Comapring For Ascending Order
            return this.dist-p2.dist;
            // else For Ascending Order
            // return p2.dist-this.dist
        }
    }
   public void primAlgoF(ArrayList<Edge> lst[],int src,int vertex){
    boolean vis[]=new boolean[vertex];
    int dist[]=new int[vertex];
    for (int i = 0; i < vertex; i++) {
        if (i!=src) {
            dist[i]=Integer.MAX_VALUE;
        }
    }
    int mstCost=0;
    PriorityQueue<Pair> pq=new PriorityQueue<>();
    pq.add(new Pair(0, 0));
    while (!pq.isEmpty()) {
        Pair curr=pq.remove();
        if (vis[curr.e]==false) {
            vis[curr.e]=true;
            mstCost+=curr.dist;
            for (int i = 0; i < lst[curr.e].size(); i++) {
                Edge eg=lst[curr.e].get(i);
                if (vis[eg.dest]==false) {
                    pq.add(new Pair(eg.dest, eg.weight));
                }
            }
        }
    }
    System.out.println(mstCost);
   }
    
        
    public static void main(String[] args) {
        System.out.println("Prims Algorithm");
        // It Works on Dynamic Programming  as it more time complexity and takes more Time To Execute when in Case of Positive Weights than Dikjstra is Preferred
        int vertex=4;
        ArrayList<Edge> lst[]=new ArrayList[vertex];
        primAlgo pla=new primAlgo();
        pla.createGraph(lst);
        pla.primAlgoF(lst, 0, vertex);
        // System.out.println(Integer.MAX_VALUE+1);
        // System.out.println(lst[0].get(0).weight);
    }
}
