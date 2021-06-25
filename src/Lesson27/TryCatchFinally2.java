package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryCatchFinally2 {
    public static void main(String[] args) throws Exception{
        File f = new File("test10.txt");

        try {
            FileInputStream fls = new FileInputStream(f);
            System.out.println("File is found!");
            fls.read();
        }
        catch (FileNotFoundException e){
            System.out.println("File is not found!"); //поймали File is not found
        }

        finally {
            System.out.println("Block finally is working");
        }

        FileOutputStream otfl = new FileOutputStream(f);
        otfl.write(222);
        System.out.println("Parameters are were recorded in "+f);
    }
}
