package lab9_greedy_algorithm;

public class Interval implements Comparable <Interval> {
    double s, f;

    public Interval (double s, double f) {
        this.s = s;
        this.f = f;
    }

    @Override
    public int compareTo(Interval o) {
        return 0;
    }

    @Override
    public String toString () {
        String output = "Activities: " + s + " " + f;
        return output;
    }
}
