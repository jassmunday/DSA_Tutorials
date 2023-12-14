import java.util.ArrayList;

public class graph {
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
    public static void main(String [] args){
        int V=5;
        ArrayList<Edge> [] graph = new ArrayList[V];
        for (int i = 0; i < V ; i++) {
            graph[i]= new ArrayList<>();
        }
         // for vertex0
        graph[0].add(new Edge(0,1,5));
        // for vrtex 1
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,4,3));
        //for vertex  2
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));
        // for vertex 3
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));
        // for vertex 4
        graph[4].add(new Edge(4,2,2));
        // To find neighbours of vertex of graph
        for (int i = 0; i <graph[2].size() ; i++) {
            Edge etemp = graph[2].get(i);
            System.out.println(etemp.dst);

        }

    }
}

