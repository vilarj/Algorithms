package lab10_graphs;

import java.util.ArrayList;

/**
 * Part C of the word document
 */
public class FloydWarshall
{
    private AdjacencyMatrix adjacencyMatrix;
    private int[][] floydMatrix;

    private AdjacencyMatrix adjacencyToMatrix(String[] list)
    {
        ArrayList<Integer[]> points = new ArrayList();
        for(String element : list)
        {
            String[] vertices = element.split(", (?=\\()");
            for(String vertice : vertices)
            {
                vertice = vertice.replaceAll("\\D+", " ");
                String[] splitVertice = vertice.split(" ");
                Integer x = Integer.valueOf(splitVertice[1]);
                Integer y = Integer.valueOf(splitVertice[2]);

                points.add(new Integer[]{x, y});
            }
        }

        AdjacencyMatrix matrix = new AdjacencyMatrix(points.size());
        for(Integer[] point : points)
        {
            matrix.addEdge(point[0], point[1]);
        }

        return matrix;
    }

    private int[][] floydImplementation(int[][] W)
    {
        int[][] D = W;
        int n = D.length;

        for(int k = 1; k < n; k++)
        {
            for(int i = 1; i < n; i++)
            {
                for(int j = 1; j < n; j++)
                {
                    D[i][j] = Math.min(D[i][j], D[i][k] + D[k][j]);
                }
            }
        }

        return D;
    }
    public FloydWarshall(String[] input)
    {
        this.adjacencyMatrix = adjacencyToMatrix(input);
    }

    public void graphAdjacency()
    {
        this.adjacencyMatrix.Graph();
    }
    public void graphFloyd()
    {
        this.floydMatrix = floydImplementation(this.adjacencyMatrix.getWeightMatrix());
        int length = this.floydMatrix.length;
        for (int i = 0; i < length; i++) {
            for (int k = 0; k < length; k++) {
                System.out.print("              " + this.floydMatrix[i][k] + " ");
            }
            System.out.print("\n\n");
        }
    }
}
