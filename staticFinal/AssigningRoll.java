import java.util.*;
class Student {
    private String rollNo;
    // !static variable is shared by all objects
    private static int count = 1;

    private String assigningRoll() {
        Date d = new Date();
        String roll = "Univ-" + (d.getYear() + 1900) + "-" + count;
        count++;
        return roll;
    }

    public Student() {
        rollNo = assigningRoll();
    }
    
    public String getRollNo() {
        return rollNo;
    }

}

public class AssigningRoll {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());
    }
}
