package lab6_hashing;

public class HDictionary <K,V> {
    private Entry <K,V>[] table;

    public HDictionary(int size)
    {
        table = new Entry[nextPrime(size)];

    }

    // ** Part A
    private int hash (K key, int i) {
        int m = table.length;
        int c = key.hashCode();

        if (m == 1) {
            return (h1(c) + i * h2(c)); // special case: size == 1
        }

        return (h1(c) + i * h2(c)) % m;
    }

    private int h1 ( int k) {
        int m = table.length;
        return (k + (m/2) ) % m;
    }

    private int h2 (int k) {
        int m = table.length;
        if (m == 1) { // special case: size == 1
            return (k % (m));
        }

        return (k % (m - 1));
    }

    // **

    /**
     * The function checks if the
     * number passed in is a prime
     * number of not
     *
     * @param n
     * @return true
     */
    public boolean isPrime(int n) {
        int remainder = 0;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {remainder++;}
        }

        return remainder <= 0;
    }
    int nextPrime(int n)
    {
        int prime = n;
        boolean found = false;

        if (n <= 1)
            return 2;

        while (!found)
        {
            prime++;

            if (isPrime(prime))
                found = true;
        }

        return prime;
    }

    public void Hash_Insert (Entry <K, V> entry)
    {
        int hashCode = Math.abs(entry.getKey().hashCode());
        int index = hash(entry.getKey(), hashCode);
        index = Math.abs(index);
        this.table[index] = entry;

    }
    public Entry Hash_Search (K key)
    {
        Entry result;
        int hashCode = Math.abs(key.hashCode());
        int index = hash(key, hashCode);
        index = Math.abs(index);
        result = this.table[index];

        if(result != null && !key.equals(result.getKey()))
            return new Entry(null, null);

        return result;
      //  System.out.println(result.getKey());
      //  if(result.getKey().equals(key))
           // return result;
       // else
            //return null;


    }
}
