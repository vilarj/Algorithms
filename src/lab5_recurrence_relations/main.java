package lab5_recurrence_relations;


import java.util.Scanner;

public class main
{
    public static void main (String[] args)
    {
        int n = 1;
        int seconds = 10;
        int fibNumber = 0;

        String mode = "recursive";
        Scanner fin = new Scanner(System.in);

        System.out.print("Enter Mode (Recursive or Iterative) > ");
        mode = fin.nextLine();
        System.out.print("Enter Duration (seconds) > ");
        seconds = fin.nextInt();

        long timeElapsed = 0;
        long start = System.currentTimeMillis();

        do
        {
            if(mode.equalsIgnoreCase("iterative"))
                fibNumber = Fibonacci.iterative(n);
            else
                fibNumber = Fibonacci.recursive(n);

            if((System.currentTimeMillis() - start) > (1000 * seconds))
            {
                System.out.printf("Fibbonaci Number: %d Last 5 Digits: %s N value: %d" , fibNumber, String.valueOf(fibNumber).substring(5), n);

                break;
            }
            n++;
        }
        while(true);
    }
}
