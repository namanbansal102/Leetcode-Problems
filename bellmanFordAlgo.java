import java.util.ArrayList;
import java.util.PriorityQueue;

public class bellmanFordAlgo
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
        arr[0].add(new Edge(0, 1, 2));
        arr[0].add(new Edge(0, 2, 4));

        arr[1].add(new Edge(1, 2, -4));
       

        arr[2].add(new Edge(2, 3, 2));

        arr[3].add(new Edge(3, 4, 4));

        arr[4].add(new Edge(4, 1, -1));
        

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
    public void bellmanFordAlgoF(ArrayList<Edge> lst[],int src,int vertex){
        int dist[]=new int[vertex];
        boolean vis[]=new boolean[vertex];
        for (int i = 0; i < vertex; i++) {
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        for (int k = 0; k < vertex; k++) {
            // Firstly Ignore The Outer Loop
            for (int i = 0; i < vertex; i++) {
                for (int j = 0; j < lst[i].size(); j++) {
                    Edge e=lst[i].get(j);
                    int u=e.src;
                    int v=e.dest;
                    if (dist[u]+e.weight<dist[v]) {
                        dist[v]=e.weight+dist[u];
                    }
                }
            }
        }
            for (int i = 0; i < vertex; i++) {
                System.out.print(dist[i]+" ");
            }
            System.out.println();
    }
    
        
    public static void main(String[] args) {
        System.out.println("BellMan Ford Algorithm");
        // It Works on Dynamic Programming  as it more time complexity and takes more Time To Execute when in Case of Positive Weights than Dikjstra is Preferred
        int vertex=5;
        ArrayList<Edge> lst[]=new ArrayList[vertex];
        bellmanFordAlgo blmf=new bellmanFordAlgo
        ();
        blmf.createGraph(lst);
        blmf.bellmanFordAlgoF(lst, 0, vertex);
        System.out.println(Integer.MAX_VALUE+1);
        System.out.println(lst[0].get(0).weight);
    }
}
