import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class createFile {
    public static void main(String[] args) throws Exception{
        
        try (FileOutputStream fos = new FileOutputStream("D:/Myjava/Test.txt")) {

            String str = "LEARN JAVA PROGRAMMING";
            fos.write(str.getBytes());

            // byte b[] = str.getBytes();
            // for (byte c : b) {
            //     fos.write(c);
            // }

            // fos.write(b, 6, str.length() - 6);
        }

    }
}
