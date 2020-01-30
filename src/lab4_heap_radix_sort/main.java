package lab4_heap_radix_sort;

public class main {
    public static void main (String[] args) {
        Integer[] list = {12,13,9,15,4,0,8,7,11,5};
        heapSort<Integer> hs = new heapSort<>(list);

        hs.toArray(list);
    }
}
