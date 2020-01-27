package lab3_quick_sort;

public class QuickSort <T extends Comparable <? super T> > {

    public QuickSort (T[] list, int low, int high) {
        if (list.length <= 4) {
            InsertionSort<T> toInsert = new InsertionSort <>(list);
        }
        quickSort(list, low, high - 1);
    }

    public void quickSort (T[] list, int low, int high) {
        if (low < high) {
            int pivot = partition(list, low, high);

            quickSort(list, low, pivot - 1);
            quickSort(list, pivot + 1, high);
        }
    }

    public int partition (T[] list, int low, int high) {
        T pivot = list[high];
        int i = low;

        for (int k = low; k <= high - 1; k++) {
            if (list[k].compareTo(pivot) < 0) {
                swap (list, i, k);
                i++;
            }
        }
        swap(list, i, high);
        return i;
    }

    private void swap(T[] list, int i, int k) {
        T temp = list[i];
        list[i] = list[k];
        list[k] = temp;
    }

    public T[] toArray (T[] list) {
        int i = 1;

        for (T generic : list) {
            i++;
            System.out.print (generic + " ");
        }
        return list;
    }
}
