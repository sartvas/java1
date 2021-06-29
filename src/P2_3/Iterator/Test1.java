package P2_3.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> cards = new ArrayList<>();
        cards.add("Art");
        cards.add("Queen");
        cards.add("King");
        cards.add("Vallet");
        cards.add("Hearts10");

        Iterator<String> x =  cards.iterator();
        while (x.hasNext()){
            System.out.println(x.next());
        }


    }
}
