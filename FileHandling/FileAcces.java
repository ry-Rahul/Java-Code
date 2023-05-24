import java.io.*;
public class FileAcces {
    public static void main(String[] args) throws Exception {
        File f = new File("D:/Myjava");
        File list[] = f.listFiles();

        for (File x : list) {
            System.out.print(x.getName() + " ");
            System.out.println(x.getPath());
            // System.out.println(x.getParent());
        }
        
        File f1 = new File("D:/Myjava/copy.txt");
        // f1.setReadOnly(); only read permission then how to write in file
        f1.setWritable(true);
        FileOutputStream fos = new FileOutputStream("D:/Myjava/copy.txt");

    }
}
