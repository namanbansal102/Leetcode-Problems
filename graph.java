import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 4));

        
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));


        graph[3].add(new Edge(3, 2));


        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));
        


        // graph[0].add(new Edge(0, 1));

        // graph[2].add(new Edge(2,1 ));
        // graph[2].add(new Edge(2,3 ));

        // graph[3].add(new Edge(3, 4));

        // graph[4].add(new Edge(4, 2));


        // graph[2].add(new Edge(2, 3));

        // graph[3].add(new Edge(3, 1));

        // graph[4].add(new Edge(4, 0));
        // graph[4].add(new Edge(4, 1));

        // graph[5].add(new Edge(5, 0));
        // graph[5].add(new Edge(5, 2));
        
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
            public void srcToTarget(ArrayList<Edge> graph[],int curr,int dest,String path,boolean visited[]){
                if (curr==dest) {
                    System.err.println(""+path);
                    return;
                }
                for (int i = 0; i < graph[curr].size(); i++) {
                    int e=graph[curr].get(i).dest;
                    if(visited[e]==false){

                        visited[curr]=true;
                        System.out.println("Adding Graph to src"+graph[curr].get(i).src+"And For Destination is "+graph[curr].get(i).dest);
                        srcToTarget(graph, e, dest, path+e, visited);
                        visited[curr]=false; 
                        
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
    public void topSortUtil(ArrayList<Edge> graph[],int curr,boolean visited[],Stack<Integer> st){
        System.out.println("Original Top Sort Util Function Runninng");
        System.out.println("Value of Curr is:"+curr);
        visited[curr]=true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e=graph[curr].get(i);
            System.out.println("Value of e.dest is"+e.dest);
            if (visited[e.dest]==false) {
                System.out.println("Value of Visitired is false");
                topSortUtil(graph, e.dest, visited,st);
            }
            
        }
        st.push(curr);
    }
    public void topSort(ArrayList<Edge> graph[],int curr){
        System.out.println("Top Sort Function Runninng");
        boolean visited[]= new boolean[graph.length];
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < graph.length; i++) {
            if (visited[i]==false) {
                topSortUtil(graph, i, visited, st);
            }
        }
            while (!st.isEmpty()) {
                System.out.print(st.pop()+" ");
            }
    }
    // Cycle Detection in Directed Graph
    public boolean cycleDetectionDirected(ArrayList<Edge> graph[],int curr,boolean visited[],boolean stack[]){
        System.out.println("Cycle Detection Function Running:"+curr);
        // The Cycle Condition is if recursion stack is true than cycle exists
        visited[curr]=true;
        stack[curr]=true;
        System.out.println("Thje Graph[curr] is"+graph[curr]);
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e=graph[curr].get(i);
            System.out.println("Value of e.dest is:"+e.dest);
            if (stack[e.dest]==true) {
                System.out.println("Stackin curr is false");
                return true;
            }
            else if ( visited[e.dest]==false && cycleDetectionDirected(graph, e.dest, visited, stack)) {
                return true;
            }
        }
        stack[curr]=false;
        return false;
        
    }
    // learning about Cycle Undirected Graph
    public  boolean cycleUndirectedDetect(ArrayList<Edge> graph[],int curr,int parent,boolean visited[]){
        System.out.println("Cycle For Undirected Graph is Running");
        visited[curr]=true;
        System.out.println(curr);
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e=graph[curr].get(i);
            System.out.println(e.dest);
            if (visited[e.dest]==true && e.dest!=parent) {
                // Cycle Detected in Directed Graph
                return true;
            }
            else if ( visited[e.dest]==false) {
                if (cycleUndirectedDetect(graph, e.dest, curr, visited)) {
                    
                    return true;
                }
            }
            
        }
        return false;
    }
    // learning dijkstra Algorithm Shortest Distance From all of The Vertices
    

    public static void main(String[] args) {
        System.out.println("Graph Data Strucutre");
        int vertex=6;
        ArrayList<Edge> graph[]=new ArrayList[vertex];
        graph gh=new graph();
        gh.createGraph(graph, vertex);
        // gh.bfs(graph);
        boolean visited[]=new boolean[vertex];
        // gh.srcToTarget(graph,0,5,"", visited);
        boolean stack[]=new boolean[vertex];
        for (int i = 0; i < vertex; i++) {
            if (visited[i]==false) {
                boolean isCycle=gh.cycleUndirectedDetect(graph, i, -1,visited);    
                if (isCycle) {
                    System.out.println("Hoorahy Cycle Present "+isCycle);
                    break;
                }
            }

        }
        // gh.topSort(graph, 0);
    }
}
