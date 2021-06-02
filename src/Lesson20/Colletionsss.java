package Lesson20;

import java.util.*;

public class Colletionsss {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(777, "Ivanov Ivan");
        map.put(778, "Polezhai Max");
        map.put(779, "Malakhov Andrew");
        map.put(780, "Savinykh Artom");
        map.remove(779);
        //System.out.println("map = "+ map);

        List <String> lsts = new ArrayList<>(); // коллекция на основе индексов
        lsts.add("Vera");
        lsts.add("Gera");
        lsts.add("Valera");
        lsts.set(1,"Irina"); //замен по индексу
        System.out.println(lsts.get(2)); //вывод по индексу
        System.out.println(lsts);
        for (String sluts:lsts){
            System.out.print(sluts+" ");
        }

        Set<String> set = new HashSet<String>();
        set.add("Mama");
        set.add("Mila");
        set.add("Ramu");

        for (String text : set)
        {
            System.out.println();
            System.out.println(text);
        }



    }
}
