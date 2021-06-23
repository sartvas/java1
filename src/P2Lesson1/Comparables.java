package P2Lesson1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Comparables {
    public static void main(String[] args) {
        List<Empoyee> list = new ArrayList<>();
        Empoyee emp1 = new Empoyee(100, "Artem", "Savinykh", 120);
        Empoyee emp2 = new Empoyee(102, "Andrew", "Malakhov", 102);
        Empoyee emp3 = new Empoyee(123, "Irina", "Kurina", 140);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

    }

}

class Empoyee {

    public Empoyee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    int id;
    String name;
    String surname;
    int salary;

    @Override
    public String toString() {
        return "Empoyee{" + "id=" + id + ", name='" + name + '\'' + ", surname='" + surname + '\'' + ", salary=" + salary + '}';
    }
}