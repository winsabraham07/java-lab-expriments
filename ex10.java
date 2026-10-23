
class Buffer {
    int data;
    boolean available = false;
    synchronized void produce(int value)
            throws InterruptedException {
        while (available) {
            wait();
        }
        data = value;
        System.out.println("Produced: " + data);
        available = true;
        notify();
    }
    synchronized void consume()
            throws InterruptedException {
        while (!available) {
            wait();
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}

class Producer extends Thread {
    Buffer b;

    Producer(Buffer b) {
        this.b = b;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                b.produce(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer extends Thread {
    Buffer b;
    Consumer(Buffer b) {
        this.b = b;
    }
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                b.consume();
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer b = new Buffer();
        Producer p = new Producer(b);
        Consumer c = new Consumer(b);
        p.start();
        c.start();
    }
}
