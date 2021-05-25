package Ashildt;

import java.util.Scanner;

public class Ch11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        int indexWord = a.indexOf("M");
        int mail = a.indexOf("mail.ru");
        int yandex = a.indexOf("yandex.ru");
        int google = a.indexOf("google.com");
        if (mail > 0){
            System.out.println("Post is mail");
        }
        if (yandex > 0){
            System.out.println("Post is yandex");
        }
        if(google > 0){
            System.out.println("Post is google");
        }

    }

}
