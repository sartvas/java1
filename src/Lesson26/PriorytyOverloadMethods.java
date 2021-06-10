package Lesson26;

public class PriorytyOverloadMethods {
}

//Java ищет наиболее точное совпадение по типам данных => потом больше типы данных для примитив (int to Long)
// и parent classess (String - Object) => потом автобокс => потом вараргс

class Test1{
    void abc(int i){
        System.out.println("int"); // 1st - prior
    }
    void abc(byte i){
        System.out.println("byte"); // 3rd - prior
    }
    void abc(long i){
        System.out.println("long"); // 2nd - prior
    }

    void def(Object o){
        System.out.println("Object"); // 2nd - prior
    }

    void def(String a){
        System.out.println("String"); // 1st - prior
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.abc(5);
        t1.def("re");
    }
}
