package Graph;

import java.util.ArrayList;
import java.util.List;

class Pair {
    int n;
    int w;

    public Pair(int n, int w) {
        this.n = n;
        this.w = w;
    }

    @Override
    public String toString() {
        return '(' + this.n + " , " + this.w + ')';
    }
}

class Graph {
    int[][] adjMatrix;

    List<List<Integer>> adjList;

    List<List<Pair>> adjListWithWeight;

    public Graph(int nodes) {
        this.adjMatrix = new int[nodes][nodes];
        this.adjList = new ArrayList<>();
        this.adjListWithWeight = new ArrayList<>();
        for (int i = 0; i < nodes; i++) {
            adjList.add(new ArrayList<>());
            adjListWithWeight.add(new ArrayList<>());
        }
    }

    public void addEdgesInListWithWeight(int[][] edges, boolean isDirected) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            if (isDirected) {
                Pair pair = new Pair(v, w);
                adjListWithWeight.get(u).add(pair);
            } else {
                Pair pair1 = new Pair(v, w);
                Pair pair2 = new Pair(u, w);
                adjListWithWeight.get(u).add(pair1);
                adjListWithWeight.get(v).add(pair2);
            }
        }

    }

    public void addEdgesInList(int[][] edges, boolean isDirected) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            if (isDirected) {
                adjList.get(u).add(v);
            } else {
                adjList.get(u).add(v);
                adjList.get(v).add(u);
            }
        }

    }

    public void addEdgesInMatrix(int[][] edges, boolean isDirected) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            if (isDirected) {
                adjMatrix[u][v] = 1;
            } else {
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            }
        }

    }

    public void addEdgesWithWeightInMatrix(int[][] edges, boolean isDirected) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            if (isDirected) {
                adjMatrix[u][v] = w;
            } else {
                adjMatrix[u][v] = w;
                adjMatrix[v][u] = w;
            }
        }

    }

    void degreeUndirectedGraph(int[][] edges,int nodes){
        int[] degree=new int[nodes];

        for (int[] edge:edges) {
            int u = edge[0];
            int v = edge[1];
            degree[u]++;
            degree[v]++;

        }
        for (int i = 0; i < nodes; i++) {
            System.out.println("node -> " + i + " degree -> "+degree[i]);
        }
    }

    void degreeDirectedGraph(int[][] edges,int nodes){
        int[] inDegree=new int[nodes];
        int[] outDegree=new int[nodes];
        for (int[] edge:edges) {
            int from = edge[0];
            int to = edge[1];
            inDegree[to]++;
            outDegree[from]++;

        }
        for(int i=0;i<nodes;i++){
            System.out.print("node -> " + i + " in-degree -> "+inDegree[i] + " - ");
            System.out.print(" out-degree -> "+outDegree[i]);
            System.out.println();
        }
    }

    void display() {
        for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix[i].length; j++) {
                System.out.print(adjMatrix[i][j] + ",");
            }
            System.out.println();
        }
    }

    void display2() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i + " -> ");
            System.out.println(adjList.get(i));
        }
    }

    void display3() {
        for (int i = 0; i < adjListWithWeight.size(); i++) {
            System.out.print(i + " -> ");
            System.out.println(adjListWithWeight.get(i));
        }
    }


}

public class GraphRepresentation {
    public static void main(String[] args) {

        int[][] edges = {{0, 2, 20}, {0, 1, 10}, {1, 3, 39}};

        Graph graph = new Graph(4);

//        graph.addEdges(edges,false);

//        graph.addEdgesInList(edges,true);
//        graph.addEdgesInListWithWeight(edges, false);
//        graph.display3();

        graph.degreeDirectedGraph(edges,4);
    }
}
