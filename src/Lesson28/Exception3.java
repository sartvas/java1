package Lesson28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception3 {
    static int abc(){
        try {
            File file_1 = new File("test11.txt");
            System.out.println("File is added");
            FileInputStream file_read1 = new FileInputStream(file_1);
            //return 5;
        }
        catch (FileNotFoundException e){
            System.out.println("Catch FNF-Exception");
            return 6;
        }
        finally {
            System.out.println("This is finally");
            return 7; //более значимый return statment
        }

    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}
