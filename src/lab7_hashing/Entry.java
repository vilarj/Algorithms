package lab7_hashing;

public class Entry <K,E> {
    private K key;
    private E element;

    public Entry(K key, E element) {
        this.key = key;
        this.element = element;
    }

    // Getters and Setters
    public K getKey () {
        return key;
    }

    public E getElement () {
        return element;
    }

    public void setValue (E newElement) {
        element = newElement;
    }
}
