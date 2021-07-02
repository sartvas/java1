package P2_3.Set;

import java.util.HashSet;

public class Test2 {
    public static void main(String[] args) {
        HashSet <Integer> hs = new HashSet<>();
        HashSet <Integer> hs2 = new HashSet<>();
        HashSet <Integer> hsTest = new HashSet<>(hs);

        hs.add(1);
        hs.add(2);
        hs.add(3);

        hs2.add(3);
        hs2.add(6);
        hs2.add(7);

        hsTest.addAll(hs);
        //hsTest.retainAll(hs2); - 3 пересечения
        //в общем обычные методы коллекций
        System.out.println(hsTest);

    }
}
