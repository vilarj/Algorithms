package lab4_heap_radix_sort;

public class radixSort <T extends String> {

    public radixSort (T[] arr)
    {
        radixSort(arr, arr.length);
    }

    private int getMax(String[] arr)
    {
        int max = arr[0].length();
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i].length() > max)
                max = arr[i].length();
        }

        return max;
    }
    public void countSort(String[] arr, int digit)
    {
        int size = arr.length;
        int totalChars = 256;
        String[] output = new String[size];

        for(int i = digit - 1; i >= 0; i--)
        {
            int[] count = new int[totalChars + 1];
            for(int j = 0; j < size; j++)
                count[arr[j].charAt(i) + 1]++;
            for(int r = 0; r < totalChars; r++)
                count[r + 1] += count[r];
            for (int k = 0; k < size; k++)
                output[count[arr[k].charAt(i)]++] = arr[k];
            for (int p = 0; p < size; p++)
                arr[p] = output[p];
        }
    }

    public void radixSort(T[] arr, int k)
    {
        int max = getMax(arr);
        for(int digit = max; digit > 0; digit--)
        {
            countSort((String[]) arr, digit);
        }
    }

    public T[] output (T[] list) {
        for (T generic : list) {
            System.out.print (generic + " ");
        }
        return list;
    }
}
