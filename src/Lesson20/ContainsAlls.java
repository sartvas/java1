package Lesson20;

import java.util.ArrayList;

//containsAll = al1.containsAll(al2); true/false содержит ли al1 все элементы al2

public class ContainsAlls {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");

        System.out.println(al1);

        ArrayList <String> al2 = new ArrayList<>();
        al2.add("one");
        al2.add("three");
        al2.add("four");



        boolean result = al1.containsAll(al2);

        System.out.println(result);


    }
}
