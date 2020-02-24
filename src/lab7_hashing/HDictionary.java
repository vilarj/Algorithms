package lab7_hashing;

public class HDictionary<K,E> {
    private Entry <K, E> [] dictionary;
    private int size;

    public HDictionary(int size) {
        if(primeNumber(size) == true) {
            // the size of dictionary is n --> TODO: set dictionary the size of n
            dictionary = (Entry<K, E>[]) new Object [size];
            this.size = size;
        }

        else {
            System.out.print("Not a prime number");
        }
    }

    // ** Part A
    private int hash (K key, int i) {
        int m = size;
        int c = key.hashCode();
        return (h1(c) + i * h2(c))%m;
    }

    private int h1 ( int k) {
        int m = size;
        return (k + (m/2) ) % m;
    }

    private int h2 (int k) {
        int m = size;
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
        boolean prime = true;
        int remainder = 0;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {remainder++;}
        }

        if (remainder > 0) {return !prime;}
        return prime;
    }

    private void hashInsert(K key, E element) {

    }

    private void hashSearch (Entry <K, E> element) {

    }
}
