package lab9_greedy_algorithm;

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
        printActivities(schedule);
    }

    public static Interval[] greedyActivitySelector (Interval[] s) {
        // to be implemented
        // copy the input array to another one
        Interval[] list = s;
        // sort it with any sorting method  which you have created earlier

        // allocate an ArrayList of intervals
        ArrayList<Interval> allocate = new ArrayList<>();
        allocate.add(copy);
        // translate the algorithm into Java code: union operation is just adding to the list
        int n = s.length;
        System.out.printf ("Earliest Activity: %d", list[0]); // earliest activity

        int k = 0;

        for (int m = 1; m < n; m++) {
            if (list[m].s >= list[k].f)
                allocate.add(list[m]);
        }
        // convert ArrayList to array and return it
        return null;

    }

    // TODO: Test this part
    public static void printActivities (Interval[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].s >= a[i].f) {
                System.out.printf ("%d ", a[i].s);

            }
        }
    }
}
