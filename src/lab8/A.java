package lab8;

import java.util.Scanner;

public class A {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = { // Based on the diagram: -1 -> unable to collect, 0 -> empty, 1 -> able to collect
                {0, -1, 0, 1, 0, 0},
                {1, 0, 0, -1, 1, 0},
                {0, 1, 0, -1, 1, 0},
                {0, 0, 0, 1, 0, 1},
                {-1, -1, -1, 0, 1, 0}
        };

        System.out.print ("Longest Path: " + Collector(5, 6, array) );

        // Closing the Scanner class
        input.close();
    }

    public static int Collector (int rows, int columns, int[][] array) {
        int[][] position = new int [rows][columns];
        int i = 1, j = 1, k;

        while ( (i < rows) && (array[i][0] != -1) ) {
            position[i][0] = position[i-1][0] + array[i][0]; // find the location of the coin
            i++;
        }

        for (; i < rows; i++)
            position[i][0] = -6;

        while ( (j < columns) && (array[0][j] != -1) ) {
            position[0][j] = position[0][j-1] + array[0][j];
            j++;
        }

        for (; j < columns; j++)
            position[0][j] = -6;

        // This part finds the best path for collecting the coins
        for (i = 1; i < rows; i++) {
            for (j = 1; j < columns; j++) {
                if (array[i][j] != -1)
                    position[i][j] = findMax(position[i-1][j], position[i][j-1]) + array[i][j];
                else
                    position[i][j] = -6;
            }
        }
        return position[rows-1][j-1];
    }

    public static int findMax (int x, int y) {
        return x > y ? x : y;
    }
}