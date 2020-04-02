package lab11_edge_prim_vertex_weighted_graphs;

public class Edge {
    private Vertex v1;
    private Vertex v2;
    private double weight;

    public Edge (Vertex v1, Vertex v2, double weight) {
        this.v1 = v1; this.v2 = v2; this.weight = weight;
    }

    public Vertex getFirst() {
        return v1;
    }

    public Vertex getSecond() {
        return v2;
    }

    public double getWeight () {
        return weight;
    }

    public String toString() {
        // to implement
        return null;
    }
}
