package Aaexersizes;

//Напишите программу на Java, которая считывает два числа и проверяет,
//совпадают ли они с точностью до трех десятичных знаков. Перейти к редактору

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        try {
            System.out.print("Введите 1-е число: ");
            Scanner sc = new Scanner(System.in);
            int input1 = sc.nextInt();
            System.out.print("Введите 2-е число: ");
            int input2 = sc.nextInt();
            if (input1 % 100 == input2 % 100){
                if(input1 / 100 % 10 == input2 / 100 % 10){
                    System.out.println("Числа равны до 3-х знаков");
                }
            } else {
                System.out.println("Числа не равны до 3-х знаков");
            }

        } catch (Exception e)
        {
            System.out.println("Exeption catched");
        }
    }
}
