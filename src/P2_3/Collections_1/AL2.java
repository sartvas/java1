package P2_3.Collections_1;


import java.util.ArrayList;
import java.util.Objects;

public class AL2 {
    public static void main(String[] args) {
        ArrayList<Schooler> al = new ArrayList<>();
        Schooler schooler1 = new Schooler("Andrew", 12);
        Schooler schooler2 = new Schooler("Artur", 11);
        Schooler schooler3 = new Schooler("Artom", 10);
        Schooler schooler4 = new Schooler("Dron", 13);
        al.add(schooler1);
        al.add(schooler2);
        al.add(schooler3);
        al.add(schooler4);
        int index = al.indexOf(schooler1);
        for (Schooler a:al){
            System.out.println("Студент с именем "+a.getName()+" и возрастом "+a.getAge()+" находится на индексе с позицией "+al.indexOf(a));
        }
        System.out.println("___isEmpty___");
        System.out.println(al.isEmpty());
        System.out.println("___contains___");
        System.out.println(al.contains("Andrew"));
        System.out.println(al.contains("Vera"));


    }
}

class Schooler{
    private String name;
    private int age;

    public Schooler(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Schooler{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Schooler schooler = (Schooler) o;
        return age == schooler.age && Objects.equals(name, schooler.name);
    }

}


