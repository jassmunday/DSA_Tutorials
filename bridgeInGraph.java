import java.util.ArrayList;

public class bridgeInGraph {

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

    public static void dfs(ArrayList<Edge>[] graph,int curr,boolean[] vstd,int[] dt, int []ldt,int time,int prnt){
        vstd[curr]= true;

        dt[curr]= ldt[curr]=++time;
        for (int i = 0; i < graph[i].size(); i++) {
            Edge e = graph[curr].get(i);

            if(e.dst ==prnt){
                continue;
            } else if (!vstd[e.dst]) {
                dfs(graph,e.dst,vstd,dt,ldt,time,curr);
                ldt[curr]=Math.min(ldt[curr],ldt[e.dst] );
                if(dt[curr]<ldt[e.dst]){
                    System.out.println("bridge is : "+curr+"---->"+e.dst);//e.curr will be articulation point
                    // that divides the graph into two disconnected parts
                }else {
                    ldt[curr]=Math.min(ldt[curr],dt[e.dst]);
                }
            }
        }
    }
    public static void findBridge(ArrayList<Edge> [] graph,int V){
        int [] dt = new int[V];
        int [] ldt = new int[V];

        int time=0;
        boolean [] vstd = new boolean[V];

        for (int i = 0; i < V; i++) {
            if(!vstd[i]){
                dfs(graph,i,vstd,dt,ldt,time,-1);
            }
        }
    }


    public static void main(String[] args) {

    }
}
