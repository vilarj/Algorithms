package lab6_hashing;

public class Entry <K,V> {
    private K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getters
    public K getKey ()
    {
        return this.key;
    }
    public V getValue()
    {
        return this.value;
    }

    @Override
    public String toString () {
        String output = getKey() + " " + getValue() + "\n"; // or getFirst() + " " + getLast() + "\n"
        return output;
    }
}
