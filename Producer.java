public class Producer implements Runnable {

    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            int value = 1;
            while (true) {
                buffer.produce(value++);
                Thread.sleep(1000); // simulate production time
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
