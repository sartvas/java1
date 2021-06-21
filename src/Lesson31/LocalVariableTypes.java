package Lesson31;

//LocalVariableTypes

public class LocalVariableTypes {
    //var b = 10; нельзя использовать вне методов, и внутри методов
    public static void main(String[] args) {
        var tit = new TestInfernceType(); //var == TestInfernceType
        var i = 10;
        var w = 1.5f;
        var array = new String[]{"a","b"};
    }

}

class TestInfernceType{

}
