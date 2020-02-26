package lab7_hashing;

public class Test {
    public static void main (String[] args) {
        HDictionary<String, String> dic = new HDictionary<>(5);

        Entry car = new Entry<String, String>("Toyota", "Red");
        Entry car2 = new Entry<String, String>("Honda", "Blue");

        dic.Insert(car);
        dic.Insert(car2);

        System.out.println(dic.Search("Toyota").getValue());
        System.out.println(dic.Search("Honda").getValue());


    }
}
