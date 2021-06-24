package Lesson32;

import com.sun.jdi.Value;

import javax.swing.*;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> vl1 = new Pair<>("Artem", 35);
        System.out.println("1st parameter is: "+vl1.getFirstValue()+"; 2nd parameter is: "+ vl1.getSecondValue());

        Pair<Integer, Double> vl2 = new Pair<>(23, 34.4);
        System.out.println("1st parameter is: "+vl2.getFirstValue()+"; 2nd parameter is: "+ vl2.getSecondValue());

        OtherPair<String> otherPair1 = new OtherPair<>("Andrew", "drinking");
        System.out.println("1st parameter is: "+otherPair1.getFirstValue()+"; 2nd parameter is: "+ otherPair1.getSecondValue());

        OtherPair<Integer> otherPair2 = new OtherPair<>(23, 45);
        System.out.println("1st parameter is: "+otherPair2.getFirstValue()+"; 2nd parameter is: "+ otherPair2.getSecondValue());

    }
}

class Pair<V1, V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue(){
        return value1;
    }
    public V2 getSecondValue(){
        return value2;
    }
}

class OtherPair<K>{ //если параметры одного типа, но их более одного
    private K value1;
    private K value2;

    public OtherPair(K value1, K value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public K getFirstValue(){
        return value1;
    }
    public K getSecondValue(){
        return value2;
    }
}