package Lesson19;

public class LoopsForEah2 {
    public static void main(String[] args) {
        String [] employee = {"Sav", "Mala", "Pole", "Ivanov"};
        String [] tests = {"TB", "Econom", "Buhgalt", "Pozhar"};
        for(String a:employee){
            for(String b:tests) {
                System.out.println(a+" сдал "+b);
            }
        }
    }
}
