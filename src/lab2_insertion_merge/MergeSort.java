package lab2_insertion_merge;

public class MergeSort <T extends Comparable <? super T>>
{
    public MergeSort(T[] arr)
    {
        mergeSort(arr, 0, arr.length - 1);
    }

    static void merge (Comparable[] arr,int p, int q, int r) {
        int j = q;
        int i = p;
        int t = 0;

        Comparable temp[] = new Comparable[r - p];

        while (i < q && j < r) {
            /* do the comparison */
            if (arr[i].compareTo(arr[j]) <= 0) {
                temp[t] = arr[i];
                i++;
                t++;
            }
            else {
                temp[t] = arr[j];
                j++;
                t++;
            }
            while (i < q) {
                temp[t] = arr[i];
                i++;
                t++;
            }
            while (j < r) {
                temp[t] = arr[j];
                j++;
                t++;
            }
            /* Copy temporary array back to original array */
            arr = new Comparable[r - p];
            System.arraycopy(temp,0, arr,0, temp.length - 1);
        }
    }

    private void mergeSort(T[] arr, int left, int right) {
        if(right - left <= 4) {
            Insertion_Sort sort = new Insertion_Sort(arr);
        }
        else {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr , mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
}
