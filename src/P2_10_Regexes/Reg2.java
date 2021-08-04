package P2_10_Regexes;

import Lesson7.MainClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2 {
    public static void main(String[] args) {
        String s1 = "ABC4 AB5CD ABC8F A9BDF";
//      Pattern pattern1 = Pattern.compile("ABCD"); //ABCD - соответ. ABCD подряд
//      Pattern pattern1 = Pattern.compile("[ABC]"); //[ABC] - соответ. a, b или c
//      Pattern pattern1 = Pattern.compile("AB[C-F]OP"); //[C-F] - соответ. одной из букв диапазона
//      Pattern pattern1 = Pattern.compile("AB|OP"); //AB|OP - соответ.  AB или OP
//      Pattern pattern1 = Pattern.compile("ABC."); //"." - любое количество символов
//        Pattern pattern1 = Pattern.compile("\\d"); //любая цифра от 1 до 9 \\D - любое не число
//        Pattern pattern1 = Pattern.compile("\\w"); // [A-Za-z0-9_]
        Pattern pattern1 = Pattern.compile("\\w+"); // в BAS BASS BSAAA - 3 (шт), 1 и более совпадений символов
        Matcher matcher = pattern1.matcher(s1);

        while(matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
