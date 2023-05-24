import java.util.*;
import java.time.*;
public class jodaAPI {
  public static void main(String[] args) {
    // Date d = new Date();
    // d.setHours(10);
    // System.out.println(d);

    // LocalDate dt = LocalDate.now();
    // System.out.println(dt);

    // LocalDate d = LocalDate.ofEpochDay(1000);
    // System.out.println(d);

        LocalDate d = LocalDate.parse("2023-07-26");
        LocalDate d1 = d.plusDays(6);
        System.out.println(d1);

        LocalTime t = LocalTime.now();
        System.out.println(t);
        LocalTime t1 = t.minusHours(3);
        System.out.println(t1);

  }
    
}
