package P2_9_IO_and_NIO.PathsFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("text15.txt");
        Path folderPath = Paths.get("C:\\Users\\sartv\\OneDrive\\Рабочий стол\\X");

        System.out.println("filePath.getFileName() " + filePath.getFileName());
        System.out.println("filePath.getParent() " + filePath.getParent());
        System.out.println("folderPath.getRoot() " + folderPath.getRoot());
        System.out.println("filePath.toAbsolutePath() " + filePath.toAbsolutePath());
        System.out.println("folderPath.resolve(filePath)" + folderPath.resolve(filePath));

        if(!Files.exists(filePath)){
            Files.createFile(filePath);
            System.out.println("File created");
        }
        if(!Files.exists(folderPath)){
            Files.createDirectories(folderPath);
            System.out.println("Folder created");
        }
        System.out.println("------------------");
        System.out.println("Files.isReadable(filePath) "+Files.isReadable(filePath));
        System.out.println("Files.isWritable(filePath) "+Files.isWritable(filePath));
        System.out.println("Files.isExecutable(filePath) "+Files.isExecutable(filePath));
        System.out.println("------------------");
        System.out.println("Files.size(filePath) "+Files.size(filePath));
        System.out.println("------------------");
        System.out.println("Files.getAttribute 'creationTime' "+Files.getAttribute(filePath, "creationTime"));
        Map<String, Object> atributes = Files.readAttributes(filePath, "*");
        for(Map.Entry<String, Object> entry: atributes.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
