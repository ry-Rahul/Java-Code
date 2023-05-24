
import java.util.Date;
public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date("7/26/2023");

        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getYear()+1900);
    }
}
