package P2_3.Set;

//hashSet урезанный hashМар, где знаечение 1 = кючу. все уникальные
//hashSet не запоминет порядок добавления элементов. В его основе лежит
//hashМар, его элементы выглядят так <hashSet, const(заглушка)>

import java.util.HashSet;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        HashSet<Integer> union = new HashSet<>(set2);
        set.add("Artom");
        set.add("Irina");
        set.add("Violetta");
        set.add("Garic");

        set2.add(1);
        set2.add(2);
        set2.add(3);

        set3.add(4);
        set3.add(5);
        set3.add(6);

        System.out.println(set);
        set.remove("Garic");
        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Violetta"));
        System.out.println(set.size());

        System.out.println(union);




    }

    private static void checkelements(Set<String> set) {
        for (String s:set) {
            System.out.println("Let`s out "+s);
        }
    }
}
