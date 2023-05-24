
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Calander {
    public static void main(String[] args) {
        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.isLeapYear(2023));
        System.out.println(g.get(GregorianCalendar.DAY_OF_MONTH));

        TimeZone tz = g.getTimeZone();
        System.out.println(tz.getDisplayName(false, 0, null));
    }
} 
