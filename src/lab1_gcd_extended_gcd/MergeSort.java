import java.util.Scanner;

public class MergeSort {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the list: ");
        int[] a = new int[input.nextInt()];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the " + (i+1) + " position: ");
            a[i] = input.nextInt();
        }

        input.close();
    }
}
