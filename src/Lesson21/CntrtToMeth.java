package Lesson21;

public class CntrtToMeth {
    CntrtToMeth() {
        System.out.println("This contructor");
    }
    void CntrtToMeth(){             //добавили void и это уже МЕТОД, название как у КЛАССА
        System.out.println("This is method");
    }
}

class A{
    public static void main(String[] args) {
       CntrtToMeth t = new CntrtToMeth();
    }
}
