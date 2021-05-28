package Lesson20;

import java.util.ArrayList;

public class ArrList1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ArrayList <String> list2 = new ArrayList();
        list2.add("ok");
        list2.add("ok2!");
        list2.add("ok3");
        list2.add("ok4");
        System.out.println(list2.size());
        System.out.println(list2.get(3));
        for(String a:list2){
            System.out.print(a+" ");
        }

        System.out.println();
        ArrayList <String> list3 = new ArrayList();
        list3.add("Petrov"); // добавляет в конец листа
        // list3.addAll(list2); - добавляет в конец листа
        list3.addAll(0,list2); //// добавляет от индекса листа
        for(String a:list3){
            System.out.print(a+" ");
        }
        System.out.println(list3.indexOf(1));
        System.out.println(list3.size());
        System.out.println(list3.isEmpty());
        System.out.println(list3);
        System.out.println(list3.toString());
    }
}
