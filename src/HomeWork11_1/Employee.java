package HomeWork11_1;

public class Employee {
    String name;
    String surname;
    int id;
    double aver;
    static int numberStudents = 0;

    Employee(String name, String surname, int id, double aver){
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.aver = aver;
    }

    Employee (String name, String surname){
        this(name, surname, 0,0.00);
    }



    public void showStudents(){
        System.out.println("Теперь в университете учится "+numberStudents+" студентов!");
    }

}
