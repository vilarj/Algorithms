package lab4_heap_radix_sort;

public class heapSort <T extends Comparable <? super T> > {

    public heapSort (T[] list) {
        var size = list.length;

        for (int root = (size / 2) - 1; root >= 0; root--) {
            heapify(list, size, root);
        }

        for (int i = size - 1; i >= 0; i--) {
            T temp = list[0];
            list[0] = list[i];
            list[i] = temp;

            heapify (list, i, 0);
        }
    }

    private void heapify (T[] list, int size, int root) {
        int max   = root;
        int left  = (2 * root) + 1;
        int right = (2 * root) + 2;

        if ( (left < size) && (list[left].compareTo(list[max]) > 0) ) { max = left; }
        if ( (right < size) && (list[right].compareTo(list[max]) > 0) ) {max = right; }

        if (max != root) {
            swap(list, root, max);
            heapify(list, size, max);
        }
    }

    private void swap (T list[], int root, int max) {
        T temp = list[root];
        list[root] = list[max];
        list[max] = temp;
    }

    public T[] output (T[] list) {
        int i = 1;

        for (T generic : list) {
            i++;
            System.out.print (generic + " ");
        }
        return list;
    }
}
