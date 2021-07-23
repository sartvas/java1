package Streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileReader reader = null;
        try {
            reader = new FileReader("text.txt");
            int charac;
            while ((charac = reader.read()) != -1) {
                System.out.print((char) charac);
                Thread.sleep(100);
            }
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            reader.close();
        }
    }
}
