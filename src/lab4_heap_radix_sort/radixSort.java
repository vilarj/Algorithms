package lab4_heap_radix_sort;

public class radixSort {

    public String[] radixSort (String[] list, int length) {
        String[] result = list;

        for (int i = length - 1; i >= 0; i--) {
            result = countingSort (result, i);
        }
        return null;
    }

    private static String[] countingSort (String[] list, int position) {
        return null;
    }
}
