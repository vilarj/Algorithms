package lab10_graphs;

import java.util.LinkedList;

/**
 * Part A of the word document
 */
public class AdjacencyMatrix {
    private int vertices;
    private int[][] matrix;
    private LinkedList<Integer> ll;

    public AdjacencyMatrix (int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
        ll = new LinkedList<>();
    }

    public void addEdge (int root, int destination) {
        ll.add(matrix[root][destination] = 1);
        ll.add(matrix[destination][root] = 1);
    }

    public void Graph () {
        for (int i = 0; i < vertices; i++) {
            for (int k = 0; k < vertices; k++) {
                System.out.print(ll + " ");
            }
            System.out.print("\n");
        }
    }
    public int[][] getWeightMatrix()
    {
        return matrix;
    }
}
