package lab12_shortest_path;

import java.lang.reflect.Array;
import java.util.*;

public class B {
    private int n, edgeCount;
    private Double[] distance;
    private Integer[] previous;
    private List <List<Edge>> graph;

    public B (int n) {
        this.n = n;
        makeGraph(n);
    }

    // _INIT_ an empty graph with n nodes
    public void makeGraph (int n) {
        graph = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
    }

    // Adds a directed edge to graph
    public void addEdge (int fromWhere, int whereTo, int cost) {
        edgeCount++;
        graph.get(fromWhere).add(new Edge(whereTo, cost));
    }

    // To view the graph
    public List<List<Edge>> getGraph () {
        return graph;
    }

    public List<Integer> reconstructPath (int root, int end) {
        List<Integer> path = new ArrayList<>();

        if ( (end < 0) || (end >= n) ) {
            throw new IllegalArgumentException("Invalid node index");
        }

        if ( (root < 0) || (root >= n) ) {
            throw new IllegalArgumentException("Invalid node index");
        }

        double d = dijkstra(root, end);

        if (d == Double.POSITIVE_INFINITY) {
            return path;
        }

        for (Integer at = end; at != null; at = previous[at]) {
            path.add(at);
        }

        Collections.reverse(path);
        return path;
    }

    private double dijkstra(int root, int end) {
        return 0;
    }
}
