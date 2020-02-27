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
        System.out.println("\n====== Part C ======");
        File file = new File("/Users/mainframe/Documents/Algorithms/movies.txt");
        int lineCount = getLineCount(file);
        System.out.printf("Line Count: %d%n", lineCount);
        System.out.println(addToDictionary(lineCount, file).Search("Harvard Film Archive"));
    }

    public static int getLineCount(File file)
    {
        int lineCount = 0;


        try (Scanner read = new Scanner(file))
        {
            while (read.hasNextLine())
            {
                read.nextLine();
                lineCount++;
            }
            read.close();

        }

        catch (FileNotFoundException ex) {
            ex.getStackTrace();
        }


        return lineCount;
    }
    public static HDictionary addToDictionary(int size, File file)
    {
        HDictionary dictionary = new HDictionary(size);

        try (Scanner read = new Scanner(file))
        {
            while (read.hasNextLine()) {
                String line = read.nextLine();

                int phoneNumberIndex = line.length() - 12;
                String key = line.substring(0, phoneNumberIndex);
                String value = line.substring(phoneNumberIndex);
                dictionary.Insert(new Entry(key, value));
            }

        }
        catch (FileNotFoundException ex) {
            ex.getStackTrace();
        }

        return dictionary;
    }

}
