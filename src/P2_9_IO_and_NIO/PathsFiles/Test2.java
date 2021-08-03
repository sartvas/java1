package P2_9_IO_and_NIO.PathsFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("text4.txt");
        Path directoryPath = Paths.get("C:\\Users\\sartv\\OneDrive\\Рабочий стол\\X");
        Path directoryBPath = Paths.get("C:\\Users\\sartv\\OneDrive\\Рабочий стол\\W");

        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
//      Files.copy(filePath, folderPath.resolve("text14.txt"));
//      System.out.println("Done");
//      Files.createDirectory(directoryBPath);
//      Files.copy(directoryBPath, directoryPath.resolve("B")); // копируем папку, но не копируем содержимое
//      System.out.println("Done copy folder");
//      Files.move(filePath, directoryBPath.resolve("text4.txt"));
//      Files.move(Paths.get("text3.txt"), (Paths.get("text31.txt")));
//      Files.delete(Paths.get("text6.txt"));
    }
}
