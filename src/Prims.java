import java.util.*;

public class Prims {
    HashMap<Integer, HashMap<Integer, Integer>> graph;

    HashSet<Integer> visited=new HashSet<>();
    static class Graph{

    }
    static class Pair{
        int u;
        int v;
        int cost;
        Pair(int u, int v, int cost){
            this.u=u;
            this.v=v;
            this.cost=cost;
        }
    }

    void Prims(int v){
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return p1.cost- p2.cost;
            }
        });
        Pair pair=new Pair(v,v,0);
        List<Integer> ls = new ArrayList<>();
        while (!pq.isEmpty()){
            Pair temp=pq.poll();
            if (ls.contains(temp.u)){
                continue;
            }
//            for (int i = 0; i < ; i++) {
//
//            }
        }
    }


}
