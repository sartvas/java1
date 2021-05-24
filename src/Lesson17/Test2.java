package Lesson17;

public class Test2 {
    public static boolean eqAll (StringBuilder a, StringBuilder b){
        boolean z = true;
        if(a.length() == b.length()){
            for(int i = 0; i < a.length(); i++){
                if(a.charAt(i) != b.charAt(i)){
                    z = false;
                    break;
                }
            }
        } else {
            z = false;
        }
        return z;
    }

    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Hello");
        StringBuilder str2 = new StringBuilder("Hellq");
        boolean xx = Test2.eqAll(str1,str2);
        System.out.println(xx);
    }
}
