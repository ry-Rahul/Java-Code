class student {
    public int roll;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total() {
        return (m1 + m2 + m3);
    }

    public double average() {
        return total() / 3.0;
    }

    public String grade() {
        if (average() >= 70) {
            return "A";
        } else if (average() >= 60 && average() < 70) {
            return "B";
        } else if (average() >= 50 && average() < 60) {
            return "C";
        } else if (average() >= 40 && average() < 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // ? tostring method for printing all the details of student by passing object
    // of student class in
    public String toString() {
        return "Roll no. of student is " + roll + "\n" + "Name of student is " + name + "\n" + "Course of student is "
                + course;
    }
    // ? gajab method hai yar bas object pass kro fir dekho kamal sab ek hi bar me
    // print ho jata hai
}

public class Studentclass {
    public static void main(String[] args) {

        student s1 = new student();
        s1.roll = 07;
        s1.name = "Rahul";
        s1.course = "B.Tech";
        s1.m1 = 80;
        s1.m2 = 90;
        s1.m3 = 100;
        System.out.println("Roll no. of student is " + s1.roll);
        System.out.println("Name of student is " + s1.name);
        System.out.println("Course of student is " + s1.course);

        System.out.println("Total marks of student is " + s1.total());
        System.out.println("Average marks of student is " + s1.average());
        System.out.println("Grade of student is " + s1.grade());

        System.out.println("\nDetails of student is " + s1);

    }
}
