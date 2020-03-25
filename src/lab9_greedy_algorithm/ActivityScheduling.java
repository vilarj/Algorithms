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
        // you may add more possible activities

        Interval[] schedule = greedyActivitySelector (input);
        printActivities (schedule);
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

        for (int i = 0; i < s.length; i++) {
            list.add(copyArray[i]);
        }

        // Converting the ArrayList into an array
        Interval[] result = new Interval[s.length];
        result = list.toArray(copyArray);

        // Returning the converted array
        return result;
    }

    public static void printActivities (Interval[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].getS() >= a[i].getF()) {
                System.out.printf ("%d ", a[i].getS());
            }
        }
    }
}
