package Lesson25;

public class Cast {
}

class One {
    int a = 1;
    void abc(){
        System.out.println("Method of class One");
    }
}

class Two extends One {
    int a = 2;
    void abc(){
        System.out.println("Method of class Two");
    }
}

class Three extends Two {
    int a = 2;
    void abc(){
        super.abc(); //вызываем метод родительского класса
        System.out.println("Method of class Three");
    }
    public static void main(String[] args) {
        Three a3 = new Three();
        a3.abc();
        System.out.println(((One)a3).a); //обращаемся к переменной "дедушки"
    }
}