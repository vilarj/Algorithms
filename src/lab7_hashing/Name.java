package lab7_hashing;

public class Name {
    private String first, last, fullName;

    public Name (String fullName) {
        this.fullName = fullName;
    }

    public Name (String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public int hashCode() {

        return 0;
    }

    public String getFirst () {
        return first;
    }

    public String getLast () {
        return last;
    }

    public String getFullName () {
        return fullName;
    }

    public void setFirst (String first) {
        this.first = first;
    }

    public void setLast (String last) {
        this.last = last;
    }

    public void setFullName (String fullName) {
        this.fullName = fullName;
    }
}
