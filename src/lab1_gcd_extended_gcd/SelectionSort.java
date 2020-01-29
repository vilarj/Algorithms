package lab1_gcd_extended_gcd;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
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

        SelectionSort(A);
        // Closing the Scanner class
        input.close();
    }

    public static void SelectionSort (int a[]){
        int key, index, temp;
        for (int j = 1; j < a.length - 1; j++) {
            // find the smallest key and its position
            key = a[j];
            index = j;

            for (int i = j + 1; i < a.length; i++) { // n-j comparison  
                if(a[i] < key) {
                    key = a[i]; index = i; // found index
                }
                // let's swap
                temp = a[j];
                a[j] = a[index];
                a[index] = temp;
            }
        }
    }
}
