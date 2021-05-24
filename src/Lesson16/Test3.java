package Lesson16;

public class Test3 {
    public static void main(String[] args) {
        String s1 = "ya@yahoo.com; on@mail.ru; ona@gmail.com";
        char c1;
        for (int i = 0; i < s1.length(); i++) {
            c1 = s1.charAt(i);
            if(c1 == ';') {
                System.out.println();
                continue;
            }
            System.out.print(c1);
        }
        System.out.println();
    }
}