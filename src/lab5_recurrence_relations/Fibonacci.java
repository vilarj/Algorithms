package lab5_recurrence_relations;

public class Fibonacci {

    public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (n == 2) {
            return 2;
        }

        else
            return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
