package lab7_hashing;

public class HDictionary<K,E> {
    private Entry <K,E>[] dictionary;
    private int size;

    public HDictionary(int size) {
        this.size = size;

        if(primeNumber(size)) {
            dictionary = (Entry<K, E>[]) new Object [size];
        }

        else {
            System.out.print ("Not a prime number");
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
        int remainder = 0;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {remainder++;}
        }

        return remainder <= 0;
    }

    public void hashInsert (Entry <K,E>[] element) {

    }

    public void hashSearch (Entry <K, E>[] element) {
        for (int i = 0; i < size; i++) {
            if (dictionary[i].getKey() == element[i].getKey()) {
                System.out.print ("\nThe element is: " + element[i]);
            }

            else {
                System.out.print ("\nThe element " + element[i] + " does not exist");
            }
        }
    }
}
