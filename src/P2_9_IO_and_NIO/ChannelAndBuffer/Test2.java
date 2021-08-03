package P2_9_IO_and_NIO.ChannelAndBuffer;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Test2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("text6.txt", "r");
        FileChannel fileChannel = file.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(5);
        fileChannel.read(buffer);
        buffer.flip();
        System.out.println((char)buffer.get());
        System.out.println((char)buffer.get());
        System.out.println((char)buffer.get());

        System.out.println("---buffer.rewind---");
        buffer.rewind(); // ставит position на нулевую ячейку
        System.out.println((char)buffer.get());

        System.out.println("---buffer.compact---"); //пермещает непрочтённые байты в начало, после себя ставив позишн
        buffer.compact();
        fileChannel.read(buffer);
        buffer.flip();
        while (buffer.hasRemaining()){
            System.out.println((char)buffer.get());
        }
        System.out.println("---mark.reset---");
        buffer.clear();
        fileChannel.read(buffer);
        buffer.flip();
        System.out.println((char)buffer.get());
        buffer.mark();
        buffer.reset();
        while (buffer.hasRemaining()){
            System.out.println((char)buffer.get());
        }




    }
}
