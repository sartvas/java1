package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FilesIO {
    public static void main(String[] args) throws Exception{
        // абстрактная репрезентация пути к файлу или папке
        File f = new File("test10.txt");

        //FileInputStream - создание потока для чтения из файла
        FileInputStream fls = new FileInputStream(f);
        System.out.println("File is found!");
        fls.read();

        //FileOutputStream - создание потока для записи в файл
        FileOutputStream fls2 = new FileOutputStream(f);
        fls2.write(100);

    }
}
