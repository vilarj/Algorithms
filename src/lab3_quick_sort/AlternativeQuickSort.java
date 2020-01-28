package lab3_quick_sort;

public class AlternativeQuickSort <T extends Comparable<? super T>> {
    public AlternativeQuickSort (T[] list, int low, int high) {
        if (list.length <= 4) {
            InsertionSort<T> toInsert = new InsertionSort <>(list);
            toInsert.toArray(list);
        }
        AlternativeQuickSort(list, low, high);
    }

    // Check lec3c
    public void AlternativeQuickSort (T[] list, int low, int high) {

    }
}
