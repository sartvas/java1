package Lesson21;

public class Gbgclct {
    public static void main(String[] args) {
        // Methods System.gc() можно попытаться указать Gabarge collect удалить, но он сам решает.
        // finalize(); никогда не вызывается на 1 объект
        String s1, s2;
        s1 = new String("Hi");
        s2 = new String("Bye");
        s1 = s2;
        String s3 = s1;
        s1 = null;
        System.out.println(s1 + " " + s2 + " "+ s3); // все объекты (2) могут быть удалениы GC
    }
}
