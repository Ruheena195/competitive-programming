// package codeforces.Samsung;

import java.util.*;

import java.util.*;
  
class Graph {
    private int V;
    private List<List<iPair>> adj;
  
    Graph(int V) {
        this.V = V;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }
  
    void addEdge(int u, int v, int w) {
        adj.get(u).add(new iPair(v, w));
        //adj.get(v).add(new iPair(u, w));
    }

    void addEdgeRev(int u, int v, int w) {
        adj.get(v).add(new iPair(u, w));
        //adj.get(v).add(new iPair(u, w));
    }
  
    int shortestPath(int src) {
        PriorityQueue<iPair> pq = new PriorityQueue<>(V, Comparator.comparingInt(o -> o.first));
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
  
        pq.add(new iPair(0, src));
        dist[src] = 0;
  
        while (!pq.isEmpty()) {
            int u = pq.poll().second;
  
            for (iPair v : adj.get(u)) {
                if (dist[v.first] > dist[u] + v.second) {
                    dist[v.first] = dist[u] + v.second;
                    pq.add(new iPair(dist[v.first], v.first));
                }
            }
        }
  
        //System.out.println("Vertex Distance from Source");
        int res = 0;
        for (int i = 0; i < V; i++) {
            //System.out.println(i + "\t\t" + dist[i]);
            res += dist[i];
        }
        return res;
    }
  
    static class iPair {
        int first, second;
  
        iPair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}

public class week2_Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int V = sc.nextInt();
            int M = sc.nextInt();

            Graph g = new Graph(V);
            Graph g1 = new Graph(V);

            for(int i=0;i<M;i++){
                int u = sc.nextInt();
                int v = sc.nextInt();
                int c = sc.nextInt();
                g.addEdge(u-1,v-1,c);
                g1.addEdgeRev(u-1,v-1,c);
            }
            int source = sc.nextInt();
            System.out.println(g.shortestPath(source-1) + g1.shortestPath(source-1));
            
        }
    }
    
}
