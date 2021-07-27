package P2_9_IO_and_NIO;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        File folder = new File("C:\\Users\\sartv\\OneDrive\\Рабочий стол\\A");
        File file2 = new File("C:\\Users\\sartv\\OneDrive\\Рабочий стол\\A\\text22.txt");
        System.out.println("file.getAbsolutePath() " + file.getAbsolutePath());
        System.out.println("---------------------------------------");
        System.out.println("file.isAbsolute() "+file.isAbsolute());
        System.out.println("---------------------------------------");
        System.out.println("file.isDirectory() "+file.isDirectory());
        System.out.println("---------------------------------------");
        System.out.println("file.exists() "+file.exists());
        System.out.println("---------------------------------------");
        System.out.println("file.createNewFile() "+file2.createNewFile());
        System.out.println("---------------------------------------");
        System.out.println("file.length() "+file.length());
        System.out.println("folder.length() "+folder.length());
        System.out.println("---------------------------------------");
//        System.out.println("file2.length() "+file2.delete());
//        System.out.println("---------------------------------------");
        File [] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println("---------------------------------------");
        System.out.println("file.isHidden() "+file.isHidden());
        System.out.println("file.canRead() "+file.canRead());
        System.out.println("file.canWrite() "+file.canWrite());
        System.out.println("file.canWrite() "+file.canExecute());

    }
}
