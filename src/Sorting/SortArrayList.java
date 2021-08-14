package Sorting;

import P2_7_Streams.Collect.Collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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
    }
}
