package lab8;

public class B {
    private static final int MIN_INTEGER = Integer.MIN_VALUE;

    /*
    Several lengths:
    5, 6, 10, 20

    Practice table:
    1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18	19	20
    1 	5	7	8	10	16	18	19	25	26	30	38	46	41	50	61	70	75	80	86
     */

    public static int CutRod (int length, int[] list) {
        int maxPrice = MIN_INTEGER;

        if (length <= 0) {
            return 0;
        }

        for (int i = 0; i < length; i++) {
            maxPrice = Math.max (maxPrice, list[i] + CutRod(length - i - 1, list));
        }
        return maxPrice;
    }

    public static void main (String[] args) {
        int[] list = new int[] {1, 5, 7, 8, 10, 16, 18,	19,	25,	26,	30,	38,	46,	41,	50,	61,	70,	75,	80,	86};

        System.out.printf("Max Value: %d%n", CutRod(5, list));
        System.out.printf("Max Value: %d%n", CutRod(6, list));
        System.out.printf("Max Value: %d%n", CutRod(10, list));
        System.out.printf("Max Value: %d%n", CutRod(20, list));
    }
}
