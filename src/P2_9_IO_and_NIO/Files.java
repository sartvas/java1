package P2_9_IO_and_NIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Files {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\sartv\\OneDrive\\Изображения\\5ca0a1273067c57d7287062a438ba0e11.jpg");
        FileOutputStream outputStream = new FileOutputStream("penoplex.jpg");
        int i;
        while ((i = inputStream.read()) != -1){
            outputStream.write(i);
        }
        inputStream.close();
        outputStream.close();
        System.out.println("Done write");
    }
}
