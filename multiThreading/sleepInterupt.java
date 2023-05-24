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
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    
}

public class sleepInterupt {
    public static void main(String[] args) throws  Exception{
        MyThread t = new MyThread("My Thread 1");
        t.start();
        t.interrupt();


    }
}
