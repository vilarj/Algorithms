package lab12_shortest_path;

import java.lang.reflect.Array;
import java.util.*;

public class Dijkstra
{
    private int vertices;
    private int[][] graph;
    private int source;
    private int[] distances;

    Dijkstra(int[][] graph, int source)
    {
        this.graph = graph;
        vertices = graph.length;
        this.source = source;
        this.distances = dijkstra(graph, source);

    }
    public int [] get()
    {

        return this.distances;
    }

    public String toString()
    {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < vertices; i++)
        {
            if(this.distances != null)
                result.append(i + " \t\t " + this.distances[i]);
        }

        return result.toString();

    }

    int shortestDistance(int[] dist, Boolean[] isVertexShortest)
    {

        int min = Integer.MAX_VALUE;
        int index = -1;

        for (int v = 0; v < vertices; v++)
        {
            if (isVertexShortest[v] == false && dist[v] <= min) {
                min = dist[v];
                index = v;
            }
        }

        return index;
    }

    private int[] dijkstra(int[][] graph, int src)
    {
        int[] dist = new int[vertices];
        Boolean isVertexShortest[] = new Boolean[vertices];

        for (int i = 0; i < vertices; i++)
        {
            dist[i] = Integer.MAX_VALUE;
            isVertexShortest[i] = false;
        }

        dist[src] = 0;

        for (int count = 0; count < vertices - 1; count++)
        {
            int i = shortestDistance(dist, isVertexShortest);
            isVertexShortest[i ] = true;
            for (int j = 0; j < vertices; j++)
            {
                if (!isVertexShortest[j] && graph[i ][j] != 0 && dist[i ] + graph[i][j] < dist[j])
                {
                    dist[j] = dist[i ] + graph[i][j];
                }
            }
        }

        return dist;

    }
}
