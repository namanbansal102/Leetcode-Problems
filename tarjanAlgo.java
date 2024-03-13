import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

public class tarjanAlgo
 {
    class Edge{
        int src;
        int dest;
        int weight;
        Edge(int s,int d){
            this.src=s;
            this.dest=d;
            
        }
    }
    public void createGraph(ArrayList<Edge> arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new ArrayList<>();
        }
        arr[0].add(new Edge(0, 1));
        arr[0].add(new Edge(0, 2));
        arr[0].add(new Edge(0, 3));
        
        arr[1].add(new Edge(1, 0));
        arr[1].add(new Edge(1, 2));
       
        arr[2].add(new Edge(2, 0));
        arr[2].add(new Edge(2, 1));

        arr[3].add(new Edge(3, 0));
        arr[3].add(new Edge(3, 4));
        arr[3].add(new Edge(3, 5));

    }
    public void dfs(ArrayList<Edge> lst[],int curr,boolean vis[],
    int dt[],int low[],int time,int par){
        vis[curr]=true;
        dt[curr]=low[curr]=++time;
        for (int i = 0; i < lst[curr].size(); i++) {
            Edge e=lst[curr].get(i);
            if (e.dest==par) {
                continue;
                // Continue Skipping The Loop
            }
            else if (vis[e.dest]==false) {
                dfs(lst, e.dest, vis,
                dt,low,time,par);
                low[curr]=Math.min(low[curr], low[e.dest]);
                if (dt[curr]<low[e.dest]) {
                    System.out.println("Bridge is:"+curr+"_______"+e.dest);
                }
            }
            else{
                low[curr]=Math.min(low[curr], dt[e.dest]);
            }
        }

    }
   public void tarjanAlgoF(ArrayList<Edge> lst[],int vertex){
    int dt[]=new int[vertex];
    int low[]=new int[vertex];
    int time=0;
    boolean vis[]=new boolean[vertex];
    for (int i = 0; i < vertex; i++) {
        
        if (vis[i]==false) {
            dfs(lst, i, vis,dt,low,time,-1);
        }
    }
   }
        
            
    public static void main(String[] args) {
        System.out.println("Tarjan Algorithm");
        
        int vertex=6;
        ArrayList<Edge> lst[]=new ArrayList[vertex];
        tarjanAlgo pla=new tarjanAlgo();
        pla.createGraph(lst);
        pla.tarjanAlgoF(lst,vertex);
        // System.out.println(Integer.MAX_VALUE+1);
        // System.out.println(lst[0].get(0).weight);
    }
}
