package lab6_hashing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main (String[] args) throws FileNotFoundException {
        HDictionary<String, String> dic = new HDictionary<>(1);
        Entry car = new Entry<>("Toyota", "Red");
//        Entry car2 = new Entry<>("Honda", "Blue");
//        Entry car3 = new Entry<>("Benz", "White");
//        Entry car4 = new Entry<>("Toyota", "Red");
//        Entry car5 = new Entry<>("Honda", "Blue");
//        Entry car6 = new Entry<>("Benz", "White");

        dic.Insert(car);
//        dic.Insert(car2);
//        dic.Insert(car3);
//        dic.Insert(car4);
//        dic.Insert(car5);
//        dic.Insert(car6);
        System.out.println(dic.Search("Toyota").getValue());
        System.out.println(dic.Search("Toyota").getKey());

        // Part C
        getFile();
    }

    public static void getFile () {
        System.out.println("\n====== Part C ======");
        try (Scanner read = new Scanner(new File("movies.txt"))) {
            String message = "";

            while (read.hasNextLine()) {
                message = read.nextLine();
                System.out.print (message);
                System.out.println();
            }
        }
        catch (FileNotFoundException ex) {
            ex.getStackTrace();
        }
    }
}
