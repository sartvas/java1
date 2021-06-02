package Lesson21;

public class DfrntMeth {
    public void abc (String s){
        System.out.println(s);
    }

    public void abc (Boolean b){
        System.out.println(b);
    }

    public StringBuilder abc(StringBuilder sb){
        System.out.println(sb);
        return new StringBuilder("Poka");
    }
}
