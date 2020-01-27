package lab2_insertion_merge;

public class Insertion_Sort <T extends Comparable <? super T> > {
    public Insertion_Sort (T[] list) {
        Insertion (list);
    }

    public void Insertion (T[] list) {
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0; j--) {
                if (list[j-1].compareTo(list[j]) > 0) {
                    swap(list,j-1,j);
                }
                else break;
            }
        }
    }

    public void swap(Comparable[] list, int i, int j) {
        Comparable swap = list[i];
        list[i] = list[j];
        list[j] = swap;
    }

    public T[] toArray (T[] list) {
        for (T t : list) {System.out.print(t + " ");}
        return list;
    }
}
