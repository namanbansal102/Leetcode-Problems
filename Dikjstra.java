import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dikjstra {
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

        arr[1].add(new Edge(1, 2, 1));
        arr[1].add(new Edge(1, 3, 7));

        arr[2].add(new Edge(2, 4, 3));

        arr[3].add(new Edge(3, 5, 1));

        arr[4].add(new Edge(4, 3, 2));
        arr[4].add(new Edge(4, 5, 5));

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
    public void dikjstraF(ArrayList<Edge> arr[],int src,int vertex){
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        int dist[]=new int[vertex];
        for (int i = 0; i < vertex; i++) {
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        boolean vis[]=new boolean[vertex];
        pq.add(new Pair(0, 0));
        while (!pq.isEmpty()) {
            Pair curr=pq.remove();
            System.out.println("Value of curr.e="+curr.e+" and dist="+curr.dist);
            if (vis[curr.e]==false) {
                vis[curr.e]=true;
                for (int i = 0; i < arr[curr.e].size(); i++) {
                    Edge ed=arr[curr.e].get(i);
                    int u=ed.src;
                    System.out.println("Value of u="+u);
                    int v=ed.dest;
                    System.out.println("Value of v="+v);
                    System.out.println("Value of dist[u]="+dist[u]+" and weight="+ed.weight+" and dist[v]="+dist[v]);
                    if (dist[u]+ed.weight<dist[v]) {
                        dist[v]=ed.weight+dist[u];
                        pq.add(new Pair(v, dist[v]));
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
        System.out.println("DikJstra Algorithm ");
        int vertex=6;
        ArrayList<Edge> lst[]=new ArrayList[vertex];
        Dikjstra ds=new Dikjstra();
        ds.createGraph(lst);
        ds.dikjstraF(lst, 0, vertex);
        System.out.println(lst[0].get(0).weight);
    }
}
