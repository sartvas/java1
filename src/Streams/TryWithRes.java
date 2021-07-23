package Streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithRes {
    public static void main(String[] args) throws IOException, InterruptedException {
        try (FileReader reader = new FileReader("text.txt")) {
            int charac;
            while ((charac = reader.read()) != -1) {
                System.out.print((char) charac);
                Thread.sleep(100);
            }
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
