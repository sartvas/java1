package Streams;

import java.io.*;

public class BufferWriterReader {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("text4.txt"));
        String line;
        while ((line = reader.readLine()) != null){
            writer.write(line);
        }
        reader.close();
        writer.close();
        System.out.println("Done write");
        BufferedReader reader2 = new BufferedReader(new FileReader("text4.txt"));
        int charactres;
        while ((charactres = reader2.read()) != -1){
            System.out.print((char)charactres);
            Thread.sleep(100);

        }
        System.out.println("");
        System.out.println("Done read");

    }
}
