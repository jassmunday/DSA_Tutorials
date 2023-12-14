import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graphBFS {
    static class Edge{
        int src;
        int dst;
        int wt ;
        Edge(int src , int dst , int wt){
            this.src=src;
            this.dst=dst;
            this.wt=wt;
        }
    }
    static void createGraph(ArrayList<Edge> [] graph){
//        ArrayList<graph.Edge>[] graph = new ArrayList[graph.length]; not used here
        for (int i = 0; i < graph.length ; i++) {
            graph[i]= new ArrayList<>();
        }
        // for vertex0
        graph[0].add(new graphBFS.Edge(0,1,5));
        // for vrtex 1
        graph[1].add(new graphBFS.Edge(1,0,5));
        graph[1].add(new graphBFS.Edge(1,2,1));
        graph[1].add(new graphBFS.Edge(1,4,3));
        //for vertex  2
        graph[2].add(new graphBFS.Edge(2,1,1));
        graph[2].add(new graphBFS.Edge(2,3,1));
        graph[2].add(new graphBFS.Edge(2,4,2));
        // for vertex 3
        graph[3].add(new graphBFS.Edge(3,1,3));
        graph[3].add(new graphBFS.Edge(3,2,1));
        // for vertex 4
        graph[4].add(new graphBFS.Edge(4,2,2));
    }

    public static void bfs(ArrayList<Edge> [] graph){
        Queue<Integer> q = new LinkedList<>();
        boolean [] vstd = new boolean[graph.length];
        // Starting Point of Graph
        q.add(0);
        while (!q.isEmpty()){
            int crnt = q.remove();
            if(!vstd[crnt]){
                System.out.print(crnt+" ");
                vstd[crnt]= true;
                for (int i = 0; i < graph[crnt].size(); i++) {
                    Edge e = graph[crnt].get(i);
                    q.add(e.dst);
                }
            }
        }
    }
    // IF Path exists between source and Destination or not
    // HAS PATH ?
    static boolean hasPath(ArrayList<Edge> [] graph, int src,int dst, boolean [] vstd){
        if(src==dst){
            return true;
        }
        vstd[src]= true;
        // now find neighbours and call for them until src = dst
        for (int i = 0; i <graph[src].size(); i++) {
            Edge e = graph[src].get(i);

            if((!vstd[e.dst]) && hasPath(graph,e.dst,dst,vstd)){
                return true;
            }

        }
        return false;
    }

    static boolean isCycleDirectedGraph(ArrayList<Edge> [] graph, boolean vstd [], int crnt, boolean recStack[]){
        vstd[crnt]= true;
        recStack[crnt]=true;

        for (int i = 0; i < graph[crnt].size(); i++) {
                Edge e = graph[crnt].get(i);
            if(recStack[e.dst] == true ){ // means cycle exist
                return true;
            } else if (!vstd[e.dst]) {// if neighbour is not visited
                if(isCycleDirectedGraph(graph,vstd,e.dst,recStack)){
                    return true; // there might exist a graph in neighbour
                }
            }

        }
        recStack[crnt]= false;
        return false;
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> [] graph= new ArrayList[V];
        createGraph(graph);

        boolean [] vstd = new boolean[V];
        boolean [] recStack = new boolean[V];
        System.out.println(isCycleDirectedGraph(graph,vstd,0,recStack));




    }


}
