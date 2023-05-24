import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;

public class custormer {
    public static void main(String[] args) throws Exception {
        float list[] = { 1.2f, 2.3f, 3.4f, 4.5f, 5.6f };
        int count = 5;
        FileOutputStream fos = new FileOutputStream("D:/MyJava/customer.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        
        dos.writeInt(list.length);
        for (float f : list) {
            dos.writeFloat(f);
        }
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("D:/MyJava/customer.txt");
        DataInputStream dis = new DataInputStream(fis);

        int len = dis.readInt();
        float data;
        for (int i = 0; i < len; i++) {
            data = dis.readFloat();
            System.out.println(data);
        }

        dis.close();
        fis.close();




    }
}
