package lab10_graphs;

public class Part_C {
    public static void main(String[] args)
    {
        FloydWarshall fw = new FloydWarshall(new String[]{"(2, 3), (3, 8), (5, -4)", "(4, 1), (5, 7)", "(2, 4)", "(1, 2), (3, -5)", "(4, 6)"});
        System.out.println("Weight Matrix");
        fw.graphAdjacency();
        System.out.println("Floyd Matrix");
        fw.graphFloyd();

    }
}
