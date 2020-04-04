package lab11_edge_prim_vertex_weighted_graphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WeightedGraph {
    private Vertex [] vertices;
    private ArrayList <Edge> edges;

    public static final double INF = 1e13;

    public WeightedGraph (Vertex [] vertices, ArrayList<Edge> edges) {
        this.vertices = vertices;
        this.edges = edges;
    }

    protected Vertex[] getVertices () {
        return vertices;
    }

    public void print () {
        for (Edge e: edges)
            System.out.println (e);
    }

    public static void fillGraphFromFile (String fileName, boolean directed) {
        File f = new File (fileName);
        try {
            Scanner read = new Scanner (f);
            String curLine;
            ArrayList<String> lines = new ArrayList<>();
            while (read.hasNext()) {
                lines.add(read.nextLine());
            }
            int n = lines.size();
            read.close();
            if (n == 0)
                return null;
            Vertex [] vertices = new Vertex [n];
            ArrayList <Edge> edges = new ArrayList <>();
            Edge curEdge;
            Vertex u, v;
            double weight;
            // allocate array of raw vertices
            for (int i = 0; i < n; i ++) {
                vertices[i] = new Vertex (i+1);
                vertices[i].setKey(INF);
            }
            int nextIdx;
            for (int i = 0; i < n; i ++) {
                curLine = lines.get(i);
                // remove unneeded symbols
                read = new Scanner(curLine);
                u = vertices[i];
                while (read.hasNext()) {
                    // read id and weight;
                    if (directed || id  > i) { // for directed graph, create both (u, v) and (v, u);
                        // for undirected graph, only one edge
                        curEdge = new Edge (u,v, weight);
                        edges.add(curEdge);
                        u.attach(v, weight);
                        if (!directed)
                            v.attach(u, weight);
                    }
                }

            }
            this.vertices = vertices;
            this.edges = edges;
        }
        catch (FileNotFoundException ex) {
            System.out.println (" The file " + fileName + " not found");
        }
    }

    private void initializePrim (int id ) {
        for (Vertex v: vertices) {
            if (v.getId() == id)
                v.setKey(0);
            else
                v.setKey(INF);
            v.setPredecessor(null);
        }
    }
}
