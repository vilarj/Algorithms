package lab12_shortest_path;

public class Driver
{
    public static void main (String[] args)
    {
        int[][] graph = new int[][] {
                                    { 0, 3, 0, 0, 0, 0, 0, 8 },
                                    { 1, 0, 4, 3, 0, 0, 0, 10},
                                    { 0, 8, 0, 3, 0, 5, 0, 0},
                                    { 0, 0, 4, 0, 9, 8, 0, 0},
                                    { 0, 0, 0, 9, 0, 10, 0, 0 },
                                    { 0, 0, 3, 9, 15, 0, 23, 0},
                                    { 0, 0, 0, 0, 0, 4, 0, 1},
                                    { 4, 11, 10, 0, 0, 0, 3, 0}
                                    };

        Dijkstra dk = new Dijkstra(graph, 0);
        System.out.println(dk);
    }
}
