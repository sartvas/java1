package Aaexersizes;

// Возьмите три цифры у пользователя и напечатайте наибольшее число. Перейти к редактору
//         Тестовые данные
//         Введите 1-е число: 25
//         Введите 2-е число: 78
//         Введите 3-е число: 87
//         Ожидаемый результат :
//         Наибольшее: 87

import java.io.IOException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
    try {
        System.out.print("Введите 1-е число: ");
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.print("Введите 2-е число: ");
        int input2 = sc.nextInt();
        System.out.print("Введите 2-е число: ");
        int input3 = sc.nextInt();
        if (input1 > input2) {
            if (input1 > input3){
                System.out.println("Наибольшее число: "+input1);
            }
        }
        if (input2 > input3){
            System.out.println("Наибольшее число: "+input2);
        } else {
            System.out.println("Наибольшее число: "+input3);
        }

    } catch (Exception e)
    {
        System.out.println("Exeption catched");
    }
    }
}
