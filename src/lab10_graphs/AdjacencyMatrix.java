package lab10_graphs;

import java.util.LinkedList;

/**
 * Part A of the word document
 */
public class AdjacencyMatrix {
    private int vertices;
    private int[][] matrix;

    public AdjacencyMatrix (int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    public void addEdgeConnectivity (int root, int destination) {
        matrix[root][destination] = 1;
        matrix[destination][root] = 1;
    }

    public void Graph () {
        for (int i = 0; i < vertices; i++) {
            for (int k = 0; k < vertices; k++) {
                System.out.print("              " + matrix[i][k] + " ");
            }
            System.out.print("\n\n");
        }
    }
}
