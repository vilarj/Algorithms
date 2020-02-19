package lab5_recurrence_relations;

public class Fibonacci {

    public static int recursive(int n) {
        if (n <= 1) {return n;}
        if (n == 2) {return 2;}
        else{return recursive(n - 1) + recursive(n - 2);}
    }
    public static int iterative(int n)
    {
//        int curFib = 1;
//        int prevFib = 1;
//        for(int i=2; i<n; i++)
//        {
//            int temp = curFib;
//            curFib += prevFib;
//            prevFib = temp;
//        }
//        return curFib;
        /**
         * Another way of getting the last 5 digits
         */
        int f1 = 0, f2 = 1, f3, c = 0;

        do {
            f3 = f2 + f1;
            f1 = f2;
            f2 = f3 % 100000;
            c++;
        }
        while (c <= n);
        f2 = f2 % 100000;
        return f2;
    }
}