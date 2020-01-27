package lab2_insertion_merge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader
{
    private List<String> words = new ArrayList<String>();

    private String sanitize(String input)
    {
        return input.replaceAll("[^A-Za-z]+", "");
    }

    public Reader(String path) throws FileNotFoundException
    {
        File file = new File(path);
        Scanner fin = new Scanner(file);
        while(fin.hasNext())
        {
            String word = fin.next();
            word = sanitize(word);

            if(word.length() > 1)
                words.add(word);
        }
    }
    public String[] get()
    {
        return this.words.toArray(new String[0]);
    }
}
