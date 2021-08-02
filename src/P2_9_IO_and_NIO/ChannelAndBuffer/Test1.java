package P2_9_IO_and_NIO.ChannelAndBuffer;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class Test1 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("text.txt", "rw");
        FileChannel channel = file.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(13);

        StringBuilder someText = new StringBuilder();
        int byteRead = channel.read(buffer);
        while (byteRead > 0){
            System.out.println("Read " + byteRead);

            buffer.flip();

            while (buffer.hasRemaining()){
                someText.append((char)buffer.get());
            }

            buffer.clear();
            byteRead = channel.read(buffer);
        }
        System.out.println(someText);
        String lorem = "\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, \n" +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \n" +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris \n" +
                "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in \n" +
                "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \n" +
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \n" +
                "eserunt mollit anim id est laborum.";

        ByteBuffer buffer2 = ByteBuffer.allocate(lorem.getBytes().length);
    }
}
