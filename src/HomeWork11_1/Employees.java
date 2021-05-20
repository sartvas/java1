package HomeWork11_1;


public class Employees {

    public static void changeName(Employee stud1){
        stud1.name = "Artur";
    }

    public static void main(String[] args) {
        Employee stud1 = new Employee("Artom", "Savinykha");
        Employee stud2 = new Employee("Vasya", "Savinykha");
        stud1.showStudents();
        changeName(stud2);
        System.out.println(stud2.name);
    }
}
