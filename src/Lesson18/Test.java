package Lesson18;

public class Test {
    public static void main(String[] args) {
        char [] array = {'p', 'r', 'i', 'v', 'e', 't'};
//        String s = new String(array);
//        System.out.println(s);
        StringBuilder stb = new StringBuilder("Hello World");
//        stb.append(array, 2,2);
        stb.insert(2,array, 1,3);
        System.out.println(stb);
    }
}
