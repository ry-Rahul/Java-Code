import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readingFromFile {
    public static void main(String[] args) throws Exception{
        try(FileInputStream fis = new FileInputStream("D:/Myjava/Test.txt")){
            // byte b[] =new byte[fis.available()];
            // fis.read(b);
            // String str = new String(b);
            // System.out.println(str);

            int x;
            while ((x = fis.read()) != -1) {
                System.out.println((char)x);
            }

        }
    }
    
}
