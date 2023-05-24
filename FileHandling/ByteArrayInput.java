import java.io.*;
public class ByteArrayInput {
    public static void main(String[] args) throws Exception {
        byte b[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z' };

        char c[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't' };
        CharArrayReader cr = new CharArrayReader(c);
        int y;
        while ((y = cr.read()) != -1) {
            System.out.println((char) y);
        }

        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        // bis.readAllbytes() return byte array
        String str = new String(bis.readAllBytes());
        System.out.println(str);

        // int x;
        // while ((x = bis.read()) != -1) {
        //     System.out.println((char) x);
        // }
    }

    public static void byteArrayOut() throws Exception{
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

        // byte[] b = bos.toByteArray();
        // for (int c : b) {
        //     System.out.println((char) c);
        // }

        bos.writeTo(new FileOutputStream("D:/Myjava/source1.txt"));
        bos.close();
    }
}
