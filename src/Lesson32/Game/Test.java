package Lesson32.Game;

public class Test {
    public static void main(String[] args) {
        Schooler schooler1 = new Schooler("Andrew", 12);
        Schooler schooler2 = new Schooler("Artur", 11);
        Schooler schooler3 = new Schooler("Artom", 10);
        Schooler schooler4 = new Schooler("Dron", 13);

        Students st1 = new Students("Eugen", 21);
        Students st2 = new Students("Irina", 20);

        Employee emp1 = new Employee("Vera", 31);
        Employee emp2 = new Employee("John", 32);

        Team <Schooler> schoolTeam = new Team<>("ScoolRule");
        Team <Schooler> schoolTeam2 = new Team<>("ScoolPopit");
        Team <Students> sudTeam = new Team<>("StudLive");
        Team <Employee> employeeTeam = new Team<>("Planktons");

        schoolTeam.addNewParticipant(schooler1);
        schoolTeam.addNewParticipant(schooler2);
        schoolTeam2.addNewParticipant(schooler3);
        schoolTeam2.addNewParticipant(schooler4);

        sudTeam.addNewParticipant(st1);
        sudTeam.addNewParticipant(st2);

        employeeTeam.addNewParticipant(emp1);
        employeeTeam.addNewParticipant(emp2);


        schoolTeam.playWith(schoolTeam2);

    }
}
