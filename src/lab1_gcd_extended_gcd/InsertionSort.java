package lab1_gcd_extended_gcd;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // getting the size of the list
        System.out.print("Enter the size of the list: ");
        int list = input.nextInt();

        // Creating the list
        int[] A = new int[list];

        // Filling A
        for (int i = 1; i < list; i++){
            System.out.print("Enter the place " + i + " in the list: ");
            A[i] = input.nextInt();
        }

        insertionSort(A);
        // Closing the Scanner class
        input.close();
    }

    public static void insertionSort (int[] a){
        int key, i;
        for (int j = 1; j < a.length; j++) {
            key = a[j];
            i = j - 1;

            while ((i > 0) && (a[i] > key)) {
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = key;
        }
    }
}
