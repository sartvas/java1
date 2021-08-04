package P2_10_Regexes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1 {
    public static void main(String[] args) {
        String info = "Ivanov Vasiliy, Russia, Moscow, Lenin Street, 51 , Flat 48, " +
                "email: hdhdh@mail.ru, postcode: 2346722, Phone number +79285454545;" +
                "Werwerov Andrew , Russia, Rostov, Khmarik Street, 34 , Flat 1, " +
                "email: hdhasascadh@yandex.ru, postcode: 45875295, Phone number +79886654123;" +
                "Suchkova Anna , USA, California, Vitebsk Street, 21 , Flat 24, " +
                "email: wewrtg@google.com, postcode: 8845521, Phone number +79075485656;";

//        Pattern pattern = Pattern.compile("\\+\\d{9}"); //найдём все телефоны
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)");
        Matcher matcher = pattern.matcher(info);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }

}
