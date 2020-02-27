package lab6_hashing;

public class HDictionary<K,V> {
    private Entry <K,V>[] table;
    private int size;

    public HDictionary(int size) {
        this.size = size;

        if(primeNumber(size)) {

            table = new Entry[size];
        }

        else {
            table = new Entry[size + 1];
        }
    }

    // ** Part A
    private int hash (K key, int i) {
        int m = size;
        int c = key.hashCode();

        if (m == 1) {
            return (h1(c) + i * h2(c)); // special case: size == 1
        }

        return (h1(c) + i * h2(c))%m;
    }

    private int h1 ( int k) {
        int m = size;
        return (k + (m/2) ) % m;
    }

    private int h2 (int k) {
        int m = size;

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
    public boolean primeNumber(int n) {
        int remainder = 0;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {remainder++;}
        }

        return remainder <= 0;
    }

    public void Hash_Insert (Entry <K, V> entry)
    {
        int hashCode = Math.abs(entry.getKey().hashCode());
        int index = Math.abs(hash(entry.getKey(), hashCode));
        this.table[index] = entry;

    }
    public Entry Hash_Search (K key)
    {
        int hashCode = Math.abs(key.hashCode());
        int index = Math.abs(hash(key, hashCode));
        return this.table[index];
    }
}
