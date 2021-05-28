package Lesson20;

import java.util.ArrayList;
import java.util.List;

//subList = al1.subList(1,4); List<> = ArrayList.subList(index - с какого ,index - по какой - невключительно)

public class Sublists {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");

        System.out.println(al1);
        System.out.println();

        List <String> sublist = al1.subList(1,4);
        System.out.println(sublist);
        System.out.println();

        sublist.add("Ten");
        System.out.println(sublist);
        System.out.println(al1); //"Ten" добавился в al1
        System.out.println();

        // al1.add("Ten");
        // System.out.println(sublist);
        // System.out.println(al1);
        // System.out.println(); ошибка ConcurrentModificationException  можно добавлять только через модификатор

    }
}
