package HomeWork22;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName(){
        StringBuilder name2 = new StringBuilder(name);
        return name2;
    }
    public void setName(StringBuilder name){
        if(name.length() > 3){
            this.name = name;
        }
    }

    public int getCourse(){
        return course;
    }
    public void setCourse(int i){
        if(i > 0 && i <= 4){
            course = i;
        }
    }

    public int getGrade(){
        return grade;
    }
    public void setGrade(int i){
        if(i > 0 && i <= 10){
            grade = i;
        }
    }

    public void showinfo(){
        System.out.println("Имя: "+ getName() + ", группа: "+getGrade()+", курс: "+getCourse());
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        StringBuilder sb1 = new StringBuilder("Ivan");
        st1.setName(sb1);
        st1.setCourse(4);
        st1.setGrade(2);
        st1.showinfo();
    }

}
