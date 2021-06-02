package AjavaRush;

import java.util.*;

public class Coollections {
    public static void main(String[] args) {
        Set<String> fruit = new HashSet<>();
        fruit.add("арбуз");
        fruit.add("банан");
        fruit.add("вишня");
        fruit.add("груша");
        fruit.add("дыня");
        fruit.add("ежевика");
        fruit.add("жень-шень");
        fruit.add("земляника");
        fruit.add("ирис");
        fruit.add("картофель");
        for(String allfruit:fruit){
            System.out.println(allfruit);
        }
    }
}
