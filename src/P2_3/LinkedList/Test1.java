package P2_3.LinkedList;

import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        MyFriends friend1 = new MyFriends("Artem",32,'m',true);
        MyFriends friend2 = new MyFriends("Andrew",31,'m',true);
        MyFriends friend3 = new MyFriends("Olga",28,'w',false);
        MyFriends friend4 = new MyFriends("Iraina",29,'w',true);
        MyFriends friend5 = new MyFriends("Oleg",30,'m',false);
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
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MyFriends myFriends = (MyFriends) o;
        return age == myFriends.age && sex == myFriends.sex && married == myFriends.married && Objects.equals(name, myFriends.name);
    }

}

