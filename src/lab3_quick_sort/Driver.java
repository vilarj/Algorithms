package lab3_quick_sort;

public class Driver {
    public static void main (String[] args) {
       String[] list = {"Las Vegas", "Boston", "Orlando", "San Francisco", "Montpelier", "Dallas", "Austin", "Columbus", "Hartford", "Miami"};

        QuickSort<String> set = new QuickSort (list, 0, list.length);
        //InsertionSort<String> lis2 = new InsertionSort<>(list);
        //lis2.toArray(list);
        set.toArray(list);
    }
}
