package lab7_hashing;

public class HDictionary<K,E> {
    private Entry<Integer, String[]> dictionary;

    public HDictionary(int size) {
        if(primeNumber(size) == true) {
            // the size of dictionary is n --> TODO: set dictionary the size of n
            System.out.print("Prime number");
        }

        else {
            System.out.print("Not a prime number");
        }
    }

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
        int r = 0;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {r++;}
        }

        if (r > 0) {return !prime;}
        return prime;
    }
}
