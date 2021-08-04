package P2_9_IO_and_NIO.WalkFileThree;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Test1 {
    public static void main(String[] args) throws IOException{
        Path path = Paths.get("C:\\Users\\sartv\\OneDrive\\Рабочий стол\\Отчёты СС");
        Files.walkFileTree(path, new Valker());
    }
}
class Valker implements FileVisitor<Path> {

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Visit :" + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Found file:" + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Error with file:" + file.getFileName());
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Out of :" + dir);
        return FileVisitResult.CONTINUE;
    }
}

