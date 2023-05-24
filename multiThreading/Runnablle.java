import java.util.*;
import java.lang.Thread;
import java.lang.Runnable;
public class Runnablle implements Runnable {
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println(i+" Hello I am thread");
            i++;
        }
    }
    public static void main(String[] args) {
        Runnablle r1 = new Runnablle();
        Thread t1 = new Thread(r1);
        t1.start();

        int i = 0;
        while (i < 10) {
            System.out.println(i+" i am in Main");
            i++;
        }
    }
}
