package Lesson19;

public class LoopForEach3 {
    public static void main(String[] args) {
        int [][] arr1 = {{5,2,7},{6,3,8},{6,9,3}};
        for(int[] array2:arr1){ // принимает значение, начиная с элемента под индексом [0];
            for(int a:array2){ // принимает значение, начиная с элемента под индексом [0] уже array2;
                System.out.print(a+" "); // выводит на экран
            }
        }
    }
}
