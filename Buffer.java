import java.util.LinkedList;
import java.util.Queue;

public class Buffer {

    private Queue<Integer> queue = new LinkedList<>();
    private int capacity = 5;

    public synchronized void produce(int value) throws InterruptedException {

        while (queue.size() == capacity) {
            System.out.println("Buffer full, Producer waiting...");
            wait();
        }

        queue.add(value);
        System.out.println("Produced: " + value);

        notify();
    }

    public synchronized int consume() throws InterruptedException {

        while (queue.isEmpty()) {
            System.out.println("Buffer empty, Consumer waiting...");
            wait();
        }

        int value = queue.poll();
        System.out.println("Consumed: " + value);

        notify();
        return value;
    }
}
