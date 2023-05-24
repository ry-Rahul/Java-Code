import java.lang.Thread;

class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " Hello I am thread");
            i++;
            // try {
                // Thread.sleep(500);
            // } catch (InterruptedException e) {
            //     System.out.println(e);
            // }
        }
    }
    
}

public class DaemonYieldJoin {
    public static void main(String[] args) throws  Exception{
        MyThread t = new MyThread("My Thread 1");
        // t.setDaemon(true);
        t.start();
        // Thread mainThread = Thread.currentThread();
        // mainThread.join();

        int i = 1;
        while (true) {
            System.out.println(i++ + " Main ");
            Thread.yield();
        }
    }
}
