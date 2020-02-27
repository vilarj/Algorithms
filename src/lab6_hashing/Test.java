package lab6_hashing;

public class Test {
    public static void main (String[] args) {
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
    }
}
