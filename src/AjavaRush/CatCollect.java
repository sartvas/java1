package AjavaRush;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.Map;

public class CatCollect {

    public static void main(String[] args) throws Exception {
        Map<String, String> maps = new HashMap<>();
        maps.put("Vasa", "Bomzh");
        maps.put("Gena", "Idiot");
        maps.put("Ksysha", "Shlukha");

        for(Map.Entry<String, String> pair:maps.entrySet()){
            String kluch = pair.getKey();
            String znachenie = pair.getValue();
            System.out.println(kluch + " - "+ znachenie);
        }

     }
}
