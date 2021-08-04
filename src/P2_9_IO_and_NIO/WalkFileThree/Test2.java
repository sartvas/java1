package P2_9_IO_and_NIO.WalkFileThree;

import P2_7_Streams.Sorted.SortedIt;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Test2 {
    public static void main(String[] args) throws IOException{
        Path source = Paths.get("C:\\Program Files\\nodejs");
        Path destination = Paths.get("C:\\Users\\sartv\\OneDrive\\Рабочий стол\\CH");
        Files.walkFileTree(source, new Walker(source,destination));
        System.out.println("Done!");

    }
}
class Walker extends SimpleFileVisitor<Path> {
    Path source;
    Path destination;

    public Walker(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }
}