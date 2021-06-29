package P2_3.LinkedList;

import java.util.LinkedList;
import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        MyFriends friend1 = new MyFriends("Artem",32,'m',true);
        MyFriends friend2 = new MyFriends("Andrew",31,'m',true);
        MyFriends friend3 = new MyFriends("Olga",28,'w',false);
        MyFriends friend4 = new MyFriends("Iraina",29,'w',true);
        MyFriends friend5 = new MyFriends("Oleg",30,'m',false);

        LinkedList<MyFriends> myFriends = new LinkedList<>();
        myFriends.add(friend1);
        myFriends.add(friend2);
        myFriends.add(friend3);
        myFriends.add(friend4);
        myFriends.add(1,friend5);

        System.out.println(myFriends.get(2));
    }
}

class MyFriends {
    String name;
    int age;
    char sex;
    boolean married;

    public MyFriends(String name, int age, char sex, boolean married) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.married = married;
    }

    @Override
    public String toString() {
        return "MyFriends{" + "name='" + name + '\'' + ", age=" + age + ", sex=" + sex + ", married=" + married + '}';
    }
}

