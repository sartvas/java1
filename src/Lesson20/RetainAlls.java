package Lesson20;

import java.util.ArrayList;

// retainAll - будут удалены только те элементы, которых нет ни в одном из листов.

public class RetainAlls {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");

        ArrayList <String> al2 = new ArrayList<>();
        al2.add("one");
        al2.add("three");
        al2.add("four");

        al1.retainAll(al2);

        System.out.println(al1); // al1 = [one, three, four]


    }
}
