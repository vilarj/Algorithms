package lab12_shortest_path;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver
{
    public static void main (String[] args) throws FileNotFoundException
    {
        int lineCount = 0;
        int i = 0;
        int j = 0;

        File file = new File("src/lab12_shortest_path/points.txt");
        Scanner fin = new Scanner(file);
        while(fin.hasNextLine())
        {
            lineCount++;
            fin.nextLine();
        }

        int[][] graph = new int[lineCount][lineCount];
        fin = new Scanner(file);
        while(fin.hasNextLine())
        {
            String[] split = fin.nextLine().split(", ");
            for(String number : split)
            {
              graph[i][j] = Integer.valueOf(number);
              j++;
            }
            j = 0;
            i++;

        }

        fin.close();

        Dijkstra dk = new Dijkstra(graph, 0);
        System.out.println(dk);
    }
}
