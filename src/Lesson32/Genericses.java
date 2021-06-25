package Lesson32;

//Важнейшая задача Generics - типобезопасность TYPE SAVE
//Вторая причина - Reusable Code

public class Genericses {
    public static void main(String[] args) {
        Info <String> info1 = new Info<>("Hello");
        System.out.println(info1);
        String s = info1.getValue();

        Info <Integer> info2 = new Info<>(23);
        System.out.println(info2);
        Integer i1 = info2.getValue();

    }
}

//Parametrized class
//Класс без каких либо данных, метаданные, заполняемые по ходу

class Info <T>{
    private T value;
    public Info(T value){
        this.value = value;
    }

    public String toString(){
        return "(" + value + ")";
    }

    public T getValue(){
        return value;
    }
}

class Paretn {
    public void abc(Info<String> info) {
        String s = info.getValue();
    }
}
