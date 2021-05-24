package Lesson16;

// isBlank - наличие пробелов
// isEmpty - отсутствие пробелов
// strip, stripLeading, stripTrailing

public class NewMethods {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1.isBlank());
        System.out.println(s1.isEmpty());
        String s2 = "Hello World Wow";
        System.out.println(s2.stripLeading());
    }
}
