package lab11_edge_prim_vertex_weighted_graphs;

import java.util.PriorityQueue;

public class Prim {
    public static Edge [] prim (WeightedGraph g, int rootId) {
        g.initializePrim (rootId);
        Vertex r = vertices[rootId-1];

        PriorityQueue <Vertex> Q = new PriorityQueue<>();
        for (Vertex v : vertices)
            Q.add(v);
        while (!Q.isEmpty()) {
            u = Q.poll();
            u.setUsed();
            // translate pseudocode to your Java code
        }

        // |E| = |V| - 1 for any tree
        Edge [] treeEdges = new Edge [vertices.length-1];
        int ii = 0;
        for (Vertex tu: vertices) {
            if (tu != r) {
                treeEdges[ii++] = new Edge (tu, tu.getPredecessor(), tu.getKey());

            }
        }
        return treeEdges;
    }

    public static void main(String[] args) {
        WeightedGraph g = Conversion.fillGraphFromFile ("weightsForMST.txt", false);
        g.printGraph();

        System.out.println ("\n===================================\n");

        Edge [] mst = prim (g, 3); // should work for any id from 1 to number of vertices

        for (Edge e: mst)
            System.out.println (e);
    }
}
