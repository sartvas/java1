package Lesson32;

import java.util.ArrayList;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        List<?> list = new ArrayList<>();
        //list.add("string") ---- ошибка, нужно сначала определить тип листа
        List<String> list2 = new ArrayList<>();
        list2.add("string");
        showList(list2);

        ArrayList <Integer> list3 = new ArrayList<>();
        list3.add(34);
        list3.add(45);
        list3.add(56);

        ArrayList <Double> dbl = new ArrayList<>();
        dbl.add(34.3);
        dbl.add(45.7);
        dbl.add(56.8);

        System.out.println(summ(dbl));

    }

    public static void showList(List<?> li){
        System.out.println(li);
    }

    public static double summ(ArrayList<? extends Number> al){
        double summa = 0;
        for (Number n:al){
            summa += n.doubleValue();
        }
        return summa;
    }
}
