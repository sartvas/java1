package Lesson28;

public class Exception4 {

    //создаём свои Exception с текстом

    public static void checkPass(String pwd){
        if (pwd.length() < 6) {
            throw new IllegalArgumentException("So small characters");
        }
        if (pwd.length() > 12) {
            throw new IllegalArgumentException("Pasword`s length is very high");
        }
        System.out.println("Passwords done");
    }

    public static void main(String[] args) {
        checkPass("qwe");
    }

}
