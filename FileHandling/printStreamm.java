import java.io.*;

class student {
    String name;
    int roll;
    String dept;
}
public class printStreamm {
    public static void main(String[] args)throws Exception {

    FileOutputStream fos = new FileOutputStream("D:/Myjava/student1.txt");
    PrintStream ps = new PrintStream(fos);
    
    student s = new student();
    s.name = "Rahul";
    s.roll = 101;
    s.dept = "CSE";

    ps.println(s.name);
    ps.println(s.roll);
    ps.println(s.dept);

    ps.close();
    fos.close();
    }
}
