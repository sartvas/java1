package Bootsbrain;

import java.io.File;

public class Filess {
    public static void main(String[] args) {

        File dir = new File(".");

        String [] names = dir.list();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }

}
