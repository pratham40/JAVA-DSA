import java.util.*;

class Graph {

    HashMap<Integer, HashMap<Integer, Integer>> graph;

    HashSet<Integer> visited=new HashSet<>();
    public Graph(int nodes) {
        this.graph = new HashMap<>();
        for (int i = 1; i <= nodes; i++) {
            this.graph.put(i, new HashMap<>());
        }
    }

    void addEdge(int u,int v,int w) {
        if (graph.containsKey(u)){
            this.graph.get(u).put(v,w);
            this.graph.get(v).put(u,w);
        }
        else {
            this.graph.put(u,new HashMap<>());
            this.graph.put(v,new HashMap<>());

            this.graph.get(u).put(v,w);
            this.graph.get(v).put(u,w);
        }
    }

    void removeEdge(int u,int v){
        if (graph.containsKey(u) && graph.containsKey(v) && hashEdge(u,v)) {
            this.graph.get(u).remove(v);
            this.graph.get(v).remove(u);
        }
    }

    boolean hashEdge(int u,int v){
        return this.graph.get(u).containsKey(v);
    }

    void removeVertex(int u){
        if (graph.containsKey(u)){
            for (int i:this.graph.get(u).keySet()){
                graph.get(i).remove(u);
            }
            graph.remove(u);
        }
    }

    int totalVertex(){
        return graph.size();
    }

    int  noOfEdges(){
        int size=0;
        for (int k:graph.keySet()){
            size+=graph.get(k).size();
        }
        return size/2;
    }

    public void BFS(int v){
        HashSet<Integer> visited= new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        System.out.println(graph.get(v));
        while (!q.isEmpty()){
            int x = q.poll();
            if (visited.contains(x)){
                continue;
            }
            visited.add(x);
            System.out.println(x);
            HashMap<Integer,Integer> m = graph.get(x);
            for (int val:m.keySet()){
                if (!visited.contains(val)){
                    q.add(val);
                }
            }

        }
        System.out.println(false);
    }

    public void DFS(int v){
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> stk = new Stack<>();
        stk.push(v);
        while (!stk.isEmpty()){
            int x=stk.pop();
            if (visited.contains(x)){
                continue;
            }
            visited.add(x);
            System.out.println(x);
            HashMap<Integer,Integer> m = graph.get(x);
            for (int val:m.keySet()){
                if (!visited.contains(val)){
                    stk.push(val);
                }
            }
        }
    }

    public void BFT(){
        for (int m: graph.keySet()){
            if (!visited.contains(m)){
                BFS(m);
            }
        }
    }

    public void DFT(){
        for (int m: graph.keySet()){
            if (!visited.contains(m)){
                DFS(m);
            }
        }
    }
    public boolean cyclicGraph(int v){
        HashSet<Integer> visited= new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        System.out.println(graph.get(v));
        while (!q.isEmpty()){
            int x = q.poll();
            if (visited.contains(x)){
                return true;
            }
            visited.add(x);
            System.out.println(x);
            HashMap<Integer,Integer> m = graph.get(x);
            for (int val:m.keySet()){
                if (!visited.contains(val)){
                    q.add(val);
                }
            }

        }
        return false;
    }

//    public int Path(int u){
//        Queue<Integer> q = new LinkedList<>();
//        HashSet<Integer> s= new HashSet<>();
//        q.add(u);
//        while (!q.isEmpty()){
//            int x = q.poll();
//            if (visited.contains(x)){
//                continue;
//            }
//        }
//    }


}

public class GraphRepresent{
    public static void main(String[] args) {
        Graph graph=new Graph(4);
//        graph.addEdge(1,2,30);
//        graph.addEdge(1,4,30);
//        graph.addEdge(2,3,30);
//        graph.addEdge(3,4,10);
//        graph.addEdge(4,5,40);
//        graph.addEdge(5,6,12);
//        graph.addEdge(5,7,50);
//        graph.addEdge(6,7,5);

//        graph.addEdge(1,2,10);
//        graph.addEdge(2,3,10);
//        graph.addEdge(3,4,10);
//        graph.addEdge(4,1,10);

//        System.out.println(graph.cyclicGraph(1));


//        graph.removeVertex(5);
//        for(int i:graph.graph.keySet()){
//            System.out.println(i+"->" + " "+graph.graph.get(i));
//        }
//        System.out.println("Vertex "+ graph.totalVertex());
////        graph.BFS(1);
//        graph.DFS(1);
//
////        x
//        graph.addEdge(1,2,10);
//        graph.addEdge(2,3,15);
//        graph.addEdge(1,2,10);
//        graph.addEdge(1,2,10);

        graph.addEdge(1,2,1);
        graph.addEdge(2,3,1);
        graph.addEdge(3,4,1);
        graph.addEdge(4,1,1);
        System.out.println("graph.cyclicGraph(1) = " + graph.cyclicGraph(1));

    }
}
