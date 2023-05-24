// package javaPrograms.multiThreading;
import java.lang.Thread;

class myThread extends Thread {
    public void run() {
        int i = 1;
        // sleep(500);
        while (true) {
            System.out.println(i + " Hello I am thread");
            i++;
        }
    }
}

public class thread {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.start();

        int i = 0;
        while (true) {
            // sleep(500);
            System.out.println(i + " i am in Main");
            i++;
        }


    }
}
