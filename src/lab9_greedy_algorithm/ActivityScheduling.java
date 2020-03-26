package lab9_greedy_algorithm;

import lab2_insertion_merge.Insertion_Sort;

import java.util.ArrayList;

public class ActivityScheduling {
    public static void main(String[] args) {
        Interval[] input = new Interval[11];

        input[0] = new Interval(0, 5.5);
        input[1] = new Interval(3, 5);
        input[2] = new Interval(1, 4.6);
        input[3] = new Interval(3, 9);
        input[4] = new Interval(2, 14);
        input[5] = new Interval(5, 7.3);
        input[6] = new Interval(5, 9);
        input[7] = new Interval(6, 10);
        input[8] = new Interval(7.2, 11);
        input[9] = new Interval(8, 12);
        input[10] = new Interval(12, 16);

        Interval[] schedule = greedyActivitySelector (input);
        printActivities (schedule);

        // lengths -> 26, 32, 48, 70
        // lists -> {1, 2, 5, 10, 20} and {1, 10, 25, 50}
        int[] list1 = {1, 2, 5, 10, 20};
        int[] list2 = {26, 32, 48, 70};

        changeMaking(26, list1);
        changeMaking(32, list1);
        changeMaking(48, list1);
        changeMaking(70, list1);

        changeMaking(26, list2);
        changeMaking(32, list2);
        changeMaking(48, list2);
        changeMaking(70, list2);
    }

    /**
     * Selecting the max number of
     * activities that can be performed by a person
     *
     * @param s
     * @return
     */
    public static Interval[] greedyActivitySelector (Interval[] s) {
        // Copying input array
        Interval[] copyArray = s;
        // Sorting the copy
        Insertion_Sort toSort = new Insertion_Sort(copyArray);

        // Allocating an array list of intervals
        ArrayList<Interval> list = new ArrayList<>();

        // Greedy activity selector algorithm
        int k = 0;
        list.add(s[0]);
        int n = s.length;

        for(int m = 1; m < n; m++) {
            if(copyArray[m].getS() >= copyArray[k].getF()) {
                list.add(copyArray[m]);
                k = m;
            }
        }

        // Converting and returning the ArrayList into an array
        return list.toArray(copyArray);
    }

    /**
     * greedy approach for change making
     *
     * @param n
     * @param D
     * @return k
     */
    public static int changeMaking (int n, int[] D) {
        int m = D.length - 1, j = m, k = 0;

        while (n > 0) {
            k = k + (n / D[j]);
            n = n % D[j];
            j--;
        }
        return k;
    }

    public static void  printChange (int[] list) {
        for (int x : list) {
            System.out.print(x + " ");
        }
    }

    public static void printActivities (Interval[] a)
    {
        for(Interval element : a)
            if(element != null)
                System.out.println(element);
    }
}
