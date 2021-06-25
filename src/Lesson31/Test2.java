package Lesson31;

import java.util.ArrayList;
import java.util.List;

//ForEach,
public class Test2 {
    public static void main(String[] args) {
        List <String> list = List.of("Hi", "Hello", "How are you");

        System.out.println("______forEach________");
        list.forEach(s -> System.out.println(s));


        System.out.println("______RemoveIf________");
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(22);
        al.add(3);
        al.add(14);
        al.add(5);
        al.add(61);
        al.add(7);
        al.removeIf(element -> element % 3 == 0);
        System.out.println(al);

        System.out.println("______SORT_________");
        System.out.println(al);
        al.sort((x, y) -> x.compareTo(y));
        System.out.println(al);
        al.sort((x, y) -> -x.compareTo(y));
        System.out.println(al);
    }
}
