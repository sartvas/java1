package P2_9_IO_and_NIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serializations {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        List<String> students = new ArrayList<>();

        students.add("Artur");
        students.add("Irina");
        students.add("Artem");
        students.add("Andrew");

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Allstudents.bin"));
        outputStream.writeObject(students);
        System.out.println("Done");

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Allstudents.bin"));
        List<String> students2;
        students2 = (ArrayList)inputStream.readObject();
        System.out.println(students2);

    }
}
