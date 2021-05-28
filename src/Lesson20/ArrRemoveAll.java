package Lesson20;

import java.util.ArrayList;

// removeAll сравнение листов и удаление повторяющихся элементов одного списка из другого

public class ArrRemoveAll {

    public static void main(String[] args) {
        ArrayList <String> al1 = new ArrayList<>();
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

        al1.removeAll(al2);

        System.out.println(al1);


    }

}
