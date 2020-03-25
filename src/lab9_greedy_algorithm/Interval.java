package lab9_greedy_algorithm;

public class Interval implements Comparable <Interval> {
    private double s, f;

    public Interval (double s, double f) {
        this.s = s;
        this.f = f;
    }

    // TODO: Implement this method
    @Override
    public int compareTo(Interval o) {
        return 0;
    }

    public double getS () {
        return s;
    }

    public double getF () {
        return f;
    }

    public void setS (double s) {
        this.s = s;
    }

    public void setF (double f) {
        this.f = f;
    }

    @Override
    public String toString () {
        String output = "Activities: " + s + ", " + f;
        return output;
    }
}
