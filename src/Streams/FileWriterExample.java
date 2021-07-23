package P2_8_Multithreading.Streams;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
}

class TestWriter {
    public static void main(String[] args) throws IOException {
        String string = "String";
        FileWriter write = null;
        try {
            write = new FileWriter("text.txt");
            for (int i = 0; i < string.length(); i++){
                write.write(string.charAt(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            write.close();
        }
    }
}