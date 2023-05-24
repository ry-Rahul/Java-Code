import java.io.*;

class Producer extends Thread {
    OutputStream os;

    public Producer(OutputStream os) {
        this.os = os;
    }

    public void run() {
        int count = 1;
        while (true) {
            try {
                os.write(count);
                os.flush();
                System.out.println("Producer: " + count);
                System.out.flush();
                count++;
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Consumer extends Thread
{
    InputStream is;

    public Consumer(InputStream is)
    {
        this.is = is;
    }

    public void run() {
        int x;
        while (true) {
            try {
               
                x = is.read();
                System.out.println("Consumer: " + x);
                System.out.flush();
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class pipedStream {
    public static void main(String[] args)throws Exception {
        
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
   
        pos.connect(pis);

        Producer producer = new Producer(pos);
        Consumer consumer = new Consumer(pis);

        producer.start();
        consumer.start();
    }
}
