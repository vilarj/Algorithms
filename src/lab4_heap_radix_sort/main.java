package lab4_heap_radix_sort;

import lab2_insertion_merge.Reader;
import java.io.IOException;

public class main {
    public static void main (String[] args) throws IOException {
        Reader reader = new Reader("book");
        String[] vocabulary = reader.get();
        heapSort<String> toSort = new heapSort<>(vocabulary);

        toSort.toArray(vocabulary);

        System.out.println("\n\nRadix Sort:");


        String[] arr = {"COW", "DOG", "SEA", "RUG", "ROW", "MOB", "BOX",
                "TAB", "BAR", "EAR", "TAR", "DIG", "BIG", "TEA",
                "NOW", "FOX", "TAN", "AIR", "WAX", "CAT"};

        radixSort sort = new radixSort(arr);
        sort.toArray(arr);
    }
}
