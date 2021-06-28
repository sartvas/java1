package P2_3.Collections_1;

import java.util.ArrayList;
public class AL {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(5);//capacity увеличивает скорость
        //capacity != size
        al.add("Art");
        al.add("Queen");
        al.add("King");
        al.add("Vallet");
        al.add("Vallet");
        al.add(1,"Ford"); //можно назначить индекс, но не более длины или заполненых
        //Если в АЛ 5 элементов уже есть, добавить на 6-ю нельзя, она не заполнена.
        ArrayList<String> al2 = new ArrayList<>(al); //
        System.out.println("_____al != al2_____");
        System.out.println(al == al2); //false: добавляя внутрь al, они ссылаются на разные объекты
        //get - выводит элементы
        System.out.println("_____GetMethod_____");
        System.out.println(al.get(3));
        //set - замена значения
        System.out.println("_____SetMethod_____");
        System.out.println(al);
        al.set(1, "Vallet");
        System.out.println(al);
        //remove - удаление значения
        System.out.println("_____RemoveMethod_____");
        System.out.println(al);
        al.remove(1);
        System.out.println(al);
    }
}

