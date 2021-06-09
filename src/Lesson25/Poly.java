package Lesson25;

public class Poly {
    public static void main(String[] args) {
        String [] array1 = {"Hi", "Bye"};
        Object [] array2 = array1;
        String [] array3 = (String [])array2;
        if(array1 instanceof Object){
            System.out.println("Instanse");
        } else {
            System.out.println("No instanse");
        }

    }
}
