package lab3_quick_sort;

import lab2_insertion_merge.Reader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Driver {
    public static void main (String[] args) throws IOException {
        //String[] list = {"Las Vegas", "Boston", "Orlando", "San Francisco", "Montpelier", "Dallas", "Austin", "Columbus", "Hartford", "Miami"};

        //QuickSort<String> set = new QuickSort <>(list, 0, list.length);
        //set.toArray (list);
//        FileWriter file_writer = new FileWriter("sorted_book");
//        Reader reader = new Reader("book");
//        String[] vocabulary = reader.get();
//
//        QuickSort<String> toSort = new QuickSort<>(vocabulary, 0, vocabulary.length);
//
//        for(String word : vocabulary) {
//            System.out.println(word); // printing out to console the original file in words
//            file_writer.write(word); // writing to the file "sorted_book"
//        }

        /**
         * ## Bonus #1 ##
         * Run quicksort on arrays of random integers (range 1 to 50) of increasing sizes:
         * 10^3,10^4,10^5,and 10^6.
         * Record running times and describe your observations.
         */
//        System.out.print ("\n**E**X**T**R**A****C**R**E**D**I**T**1**\n");
//        Scanner input = new Scanner (System.in);
//
//        Integer[] newList = new Integer [50];
//
//        System.out.print ("Original list: ");
//        // Filling the array of random integers fro 0-50
//        for (int i = 0; i < newList.length; i++) {
//            Random random = new Random ();
//            int r = random.nextInt (50);
//
//            newList[i] = r;
//            System.out.print (r + " ");
//        }
//
//        System.out.print("\nSorted List: ");
//        QuickSort<Integer> set = new QuickSort <>(newList, 0, newList.length);
//        set.toArray (newList);
//
//        // Closing the Scanner class
//        input.close();

        /**
         * ## Bonus #2 ##
         * Implement the alternative version of QuickSort as described in the slide 14 of Lec3a:
         * stop quicksort when subarray is not larger than 4 elements,
         * and then apply insertion sort to the whole array.
         */

    }
}
