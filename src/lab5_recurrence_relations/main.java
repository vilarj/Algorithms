package lab5_recurrence_relations;

public class main
{
    public static void main (String[] args)
    {
        int minutes = 1;
        long duration = 60000 * minutes;

        int curFib = 1;
        int prevFib = 1;

        long timeElapsed = 0;
        long start = System.currentTimeMillis();

        do
        {
            int temp = curFib;
            curFib += prevFib;
            prevFib = temp;

            if((System.currentTimeMillis() - start) > duration)
            {

                System.out.printf("Fibbonaci Number: %d Last 5 Digits: %d" , curFib, Math.abs(curFib % 100000));

                break;
            }
        }
        while(true);




    }
}
