package Lesson5;

public class Employee {

    Employee(int id2, String surname2, int age2, double salary2,String depeartmnt2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        depeartmnt = depeartmnt2;
    }

    Employee(String surname2,int age2){
        this(0,surname2,age2, 0.0,null)
    }

    int id;
    String surname;
    int age;
    double salary;
    String depeartmnt;

    double upSalary(double upMoney) {
        salary*=upMoney;
        return salary;
    }
}

class Employees {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Savinykh", 35);

        System.out.println("У сотрудника с фамилией "+emp1.surname+" id"+emp1.id+" из департамента "+emp1.depeartmnt+" зарплата составляет "+emp1.salary);
        emp1.upSalary(1.5);
        System.out.println("После взятия грейда, ему повысили зарплату до "+emp1.salary);
    }
}

