import java.util.ArrayList;

public class isCycleGraph {
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

//        static void createGraph(ArrayList<Edge> [] graph){
////        ArrayList<graph.Edge>[] graph = new ArrayList[graph.length]; not used here
//            for (int i = 0; i < graph.length ; i++) {
//                graph[i]= new ArrayList<>();
//            }
//            // for vertex0
//            graph[0].add(new graphBFS.Edge(0,1,5));
//            // for vrtex 1
//            graph[1].add(new graphBFS.Edge(1,0,5));
//            graph[1].add(new graphBFS.Edge(1,2,1));
//            graph[1].add(new graphBFS.Edge(1,4,3));
//            //for vertex  2
//            graph[2].add(new graphBFS.Edge(2,1,1));
//            graph[2].add(new graphBFS.Edge(2,3,1));
//            graph[2].add(new graphBFS.Edge(2,4,2));
//            // for vertex 3
//            graph[3].add(new graphBFS.Edge(3,1,3));
//            graph[3].add(new graphBFS.Edge(3,2,1));
//            // for vertex 4
//            graph[4].add(new graphBFS.Edge(4,2,2));
//        }
     static boolean isCycleDirectedGraph(ArrayList<Edge> [] graph,boolean vstd [],int crnt,boolean recStack[]){
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
    static boolean isCycleUnDirectedGraph(ArrayList<Edge> [] graph,boolean vstd [],int crnt,int prnt){
        vstd[crnt]= true;

        for (int i = 0; i < graph[crnt].size(); i++) {
            Edge e = graph[crnt].get(i);
            //case 1
            if(vstd[e.dst] && prnt != e.dst){
                return true;
            }
            //case 2  do nothing

            //case 3 neigbhour not visited yet
            else if(!vstd[e.dst]){
                if(isCycleUnDirectedGraph(graph,vstd,e.dst,crnt)){
                    return true;
                }
            }
        }
        return false;
        }




    public static void main(String[] args) {

    }
}
