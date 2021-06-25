package AjavaRush;

import java.util.Scanner;

public class Hollydas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = str.replace('a', 'b');
        System.out.println(result);
    }
}
