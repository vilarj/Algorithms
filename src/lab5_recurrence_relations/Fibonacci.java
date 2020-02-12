package lab5_recurrence_relations;

public class Fibonacci {

    public static int recursive(int n) {
        if (n <= 1) {return n;}
        if (n == 2) {return 2;}
        else{return recursive(n - 1) + recursive(n - 2);}
    }
    public static int iterative(int n)
    {
        int curFib = 1;
        int prevFib = 1;
        for(int i=2; i<n; i++)
        {
            int temp = curFib;
            curFib += prevFib;
            prevFib = temp;
        }
        return curFib;

    }
}