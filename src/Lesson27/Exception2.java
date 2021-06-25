package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception2 {
    public static void main(String[] args) throws Exception{
        StringBuilder result = new StringBuilder("");

        try{
        File files = new File("test10.txt");
            System.out.println("File was added");
            FileInputStream fls = new FileInputStream(files);
            System.out.println("File was readed");
            int counter = 0;
            while(true){
                counter++;
                result.append(fls.read());
                System.out.println("Information is writing");
                if (counter == 3) {
                    fls.close();
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Exception1 captched");
        }
        catch (IOException e){
            System.out.println("Exception 2");
        }
        finally {
            System.out.println("this is finaly");
        }
    }

}
