package Streams;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFiles {
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("text.txt", "rw");
        int a = randomAccessFile.read();
        System.out.println((char)a);
        String line = randomAccessFile.readLine();
        System.out.println(line);
        randomAccessFile.seek(20);
        String line2 = randomAccessFile.readLine();
        System.out.println(line2);
        long end;
        randomAccessFile.seek(randomAccessFile.length() - 1);
        randomAccessFile.writeBytes("\nArtem");
    }
}
