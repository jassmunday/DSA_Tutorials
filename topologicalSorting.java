import java.util.ArrayList;
import java.util.Stack;

public class topologicalSorting {
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
    static void topSortHelp(ArrayList<Edge> [] graph , int src, boolean[] vstd, Stack<Integer> stack){
        vstd[src]= true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);

            if(!vstd[e.dst]){
                topSortHelp(graph,e.dst,vstd,stack);
            }
        }
        stack.push(src);
    }

    static void topologicalSort(ArrayList<Edge> [] graph,int V){
        Stack<Integer> stack = new Stack<>();
        boolean [] vstd = new boolean[V];
        for (int i = 0; i < V; i++) {
            if(!vstd[i]){
                topSortHelp(graph,i,vstd,stack);
            }
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop()+" ");
        }
    }
    public static void main(String[] args) {

    }
}
