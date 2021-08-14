package Sorting;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList <String> auto = new ArrayList<>();
        auto.add("Toyota");
        auto.add("Suzuki");
        auto.add("Lada");
        auto.add("Volkswagen");
        auto.add("Lamborgini");
        for (String collect:auto){
            System.out.print(collect+ "; ");
        }
        System.out.println("\n---Sorted ArrayList-----");
        Collections.sort(auto);
        for (String collect:auto){
            System.out.print(collect+ "; ");
        }
        System.out.println("\n---Reversed ArrayList-----");
        Collections.reverse(auto);
        for (String collect:auto){
            System.out.print(collect+ "; ");
        }
        System.out.println("-----------");
        ArrayList<MyCars> myCars = new ArrayList<>();
        MyCars car1 = new MyCars("Toyota", "white", 2);
        MyCars car2 = new MyCars("Toyota", "black", 2);
        MyCars car3 = new MyCars("Suzuki", "grey", 4);
        MyCars car4 = new MyCars("Lada", "white", 3);
        MyCars car5 = new MyCars("Kia", "white", 4);
        MyCars car6 = new MyCars("Dodge", "white", 6);

        myCars.add(car1);
        myCars.add(car2);
        myCars.add(car3);
        myCars.add(car4);
        myCars.add(car5);
        myCars.add(car6);

        Collections.sort(myCars, new CompareLable());
        System.out.println(myCars);


    }
}

class MyCars implements Comparable<MyCars>{
    String lable;
    String color;
    int engine;

    public MyCars(String lable, String color, int engine) {
        this.lable = lable;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "MyCars{" + "lable='" + lable + '\'' + ", color='" + color + '\'' + ", engine=" + engine + '}';
    }


    @Override
    public int compareTo(@NotNull MyCars o) {
        return this.engine-o.engine;
    }
}

class CompareLable implements Comparator<MyCars> {

    @Override
    public int compare(MyCars lable1, MyCars lable2) {
        return (lable1.lable.compareTo(lable2.lable));
    }
}
