package P2_9_IO_and_NIO.PathsFiles;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Test3 {
    public static void main(String[] args) throws IOException {
        Path filePaths = Paths.get("test1.txt");
//        Files.createFile(filePaths);
//        String speech = "-Hi\n-Hi!\n-How are you?\n-Than you, I am ok. And you?\n-Me to!";
//        Files.write(filePaths, speech.getBytes(StandardCharsets.UTF_8));

        List<String> list = Files.readAllLines(filePaths);
        for (String s:list){
            System.out.println(s);
        }
    }
}
