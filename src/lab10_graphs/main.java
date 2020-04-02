package lab10_graphs;

import javax.swing.*;

public class main {
    public static void main (String[] args) {
        int vertices, edges, root, destination;

        vertices = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of vertices"));
        edges = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of edges"));

        AdjacencyMatrix matrix = new AdjacencyMatrix(vertices);

        for (int i = 0; i < edges; i++) {
            root = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the root vertex"));
            destination = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the destination"));

            matrix.addEdge(root, destination);
        }

        // Printing the graph
        matrix.Graph();
    }
}
