import java.util.*;
import java.io.*;

public class ResourcesDemo {

    // static FileInputStream fi;
    // static Scanner sc ;

    static void Divide() throws Exception {

        // all the resources that are created inside the try block will be closed automatically
        try (FileInputStream fi = new FileInputStream("C:\\Users\\Prabhu\\Desktop\\test.txt");Scanner sc = new Scanner(fi)) {
            // sc = new Scanner(fi);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a / c);
        }
       
    } 

    public static void main(String[] args) {
        try{

            Divide();
        }
        catch(Exception e){
            System.out.println(e);
        }

        // int x = sc.nextInt();

        System.out.println("bye");

    }
}
