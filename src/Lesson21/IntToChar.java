package Lesson21;

public class IntToChar {
    void abc(int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        IntToChar t = new IntToChar();
        char c  = 'a';
        t.abc(c); // использовали char
    }
}
