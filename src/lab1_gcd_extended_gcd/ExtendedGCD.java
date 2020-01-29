package lab1_gcd_extended_gcd;

import java.util.Scanner;

public class ExtendedGCD {
    private Scanner input;
    private int defM, defN; // definite M and N
    private int s = 0;
    private int t = 1;
    private int r;
    private int oldS = 1;
    private int oldT = 0;
    private int oldR;

    // Constructor
    public ExtendedGCD () {
        extendedGCD();
    }

    /**
     * Function that calculates the extended version of the
     * Euclidean's algorithm (gcd(m,n))
     */
    public void extendedGCD() {
        getValues();
        r = defN;
        oldR = defM;
        int quotient;

        while (r != 0) {
            quotient = oldR / r;

            int tempR = r;
            r = oldR - quotient * tempR;
            oldR = tempR;

            int tempS = s;
            s = oldS - quotient * tempS;
            oldS = tempS;

            int tempT = t;
            t = oldT - quotient * tempT;
            oldT = tempT;
        }
    }

    // Getters, Setters and a formatting
    public int[] getCoefficients() {return new int[]{this.oldS, this.oldT};}
    public int[] getQuotients() {
        return new int[]{this.t, this.s};
    }
    public int getOldR () {return oldR;}
    public int getDefM(){return defM;}
    public int getDefN(){return defN;}
    @Override
    public String toString (){
        String output;
        output = "gcd(" + getDefM() + ", "+ getDefN() + ") = " + getOldR() + " < = > " + getOldR() + " = " + getCoefficients()[0] + "(" + getDefM() + ")" + " + " + getCoefficients()[1] + "(" + getDefN() + ")";
        return output;
    }

    /**
     * This function gets the m and n from the user's input
     */
    public void getValues () {
        input = new Scanner(System.in);

        System.out.print("Enter m: "); // 1398
        defM = input.nextInt();
        System.out.print("Enter n: "); // 324
        defN = input.nextInt();

        // Closing the Scanner class
        input.close();
    }
}
