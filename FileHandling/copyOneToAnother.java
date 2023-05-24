import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
public class copyOneToAnother {
    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {

        // copy the content of two different file to a another destination file 
            FileInputStream fis1 = new FileInputStream("D:/Myjava/Test.txt");
            FileInputStream fis2 = new FileInputStream("D:/Myjava/source1.txt");
            FileOutputStream fos = new FileOutputStream("D:/Myjava/destination.txt");

            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
            int x;
            while ((x = sis.read()) != -1) {
                if(x>=65 && x<=90){x+=32;}
                fos.write(x);
            }

            fis1.close();
            fis2.close();
            fos.close();
            sis.close();
        }
            
        
    }

