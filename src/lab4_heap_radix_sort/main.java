package lab4_heap_radix_sort;

import lab2_insertion_merge.Reader;
import java.io.IOException;

public class main {
    public static void main (String[] args) throws IOException {
        Reader reader = new Reader("book");
        String[] vocabulary = reader.get();
        heapSort<String> toSort = new heapSort<>(vocabulary);

        // Printing out the sorted words
        for(String word : vocabulary) {
            System.out.println(word);
        }


    }
}
