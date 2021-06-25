package P2Lesson1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparators {
    public static void main(String[] args) {

        List<MyFriends> list = new ArrayList<>();

        MyFriends friend1 = new MyFriends("Artem",32,'m',true);
        MyFriends friend2 = new MyFriends("Andrew",31,'m',true);
        MyFriends friend3 = new MyFriends("Olga",28,'w',false);
        MyFriends friend4 = new MyFriends("Iraina",29,'w',true);
        MyFriends friend5 = new MyFriends("Oleg",30,'m',false);

        list.add(friend1);
        list.add(friend2);
        list.add(friend3);
        list.add(friend4);
        list.add(friend5);

        Collections.sort(list);
        System.out.println("\n"+list);

    }
}

//class MyFriends implements Comparable<MyFriends>{
//    String name;
//    int age;
//    char sex;
//    boolean married;
//
//    public MyFriends(String name, int age, char sex, boolean married) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//        this.married = married;
//    }
//
//    @Override
//    public String toString() {
//        return "MyFriends{" + "name='" + name + '\'' + ", age=" + age + ", sex=" + sex + ", married=" + married + '}';
//    }
//
//    @Override
//    public int compareTo(@NotNull MyFriends o) {
//        return this.sex-o.sex;
//    }
//}