import java.io.BufferedInputStream;
import java.io.*;

public class bufferedStream {
    public static void main(String[] args) throws Exception {
        // BufferReader used for reading character stream
        // FileReader fis = new FileReader("D:/Myjava/source1.txt");
        // BufferedReader bis = new BufferedReader(fis);
        // bis.readLine(); is present in bufferReader class

        FileInputStream fis = new FileInputStream("D:/Myjava/source1.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char) bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char) bis.read());
        bis.reset();
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

        fis.close();
        bis.close();
    }
}
