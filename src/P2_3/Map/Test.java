package P2_3.Map;

import java.util.HashMap;
import java.util.Map;

//Ключ должен быть уникальным

public class Test {
    public static void main(String[] args) {
        Map <Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Artom");
        map1.put(1230, "Andrew");
        map1.put(1432, "Max");
        map1.put(4321, "Oleg");
        //putIfAbsent - добавить, если нет такого
        map1.putIfAbsent(1000, "Gena");
        System.out.println(map1);
        //get - выводит значение по ключу
        System.out.println(map1.get(1000));
        //remove - удаляет значение по ключу
        map1.remove(1230);
        System.out.println(map1);
        //containsValue - возвращает true/false, если есть/нет значения
        System.out.println("___containsValue___");
        System.out.println(map1);
        if(!map1.containsValue("Ivan eee")){
            map1.put(1864, "Ivan eee");
        }
        System.out.println(map1);
        //containsKey - возвращает true/false, если есть/нет ключ
        System.out.println("___containsKey___");
        System.out.println(map1);
        if(!map1.containsKey(14124)){
            map1.put(14124, "Ivan 14124");
        }
        System.out.println(map1);
        //keySet - возвращает множество всех ключей
        System.out.println(map1.keySet());
        System.out.println(map1);
        //keySet - возвращает множество всех значений
        System.out.println(map1.values());



    }
}
