package lab6_hashing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Dictionary;
import java.util.Scanner;

public class Test {
    public static void main (String[] args) throws FileNotFoundException {
        int dictionarySize;
        HDictionary<String, String> dic = new HDictionary<>(3);
        Entry car = new Entry<>("Toyota", "Red");
        Entry car2 = new Entry<>("Honda", "Blue");
        Entry car3 = new Entry<>("Benz", "White");

        dic.Hash_Insert(car);
        dic.Hash_Insert(car2);
        dic.Hash_Insert(car3);

        System.out.println(dic.Hash_Search("Toyota"));
        System.out.println(dic.Hash_Search("Benz"));
        System.out.println(dic.Hash_Search("123"));

        // Part C
        System.out.println("\n====== Part C ======");
        HDictionary dictionary;
        File file = new File("/Users/mainframe/Documents/Algorithms/movies.txt");
        dictionarySize = getLineCount(file);
        dictionary = addToDictionary(dictionarySize, file);

        String[] theaters = new String[] {"Arclight Cinemas Boston", "Only Marver Movies", "Museum Of Science", "Meme Central", "Amc Theatre", "Regent Theatre"};
        for(String theater : theaters)
        {
            Entry search = dictionary.Hash_Search(theater);

            if(search != null && search.getValue() != null)
                System.out.printf("%s exist %s %n", theater, search.getValue());
            else
                System.out.printf("%s does not exist %n", theater);
        }
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

    public static HDictionary addToDictionary(int size, File file) {
        HDictionary dictionary = new HDictionary(size);

        try (Scanner read = new Scanner(file)) {
            while (read.hasNextLine()) {
                String line = read.nextLine();

                int phoneNumberIndex = line.length() - 12;
                String key = line.substring(0, phoneNumberIndex - 1);
                String value = line.substring(phoneNumberIndex);
                dictionary.Hash_Insert(new Entry(key, value));
            }
        }
        catch (FileNotFoundException ex) {
            ex.getStackTrace();
        }

        return dictionary;
    }
}
