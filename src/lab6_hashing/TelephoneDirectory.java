package lab6_hashing;

public class TelephoneDirectory {
    private HDictionary <Name, String> dictionary;

    public TelephoneDirectory (int size) {
        dictionary = new HDictionary(size);
    }
}