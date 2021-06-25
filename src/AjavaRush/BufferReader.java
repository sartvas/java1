package AjavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please inter your name:");
        String name = br.readLine();
        for (int i = 0; i < 11; i++){
            System.out.println(name);
        }
    }
}
