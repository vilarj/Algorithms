package lab1_gcd_extended_gcd;

import java.util.Scanner;

public class gcd {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n;

        System.out.print("Enter m: ");
        m = input.nextInt();

        System.out.print("Enter n: ");
        n = input.nextInt();

        if(m < 0 || n < 0) {
            gcd(Math.abs(m), Math.abs(n));
        }
        System.out.print("(" + m + ", " + n + ")" + " = " + gcd(m,n));
        input.close();
    }

    public static int gcd(int m, int n) {
        int r;
//        if (n == 0)
//            return m;
//        return gcd(n, m % n);
        while (n != 0) {
            r = m % n;
            m = n;
            n = r;
        }
        return m;
    }
}
