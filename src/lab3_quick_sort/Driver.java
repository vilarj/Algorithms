package lab3_quick_sort;

import lab2_insertion_merge.Reader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Driver {

    public static void main (String[] args) throws IOException {
        Reader reader = new Reader("book");
        String[] vocabulary = reader.get();

        long beginning = System.currentTimeMillis();
        QuickSort<String> toSort = new QuickSort<>(vocabulary, 0, vocabulary.length);

        toSort.toArray(vocabulary);

        long end = System.currentTimeMillis() - beginning;
        System.out.print("\nTime: " + end + "ms \n");

        /**
         * ## Bonus #1 ##
         * Run quicksort on arrays of random integers (range 1 to 50) of increasing sizes:
         * 10^3,10^4,10^5,and 10^6.
         * Record running times and describe your observations.
         */
        System.out.print ("\n**E**X**T**R**A****C**R**E**D**I**T**#1**\n");

        long start3;
        Integer[] sizeOneArray = new Integer[1000];
        Integer[] sizeTwoArray = new Integer[10000];
        Integer[] sizeThreeArray = new Integer[100000];
        Integer[] sizeFourArray = new Integer[1000000];

        initialize(sizeOneArray);
        initialize(sizeTwoArray);
        initialize(sizeThreeArray);
        initialize(sizeFourArray);

        start3 = System.currentTimeMillis();
        QuickSort<Integer> sorted = new QuickSort <>(sizeOneArray, 0, sizeOneArray.length);
        end =  System.currentTimeMillis();

        System.out.printf("10^3 Time: %dms %n", end - start3);

        start3 = System.currentTimeMillis();
        sorted = new QuickSort <>(sizeTwoArray, 0, sizeTwoArray.length);
        end =  System.currentTimeMillis();
        System.out.printf("10^4 Time: %dms %n", end - start3);

        start3 = System.currentTimeMillis();
        sorted = new QuickSort <>(sizeThreeArray, 0, sizeThreeArray.length);
        end =  System.currentTimeMillis();
        System.out.printf("10^5 Time: %dms %n", end - start3);

        start3 = System.currentTimeMillis();
        sorted = new QuickSort <>(sizeFourArray, 0, sizeFourArray.length);
        end =  System.currentTimeMillis();
        System.out.printf("10^6 Time: %dms %n", end - start3);
    }

    private static void initialize(Integer[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            Random rand = new Random();
            array[i] = rand.nextInt(50);
        }
    }
}
