package Aaexersizes;

//Напишите проверку числа на чётность
import java.io.IOException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException{
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
        System.out.println(input);
            if (input % 2 == 0) {
                System.out.println("Номер положительный");
            } else {
                System.out.println("Номер отрицательный");
            }
    }
}
