package P2_3.Iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {
        String s = "zakazakaz";
        List<Character> list = new LinkedList<>();
        for(char ch:s.toCharArray()){
            list.add(ch);
        }

        Iterator <Character> x = list.listIterator();
        Iterator <Character> z = list.listIterator(list.size());

        }
    }
