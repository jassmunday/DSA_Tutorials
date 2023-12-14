import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class dijkstraShortestPathAndMinSpanTree {
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

    static void createGraph(ArrayList<Edge>[] graph){
//        ArrayList<graph.Edge>[] graph = new ArrayList[graph.length]; not used here
        for (int i = 0; i < graph.length ; i++) {
            graph[i]= new ArrayList<>();
        }
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
    }

    public class Pair implements Comparable<Pair>{
        int node;
        int dist;

        Pair(int n , int d){
            this.node =n;
            this.dist=d;

        }

        @Override
        public int compareTo(Pair p2) {
            return this.dist - p2.dist;
        }
    }
    public void dijkstra(ArrayList<Edge>[] graph, int src, int V){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int [] dist = new int[V];
        for (int i = 0; i < V; i++) {
            dist[i]= Integer.MAX_VALUE;
        }
        boolean [] vstd = new boolean[V];

        pq.add(new Pair(0,0));

        while (pq.isEmpty()){
            Pair crnt = pq.remove();
            if(!vstd[crnt.node]){
                vstd[crnt.node]= true;
                for (int i = 0; i <graph[i].size() ; i++) {
                    Edge e = graph[i].get(i);
                    int u = e.src;
                    int v = e.dst;

                    if(dist[u]+e.wt<dist[v]){
                        dist[v] = dist[u]+e.wt;
                        pq.add(new Pair(v,dist[v]));
                    }
                }

            }
        }

        for (int i = 0; i < V; i++) {
            System.out.print(dist[i]+" ");
        }
    }

    // Minimum Spanning Tree
    public static class PairMST implements Comparable<PairMST>{
        int Node;
        int Cost;
        PairMST(int vrtx,int dis){
            this.Node = vrtx;
            this.Cost= dis;
        }

        @Override
        public int compareTo(PairMST p2) {
            return this.Cost-p2.Cost;
        }
    }

    public void primsMST(ArrayList<Edge> [] graph,int V){
        PriorityQueue<PairMST> pq = new PriorityQueue<>();
        boolean[] vstd = new boolean[V];

        pq.add(new PairMST(0, 0));

        ArrayList<PairMST> costMst = new ArrayList<>(V);// Or int MinCost= 0;
        while (!pq.isEmpty()){
            PairMST curr = pq.remove();
            if(!vstd[curr.Node]){
                vstd[curr.Node]=true;
                costMst.add(curr);//curr.Cost+=MinCost;
                for (int i = 0; i < graph[curr.Node].size(); i++) {
                    Edge e = graph[curr.Node].get(i);
                    if(!vstd[e.dst]){
                        pq.add(new PairMST(e.dst, e.wt));
                    }
                }
            }
        }
        System.out.println(Arrays.toString(new ArrayList[]{costMst}));


    }




    public static void main(String[] args) {

    }
}
