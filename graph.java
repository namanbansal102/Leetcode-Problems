import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graph {
    class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public void createGraph(ArrayList<Edge> graph[],int vertex){
        // Initialize ArrayList
        for (int i = 0; i < vertex; i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));


        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
        
        graph[6].add(new Edge(6, 5));
    }
    public void bfs(ArrayList<Edge> graph[]){ 
            Queue<Integer> q=new LinkedList<>();
            boolean visited[]=new boolean[graph.length];
            // Src is Same For all Sources
            q.add(graph[0].get(0).src);
            while (!q.isEmpty()) {
                    int curr=q.remove();
                    System.out.println("The Currect Element is:"+curr);
                    if (visited[curr]==false) {
                        // Then I Can PerForm My Algorithm
                        System.out.println(curr);
                        visited[curr]=true;
                        // Adding Destination Element To Queueor 
                        for(int i = 0; i < graph[curr].size(); i++) {
                            System.out.println("Adding Graph to src"+graph[curr].get(i).src+"And For Destination is "+graph[curr].get(i).dest);
                            q.add(graph[curr].get(i).dest);
                        }
                        
                    }
                } 
            }
            
            public void dfs(ArrayList<Edge> graph[],int curr,boolean visited[]){
                
                System.out.println(curr);
                visited[curr]=true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    int e=graph[curr].get(i).dest;
                    System.out.println("Adding Graph to src"+graph[curr].get(i).src+"And For Destination is "+graph[curr].get(i).dest);
                    if (visited[e]==false) {
                        dfs(graph,e , visited);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Graph Data Strucutre");
        int vertex=7;
        ArrayList<Edge> graph[]=new ArrayList[vertex];
        graph gh=new graph();
        gh.createGraph(graph, vertex);
        // gh.bfs(graph);
        boolean visited[]=new boolean[vertex];
        gh.dfs(graph,0, visited);
        for (int i = 0; i < graph[1].size(); i++) {
            System.out.print(graph[1].get(i).dest+" ");
        }
    }
}
