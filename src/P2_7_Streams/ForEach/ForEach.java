package P2_7_Streams.ForEach;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int [] array = {23, 56, 234, 56};

        Arrays.stream(array).forEach(System.out::println); // == forEach(e -> sout(e))
        Arrays.stream(array).forEach(PlusElem::plusAll); //вызвали метод из класса ниже.

    }
}

class PlusElem{
    public static void plusAll(int a){
        a = a + 5;
    }
}
