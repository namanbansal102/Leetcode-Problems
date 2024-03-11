import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

public class kosarajuAlgo
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
        arr[0].add(new Edge(0, 2));
        arr[0].add(new Edge(0, 3));
        
        arr[1].add(new Edge(1, 0));
       
        arr[2].add(new Edge(2, 1));

        arr[3].add(new Edge(3, 4));

    }
   
        public void topSort(ArrayList<Edge> lst[],int curr,boolean visited[],Stack<Integer> st){
            visited[curr]=true;
            for (int i = 0; i < lst[curr].size(); i++) {
                Edge e=lst[curr].get(i);
                if (visited[e.dest]==false) {
                    topSort(lst, e.dest, visited, st);
                }
            }
            st.push(curr);
        }
        public void dfs(ArrayList<Edge> lst[],int curr,boolean vis[]){
            vis[curr]=true;
            System.out.print(curr+" ");
            for (int i = 0; i < lst[curr].size(); i++) {
                Edge e=lst[curr].get(i);
                if (vis[e.dest]==false) {  
                    dfs(lst, e.dest, vis);
                }
                }
        }
    public void kosarajuAlgoF(ArrayList<Edge> lst[],int src,int vertex){
        Stack<Integer> st=new Stack<>();
        boolean vis[]=new boolean[vertex];
        // Stack All The Input Values in Stack
        for (int i = 0; i < vertex; i++) {
            if (vis[i]==false) {
                
                topSort(lst, i, vis, st);
            }
        }
        // Make the Transpose Of The Graph
        // Firstly Initializing The ArrayList
        ArrayList<Edge> transpose[]=new ArrayList[vertex];
        for (int i = 0; i < vertex; i++) {
            ArrayList<Edge> arlst=new ArrayList<>();
            vis[i]=false;
            transpose[i]=arlst;
        }
        // Secondly Transposing The Graph
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < lst[i].size(); j++) {
                Edge curr=lst[i].get(j);
                transpose[curr.dest].add(new Edge(curr.dest, curr.src));
            }
        }
        // Third Performing DFS

        // Empty My Stack
        while (!st.isEmpty()) {
            int elem=st.pop();
            if (vis[elem]==false) {
                dfs(transpose, elem, vis);
                System.out.println();
            }

        }


    }
        
            
    public static void main(String[] args) {
        System.out.println("KosaRaju Algorithm");
        // It Works on Dynamic Programming  as it more time complexity and takes more Time To Execute when in Case of Positive Weights than Dikjstra is Preferred
        int vertex=5;
        ArrayList<Edge> lst[]=new ArrayList[vertex];
        kosarajuAlgo pla=new kosarajuAlgo();
        pla.createGraph(lst);
        pla.kosarajuAlgoF(lst, 0, vertex);
        // System.out.println(Integer.MAX_VALUE+1);
        // System.out.println(lst[0].get(0).weight);
    }
}
